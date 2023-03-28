package stepDefinitions.API;
import enums.USER;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Deneme_API {




    Response response;
    Map<String, Object> payload=new HashMap<>();




@Test
    public void deneme1() {
    String developmentPrices = "https://odegdcpnma.execute-api.eu-west-2.amazonaws.com/development/prices?dno=12&voltage=LV&start=26-03-2023&end=27-03-2023";


//    payload.put("dno","12");
//    payload.put("voltage","LV");
//    payload.put("start","26-03-2023");
//    payload.put("end","26-03-2023");
        response = given().
                contentType(ContentType.JSON)
                //body(payload)
                .get(developmentPrices);

        response.prettyPrint();

//    Assert.assertEquals("success",response.jsonPath().getString("status"));
//    Assert.assertEquals("12",response.jsonPath().getString("data.dnoRegion"));
//    Assert.assertEquals("LV",response.jsonPath().getString("data.voltageLevel"));
//    Assert.assertEquals(11.22,response.jsonPath().getDouble("data.data[0].Overall"),0.00);

    }
@Test
    public void deneme2() {
    String developmentPrices = "https://odegdcpnma.execute-api.eu-west-2.amazonaws.com/development/prices?voltage=LV&start=26-03-2023&end=27-03-2023";



        response = given().
                contentType(ContentType.JSON)
                .get(developmentPrices);

        response.prettyPrint();

    Assert.assertEquals("invalid literal for int() with base 10: ''",response.jsonPath().getString("errorMessage"));
    Assert.assertEquals("ValueError",response.jsonPath().getString("errorType"));


    }





    }

