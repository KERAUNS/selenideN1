import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.conditions.Text.text;

import com.codeborne.selenide.Condition;
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
    void selenideWikiGitCheckSoftAssertions () {
        open("/selenide/selenide");
        $("#wiki-tab").click();

        //open("/selenide/selenide/wiki");
    }
};