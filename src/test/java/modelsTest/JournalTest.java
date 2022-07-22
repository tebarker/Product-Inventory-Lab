package modelsTest;

import models.Journal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JournalTest {
    @Test
    public void setBrandTest() {
        // given
        String expectedBrand = "Erin Condren";

        // when
        Journal newJournal = new Journal();
        newJournal.setBrand(expectedBrand);

        // then
        Assertions.assertEquals(expectedBrand, newJournal.getBrand());
    }

    @Test
    public void setIdTest(){
        //given
        int expectedId = 2;

        //when
        Journal testJournal = new Journal();
        testJournal.setId(expectedId);

        //then
        Assertions.assertEquals(expectedId, testJournal.getId());

    }

    @Test
    public void constructorTest() {
        //given
        int expectedId = 6;
        String expectedType = "Dot Grid";
        String expectedBrand = "Archie Olive";
        int expectedSize = 8;
        int expectedQty = 1000;
        double expectedPrice = 35.53;

        //when
      Journal testJournal  = new Journal (expectedId, expectedType, expectedBrand, expectedSize, expectedQty, expectedPrice);


        //then
        Assertions.assertEquals(expectedId, testJournal.getId());
        Assertions.assertEquals(expectedType, testJournal.getType());
        Assertions.assertEquals(expectedBrand, testJournal.getBrand());
        Assertions.assertEquals(expectedSize, testJournal.getSize());
        Assertions.assertEquals(expectedQty, testJournal.getQty());
        Assertions.assertEquals(expectedPrice, testJournal.getPrice());

    }
}
