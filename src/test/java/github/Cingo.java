package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Cingo {
    @BeforeAll
    static void browserSettings() {
        Configuration.browser = "FIREFOX";
        Configuration.startMaximized = true;
    }

    @Test
    void registerForCingo() {
        open("https://app.dev.cingo.co/");

        $("#__next > div.mantine-Container-root.mantine-1yo1d0s > div.mantine-xsyj9d > div.mantine-az0d1n > " +
                "form > div.mantine-xnxn5m > div.mantine-1avyp1d > a").click();
        $(byText("Welcome to Cingo")).shouldBe(Condition.visible);

        $("form > div > div > div > div > input.mantine-Input-input").setValue("12121212112");

    }
}
