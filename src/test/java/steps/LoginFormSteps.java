package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginForm;

public class LoginFormSteps {

    LoginForm loginForm = new LoginForm();

    @And("^Fill username input (.*) and password (.*)$")
    public void fillUsernameInputAndPassword(String username, String password) {
        loginForm.fillLoginForm(username, password);
    }

    @And("Press login button")
    public void pressLoginButton() {
        loginForm.submitLoginInformation();;
    }

    @When("Opens user information panel")
    public void opensUserInformationPanel() {
        loginForm.changeProfileInformation();
    }

    @And("^Change users Name to (AAAAA)$")
    public void changeUsersNameToAAAAA(String userName) {
        loginForm.selectNameField(userName);
    }

    @And("^Change users Surname to (BBBBB)$")
    public void changeUsersSurnameToBBBBB(String userSurname) {
        loginForm.selectSurnameField(userSurname);
    }

    @And("^Change users Birth date to (1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16)$")
    public void changeUsersBirthDate(String birthDate) {
        loginForm.selectBirthDate(birthDate);
    }


    @And("^Change users Birth month (Janvaris|Februaris|Marts|Aprilis|Maijs|Junijs|Julijs|Augusts|Septembris|Oktobris|Novembris|Decembris)$")
    public void changeUsersBirthMonthNovember(String birthMonth) {
        loginForm.selectBirthMonth(birthMonth);
    }

    @And("^Change user Birth year (1990|1991|1992|1993|1994|1995|1996|1997|1998|1999|2000|2001)$")
    public void changeUserBirthYear(String birthYear) {
        loginForm.selectBirthYear(birthYear);
    }

    @And("Scroll webpage down")
    public void scrollWebpageDown() {
        loginForm.scrollPageDown();
    }

    @Then("Save the new information")
    public void saveTheNewInformation() {
        loginForm.acceptChanges();
    }


}
