import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.given;

public class DataCreator {

    Logger log = LoggerFactory.getLogger("DataCreator");

    public RequestSpecification createRequestSpecification(){
        RequestSpecification specification = given().
                header("name", System.getProperty("name")).
                param("q", System.getProperty("cityName")).
                param("appid",System.getProperty("idNumber"));
        return specification;
    }

    public ResponseSpecification createResponseSpecification(){
        ResponseSpecification responseSpecification = RestAssured.expect();
        responseSpecification.time(Matchers.lessThan(5000L));
        responseSpecification.contentType(ContentType.JSON);
        responseSpecification.statusCode(200);
        return responseSpecification;
    }
}
