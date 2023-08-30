package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FindSolntsev {
    @BeforeAll
    static void chooseBrowser() {
        Configuration.browser = "FIREFOX";
        Configuration.startMaximized = true;
    }
    @Test
    void find() {
        open("https://github.com/selenide/selenide");

        $(".Layout-sidebar").$(byText("Contributors")).closest("div")
                .$("ul li").hover();

        $(".Layout-sidebar .BorderGrid-cell ul li").hover();

        sleep(5000);
    }
}
