package steps;

import cucumber.api.java.en.And;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @And("Opens forum cinema login page")
    public void opensForumCinemaLoginPage() {
        homePage.openLoginPage();
    }

    @And("Maxime chrome window")
    public void maximeChromeWindow() {
        homePage.maximizeWindow();
    }
}
