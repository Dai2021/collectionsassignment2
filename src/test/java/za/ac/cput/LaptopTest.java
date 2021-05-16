package za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author Asanda Mabaso
 * Student no:205049990
 */


public class LaptopTest {

    @Test
    void testSetData() {
        TechEquipment sPhone = new Models();
        Assertions.assertTrue(sPhone.Laptops().contains("Apple MacBook Air M1"));
    }

    @Test
    void testSetSize()
    {
        TechEquipment lTop2 = new Models();
        Assertions.assertEquals(5, lTop2.Laptops().size());
    }

    @Test
    void RemoveSetObject()
    {
        TechEquipment lTop3 = new Models();
        Assertions.assertTrue(lTop3.Laptops().remove("Dell XPS 15"));

    }
}

