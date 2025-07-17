package Steps;

import Pages.DocumentsPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.TakeScreenShots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("edge", "https://amendmentsweb-sit-autogen.telesuredigital.co.za/login");

    LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
    DocumentsPage documentsPage = PageFactory.initElements(driver, DocumentsPage.class);

    TakeScreenShots takeScreenShots = new TakeScreenShots();

}
