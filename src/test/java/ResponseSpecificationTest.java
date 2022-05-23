import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.System.getProperty;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResponseSpecificationTest extends TestBase{
    private DataCreator dataCreator = new DataCreator();

    @Test
    public void shouldGetCoordLon() {
        DataStore.COORD_LON = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("coord.lon");
        assertThat(DataStore.COORD_LON).isEqualTo(parseFloat(getProperty("coordLon")));
    }

    @Test
    public void shouldGetCoordLat() {
        DataStore.COORD_LAT = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("coord.lat");
        assertThat(DataStore.COORD_LAT).isEqualTo(parseFloat(getProperty("coordLat")));
    }

    @Test
    public void shouldGetWeatherId() {
        DataStore.WEATHER_ID = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("weather[0].id");
        assertThat(DataStore.WEATHER_ID).isEqualTo(parseInt(getProperty("weatherId")));
    }

    @Test
    public void shouldGetWeatherMain() {
        DataStore.WEATHER_MAIN = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("weather[0].main");
        assertThat(DataStore.WEATHER_MAIN).isEqualTo(getProperty("weatherMain"));
    }

    @Test
    public void shouldGetWeatherDescription() {
        DataStore.WEATHER_DESCRIPTION = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("weather[0].description");
        assertThat(DataStore.WEATHER_DESCRIPTION).isEqualTo(getProperty("weatherDescription"));
    }

    @Test
    public void shouldGetWeatherIcon() {
        DataStore.WEATHER_ICON = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("weather[0].icon");
        assertThat(DataStore.WEATHER_ICON).isEqualTo(getProperty("weatherIcon"));
    }

    @Test
    public void shouldGetWindSpeed() {
        DataStore.WIND_SPEED = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("wind.speed");
        assertThat(DataStore.WIND_SPEED).isEqualTo(parseFloat(getProperty("speed")));
    }

    @Test
    public void shouldGetWindDeg() {
        DataStore.WIND_DEG = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("wind.deg");
        assertThat(DataStore.WIND_DEG).isEqualTo(parseInt(getProperty("deg")));
    }

    @Test
    public void shouldGetBase() {
        DataStore.BASE = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("base");
        assertThat(DataStore.BASE).isEqualTo(getProperty("base"));
    }

    @Test
    public void shouldGetTemp() {
        DataStore.TEMP = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("main.temp");
        assertThat(DataStore.TEMP).isEqualTo(parseFloat(getProperty("temp")));
    }

    @Test
    public void shouldGetPressure() {
        DataStore.PRESSURE = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("main.pressure");
        assertThat(DataStore.PRESSURE).isEqualTo(parseInt(getProperty("pressure")));
    }

    @Test
    public void shouldGetHumidity() {
        DataStore.HUMIDITY = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("main.humidity");
        assertThat(DataStore.HUMIDITY).isEqualTo(parseInt(getProperty("humidity")));
    }

    @Test
    public void shouldGetTempMin() {
        DataStore.TEMP_MIN = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("main.temp_min");
        assertThat(DataStore.TEMP_MIN).isEqualTo(parseFloat(getProperty("temp_min")));
    }

    @Test
    public void shouldGetTempMax() {
        DataStore.TEMP_MAX = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("main.temp_max");
        assertThat(DataStore.TEMP_MAX).isEqualTo(parseFloat(getProperty("temp_max")));
    }

    @Test
    public void shouldGetVisibility() {
        DataStore.VISIBILITY = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("visibility");
        assertThat(DataStore.VISIBILITY).isEqualTo(parseInt(getProperty("visibility")));
    }

    @Test
    public void shouldGetCloudsAll() {
        DataStore.VISIBILITY = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("clouds.all");
        assertThat(DataStore.CLOUDS_ALL).isEqualTo(parseInt(getProperty("cloudsAll")));
    }

    @Test
    public void shouldGetDt() {
        DataStore.DT = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("dt");
        assertThat(DataStore.DT).isEqualTo(parseInt(getProperty("dt")));
    }

    @Test
    public void shouldGetSysType() {
        DataStore.SYS_TYPE = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("sys.type");
        assertThat(DataStore.SYS_TYPE).isEqualTo(parseInt(getProperty("sysType")));
    }

    @Test
    public void shouldGetSysId() {
        DataStore.SYS_ID = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("sys.id");
        assertThat(DataStore.SYS_ID).isEqualTo(parseInt(getProperty("sysId")));
    }

    @Test
    public void shouldGetSysMessage() {
        DataStore.SYS_MESSAGE = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("sys.message");
        assertThat(DataStore.SYS_MESSAGE).isEqualTo(parseFloat(getProperty("sysMessage")));
    }

    @Test
    public void shouldGetSysCountry() {
        DataStore.SYS_COUNTRY = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("sys.country");
        assertThat(DataStore.SYS_COUNTRY).isEqualTo(getProperty("sysCountry"));
    }

    @Test
    public void shouldGetSysSunrise() {
        DataStore.SYS_SUNRISE = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("sys.sunrise");
        assertThat(DataStore.SYS_SUNRISE).isEqualTo(parseInt(getProperty("sysSunrise")));
    }

    @Test
    public void shouldGetSysSunset() {
        DataStore.SYS_SUNSET = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("sys.sunset");
        assertThat(DataStore.SYS_SUNSET).isEqualTo(parseInt(getProperty("sysSunset")));
    }

    @Test
    public void shouldGetId() {
        DataStore.ID = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("id");
        assertThat(DataStore.ID).isEqualTo(parseInt(getProperty("id")));
    }

    @Test
    public void shouldGetName() {
        DataStore.NAME = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("name");
        assertThat(DataStore.NAME).isEqualTo(getProperty("name"));
    }

    @Test
    public void shouldGetCod() {
        DataStore.COD = given(dataCreator.createRequestSpecification()).
        when().
                get("https://samples.openweathermap.org/data/2.5/weather").
        then().
                spec(dataCreator.createResponseSpecification()).
                extract().
                path("cod");
        assertThat(DataStore.COD).isEqualTo(parseInt(getProperty("cod")));
    }
}




