import helpers.Common;
import org.junit.Test;
import pages.HomePage;
import pages.LoginForm;

public class ProfileChangesPom extends Common {

    Common common = new Common();
    HomePage homePage = new HomePage();
    LoginForm loginForm = new LoginForm();

    @Test
    public void fillLoginForm() {
        common.startChrome();
        homePage.openLoginPage();
        homePage.maximizeWindow();
        loginForm.fillLoginForm("esrphfgkewruurwjhh@twzhhq.com", "test1234");
        loginForm.submitLoginInformation();
        loginForm.changeProfileInformation();
        loginForm.selectNameField("AAAAA");
        loginForm.selectSurnameField("BBBBB");
        loginForm.selectBirthDate("11");
        loginForm.selectBirthMonth("Marts");
        loginForm.selectBirthYear("1991");
        loginForm.acceptChanges();
        //common.stopChrome();
   }
}
