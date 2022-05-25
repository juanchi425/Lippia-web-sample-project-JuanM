package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;

import  org.testng.Assert;
import static lippia.web.constants.AutomationPracticeConstants.*;

import static com.crowdar.core.actions.WebActionManager.navigateTo;


public class AutomationPracticeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccount(){
        click(BTN_MYACCOUNT_ID);
    }
    public static void completarUsername(String username){
        setInput(INPUT_USERNAME_ID,username);
    }
    public static void completarPassword(String password){
        setInput(INPUT_PASSWORD_ID,password);
    }
    public static void clickLoginBtn(){
        click(BTN_LOGIN_XPATH);
    }
    public static void verificarLogin(){Assert.assertTrue(isVisible(BTN_LOGOUT_XPATH));}

    //SEGUNDO TEST

    public static void clickShop(){
           click(BTN_SHOP_ID);
    }
    public static void clickProductSelenium(){
        click(PRODUT_SELENIUM_CLASS);
    }
    public static void verificaProduct(){
        Assert.assertTrue(isVisible(TEXT_SELENIUM_CLASS));
    }


    //TERCER TEST

    public static void  clickMenuDesplegable(){
        click(BTN_DESPLEGABLE_CLASS);
    }
    public static void clickOptionPopulary(){
        click(BTN_OPTION_POPULARITY_XPATH);
    }
    public static void verificarProductPopulares(){
        Assert.assertTrue(isVisible(PRODUT_SELENIUM_CLASS));
    }


}
