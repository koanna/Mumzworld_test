package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver driver;
    public static Properties envConfig;
    WebDriverWait wait;

    public static final String ENV = System.getProperty("env", "Production");

    private static final String BROWSER = System.getProperty("browser", "Chrome");

    @BeforeSuite
    public void suiteSetup() throws Exception {

        //Browser configuration - can add more browsers and remote driver here
        if (BROWSER.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup(); //can also use set property method for browser executables
            driver = new FirefoxDriver();
        }
        else if (BROWSER.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        }
        else if (BROWSER.equals("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        else {
            throw new RuntimeException("Browser type unsupported");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 20);

        InputStream configFile = new FileInputStream(System.getProperty("user.dir") +
                "" + ENV +  ".properties");
        envConfig = new Properties();
        envConfig.load(configFile);

    }

    @BeforeMethod()
    public void loadBaseUrl(Method method) {
        driver.get(envConfig.getProperty("baseUrl"));

    }


    @AfterSuite
    public void suiteTearDown() {
        driver.quit();
    }


}
