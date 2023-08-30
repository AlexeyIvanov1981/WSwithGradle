package cingo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class Config {
    @BeforeAll
    static void browserSettings() {
        Configuration.browser = "FIREFOX";
        Configuration.startMaximized = true;
    }

    public int randomNumber(int minValue, int maxValue) {
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
}
