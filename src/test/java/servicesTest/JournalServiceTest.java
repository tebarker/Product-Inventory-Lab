package servicesTest;

import models.Journal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.JournalService;

public class JournalServiceTest {


    @Test
    public void createTest() {




            //given
        int expectedId = 23;
        String expectedType = "Dot Grid";
        String expectedBrand = "Archie Olive";
        int expectedQty = 1500;
        int expectedSize = 10;
        double expectedPrice = 45.50;

        //when
        JournalService journalService = new JournalService();
        Journal testJournal = JournalService.create(expectedId, expectedType, expectedBrand, expectedSize, expectedQty,expectedPrice);

   testJournal.setId(expectedId);
        testJournal.setType(expectedType);
      testJournal.setBrand(expectedBrand);
        testJournal.setSize(expectedSize);
        testJournal.setQty(expectedQty);
        testJournal.setPrice(expectedPrice);


        //then
        int actualId = testJournal.getId();
        String actualType = testJournal.getType();
        String actualBrand = testJournal.getBrand();
        int actualSize = testJournal.getSize();
        int actualQty = testJournal.getQty();
        double actualPrice = testJournal.getPrice();


        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedType, actualType);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }
}


