package modelsTest;

import models.Journal;
import models.Planner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlannerTest {


    @Test
    public void constructorTest() {
        //given
        int expectedId = 6;
        String expectedType = "Weekly";
        String expectedBrand = "Happy Planner";
        int expectedSize = 8;
        int expectedQty = 1000;
        double expectedPrice = 50.00;

        //when
       Planner testPlanner  = new Planner(expectedId, expectedType, expectedBrand, expectedSize, expectedQty, expectedPrice);


        //then
        Assertions.assertEquals(expectedId, testPlanner.getId());
        Assertions.assertEquals(expectedType, testPlanner.getType());
        Assertions.assertEquals(expectedBrand, testPlanner.getBrand());
        Assertions.assertEquals(expectedSize, testPlanner.getSize());
        Assertions.assertEquals(expectedQty, testPlanner.getQty());
        Assertions.assertEquals(expectedPrice, testPlanner.getPrice());

    }

    @Test
    public void setBrandTest() {
        // given
        String expectedBrand = "Archer and Olive";

        // when
        Planner newPlanner = new Planner();
        newPlanner.setBrand(expectedBrand);

        // then
        Assertions.assertEquals(expectedBrand, newPlanner.getBrand());
    }


}
