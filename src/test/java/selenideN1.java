import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
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
       open("/selenide/selenide");
        $("#wiki-tab").click();
        $("input#wiki-pages-filter").setValue("SoftAssertions");
        $$("ul.list-style-none.filterable-active li").get(19).$("a").shouldHave(matchText("SoftAssertions")).click();
        $("h1").shouldHave(text("SoftAssertions"));
    }
}