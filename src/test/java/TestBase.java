
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

@Execution(ExecutionMode.CONCURRENT)
public class TestBase {
    protected static WebDriver driver;
    private static Logger log = LoggerFactory.getLogger("TestBase.class");
    protected static ApplicationProperties applicationProperties;
    protected static DriverFactory driverFactory;
    protected static BasePage basePage;

    @BeforeAll
    static void beforeAll() {
        applicationProperties = new ApplicationProperties();
    }

    @BeforeEach
    void beforeEach() {
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver();
        basePage = new BasePage(driver);
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @AfterEach
     void afterEach(){
        //driver.clear;
        driver.quit();
    }

    @AfterAll
    static void tearDown() {

        log.info("***** Driver closed *****");
    }
}
