import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class selenideN1 {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void selenideWikiGitCheckSoftAssertions() {
        String code = "@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}";
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $(new ByText("Soft assertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").shouldHave(Condition.href("#3-using-junit5-extend-test-class"));
       $("#repo-content-turbo-frame").shouldHave(text(code));
    }
};