package restAssuredTest;

import files.Payload;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;


public class TestComplexJsonPath {
 JsonPath js = new JsonPath(Payload.coursePrice());
    JsonPath js1 = new JsonPath(Payload.test1());
    JsonPath js2 = new JsonPath(Payload.test2());

//    Print No of courses returned by API
  @Test
    void coursesAmount(){

        int count = js.get("courses.size()");
        System.out.println("Number of courses is "+count);

    }

    //Print Purchase Amount
    @Test
    void purchaseAmount(){
        int purchAmount=js.get("dashboard.purchaseAmount");
        System.out.println("Purchase amount "+purchAmount);
    }

    //Print Title of the first course
    @Test
    void titleOfTheFirstCourse(){
        String title = js.get("courses[0].title").toString();
        System.out.println("Title of the first course is "+title);

    }

    //Print All course titles and their respective Prices
    @Test
    void allCourses(){
        int courseAmount=js.get("courses.size()");
        for (int i=0; i<courseAmount; i++){
            String course = js.get("courses["+i+"].title");
            String price =js.get("courses["+i+"].price").toString();
            System.out.println(course + " " +price);
        }

    }

    //Print no of copies sold by RPA Course
    @Test
    void numberOfCopies(){
        int courseAmount=js.get("courses.size()");
        for (int i=0; i<courseAmount; i++){
            String course = js.get("courses["+i+"].title");
            if(course.equals("RPA")){
                System.out.println(js.get("courses["+i+"].copies").toString());
            }
        }
    }

    //Verify if Sum of all Course prices matches with Purchase Amount
    @Test
    void assertAmount(){
        int courseAmount=js.get("courses.size()");
        int purchAmount=js.get("dashboard.purchaseAmount");
        int actualPurchaseAmount=0;
        for (int i=0; i<courseAmount; i++){
            int price = js.get("courses["+i+"].price");
            int copies = js.get("courses["+i+"].copies");
            actualPurchaseAmount+=(price*copies);
        }
        Assertions.assertEquals(purchAmount,actualPurchaseAmount);
    }

    @Test
    void createdTime(){
//        List <String> json = JsonPath.read(Payload.test1(),"$..eventCreatedTime");
//        System.out.println(json.get(0));

        System.out.println(js1.get("@graph.hmEventMetadata.eventCreatedTime").toString());//
    }

/* @Test
    void createdTime2(){
        List<String> json = JsonPath.read(Payload.test2(),"$..eventCreatedTime");
        System.out.println(json.get(0));
    }*/



}
