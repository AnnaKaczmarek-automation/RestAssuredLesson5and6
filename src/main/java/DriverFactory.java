import browser.BrowsersTemplate;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Map;

public class DriverFactory {
    Logger log = LoggerFactory.getLogger("DriverFactory.class");
    private WebDriver driver;

    public DriverFactory() {
    }

    public WebDriver getDriver() {
        WebDriver driver;
        switch (System.getProperty("browserName")) {
            case "chrome":
                ChromeOptions optionsChrome = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                optionsChrome.addArguments("start-maximized");
                driver = new ChromeDriver(optionsChrome);
                driver.get(System.getProperty("appUrl"));
                break;
            case "firefox":
                FirefoxOptions optionsFirefox = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                optionsFirefox.addArguments("start-maximized");
                driver = new FirefoxDriver(optionsFirefox);
                driver.get(System.getProperty("appUrl"));
                break;
            default:
                InternetExplorerOptions optionsdefault = new InternetExplorerOptions();
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver(optionsdefault);
                driver.get(System.getProperty("appUrl"));
        }
        this.driver = driver;
        return this.driver;
    }


    private void setSampleValuesForBrowserProperties() {
        YamlReader yamlReader = new YamlReader();
        Map<String, Object> browserProperties = yamlReader.getConfiguration().getBrowser().getProperties();
        for (Map.Entry entry : browserProperties.entrySet()) {
            System.getProperty(entry.getKey().toString(), entry.getValue().toString());
        }
    }
}
