import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.codehaus.groovy.ast.tools.GeneralUtils.param;

public class ResponseSpecificationTest extends TestBase{
    private DataCreator dataCreator = new DataCreator();

    @Test
    public void weather2RequestSpecification() {

        given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification());

    }



    //zadanie domowe: zrobić tak, żeby tworzenie obiektów responce i request było gdzieś indziej a wartości były podane w yamlu (jakaś inna klasa ma tworzyć te obiekty)
    //można też zrobić walidację responsa dla treści - można to dodać


//    public void Weather_Lekcja3(){//to jest chyba klas
//
//        String requestBody =
//                {
//
//                }
//        Map<String, String> studentMap = new HashMap<>();
//
//        //stworzenie klasy modelowej student.model na podstawie dokumentacji.pola, konstruktor, gettery, settery
//
//        Student studentObj; //sama deklaracja, żeby mieć to w dostepie ogólnym
//
//
//
//    }
}




