package restAssuredTest;


import com.jayway.jsonpath.JsonPath;
import files.Payload;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



public class TestBasics {


    private static final String URL_ACADEMY = "https://rahulshettyacademy.com";
    private static String place_id;

    @Test
    @Order(1)
    public void testPost () {

        String resource = "/maps/api/place/add/json";

        Response response = RestAssured.given().queryParam("key","qaclick123").body(Payload.addPlace()).post(URL_ACADEMY + resource);

        place_id=JsonPath.read(response.asString(),"$.place_id").toString();
                //response.jsonPath().get("place_id").toString();

        System.out.println(place_id);

        System.out.println(String.format("My json place_id: %s, My json id: %s",  place_id,
                response.jsonPath().get("id").toString()));


        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("Apache/2.4.18 (Ubuntu)", response.getHeader("Server"));


    }


    @Test
    @Order(2)
    void testUpdate(){
        String resource = "/maps/api/place/update/json";

        Response response = RestAssured.given().body(Payload.updatePlace(place_id)).put(URL_ACADEMY+resource);
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(3)
    void testGet () {
        String resource = "/maps/api/place/get/json";

        Response response = RestAssured.given().queryParams("key","qaclick123", "place_id", place_id).get(URL_ACADEMY +resource);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("70 winter walk, USA", response.jsonPath().get("address").toString());

    }

    @Test
    @Order(4)
    void testDelete(){
        String resource="/maps/api/place/delete/json";

        Response response = RestAssured.given().queryParams("key", "qaclick123").
                body(Payload.deletePLace(place_id)).delete(URL_ACADEMY + resource);

        Assertions.assertEquals(200,response.statusCode());

    }

}
