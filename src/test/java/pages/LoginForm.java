package pages;

import helpers.Common;
import javafx.scene.web.WebEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginForm extends Common {

    private final By username = By.id("input-userName");
    private final By password = By.id("input-password");
    private final By submitLogin = By.xpath("//*[@id=\"layout-left\"]/div[2]/div/div/div/form/div/button");
    private final By profileInformationButton = By.xpath("//*[@id=\"layout-top\"]/div/div/ul/li[2]/a");
    private final By nameField = By.xpath("//*[@id=\"inputFirstName\"]");
    private final By surnameField = By.xpath("//*[@id=\"inputLastName\"]");
    private final By birthDateSelector = By.xpath("//*[@id=\"bdDay\"]");
    private final By birthMonthSelector = By.xpath("//*[@id=\"bdMonth\"]");
    private final By birthYearSelector = By.xpath("//*[@id=\"bdYear\"]");
    private final By acceptSelectedChanges = By.xpath("//*[@id=\"layout-left\"]/div/div/div/form/button");

    public void fillLoginForm(String yourUsername, String yourPassword){
        driver.findElement(username).sendKeys(yourUsername);
        driver.findElement(password).sendKeys(yourPassword);

    }

    public void submitLoginInformation() {driver.findElement(submitLogin).click();}
    public void changeProfileInformation() {driver.findElement(profileInformationButton).click();}

    //Profile information field changes
    public void selectNameField(String newName) {
        WebElement ele = driver.findElement(nameField);
        Actions act = new Actions(driver);
        act.doubleClick(ele).perform();
        ele.sendKeys(newName);
    }

    public void selectSurnameField(String newSurname) {
        WebElement ele = driver.findElement(surnameField);
        Actions act = new Actions(driver);
        act.doubleClick(ele).perform();
        ele.sendKeys(newSurname);
    }

    public void selectBirthDate(String chooseBirthDate){
        Select selectBirthDate = new Select(driver.findElement(birthDateSelector));
        if("1".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("1");
        } else if("2".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("2");
        } else if("3".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("3");
        } else if("4".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("4");
        } else if("5".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("5");
        } else if("6".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("6");
        } else if("7".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("7");
        } else if("8".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("8");
        } else if("9".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("9");
        } else if("10".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("10");
        } else if("11".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("11");
        } else if("12".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("12");
        } else if("13".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("13");
        } else if("14".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("14");
        } else if("15".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("15");
        } else if("16".equals(chooseBirthDate)){
            selectBirthDate.selectByValue("16");
        }  //Es saprotu, ka vajag visus datumus, ka ari pec tam gadiem tapat, bet sobrid galvenais saprast kaa uztaisit,
        //tapec visus neliku ieksaa, lai nav super gars fails, un ari lai pats sev laiku ieekonometu bez liekas copy paste
    }

    public void selectBirthMonth(String chooseBirthMonth){
        Select selectBirthMonth = new Select(driver.findElement(birthMonthSelector));
        if("Janvaris".equals(chooseBirthMonth)) {
            selectBirthMonth.selectByValue("1");
        } else if("Februaris".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("2");
        } else if("Marts".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("3");
        } else if("Aprilis".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("4");
        } else if("Maijs".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("5");
        } else if("Junijs".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("6");
        } else if("Julijs".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("7");
        } else if("Augusts".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("8");
        } else if("Septembris".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("9");
        } else if("Oktobris".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("10");
        } else if("Novembnris".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("11");
        } else if("Decembris".equals(chooseBirthMonth)){
            selectBirthMonth.selectByValue("12");
        }
    }

    public void selectBirthYear(String chooseBirthYear){
        Select selectBirthYear = new Select(driver.findElement(birthYearSelector));
        if("1990".equals(chooseBirthYear)) {
            selectBirthYear.selectByValue("1990");
        } else if("1991".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("1991");
        } else if("1992".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("1992");
        } else if("1993".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("1993");
        } else if("1994".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("1994");
        } else if("1995".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("1995");
        } else if("1996".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("1996");
        } else if("1997".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("1997");
        } else if("1998".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("1998");
        } else if("1999".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("1999");
        } else if("2000".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("2000");
        } else if("2001".equals(chooseBirthYear)){
            selectBirthYear.selectByValue("2001");
        }
    }

    //JavascriptExecutor to scroll down webpage to specific element
    public void scrollPageDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"layout-left\"]/div/div/div/form/button"));
        js.executeScript("arguments[0].scrollIntoView();", acceptButton);
    }

    public void acceptChanges() {
        driver.findElement(acceptSelectedChanges).click();
    }

}
