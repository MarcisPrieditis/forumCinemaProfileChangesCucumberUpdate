package pages;

import helpers.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {



    public void openLoginPage() {
        driver.get("https://www.forumcinemas.lv/mypage/logon/");
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

}


