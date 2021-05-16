package za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author Asanda Mabaso
 * Student no:205049990
 */

class WearableTest {

    @Test
    void testListData()
    {
        TechEquipment wear = new Models();
        Assertions.assertTrue(wear.Wearables().contains("Huawei Watch GT2"));
    }

    @Test
    void testListSize()
    {
        TechEquipment wear2 = new Models();
        Assertions.assertEquals(5, wear2.Wearables().size());
    }

    @Test
    void RemoveListObject()
    {
        TechEquipment wear3 = new Models();
        Assertions.assertTrue(wear3.Wearables().remove("Apple Watch Series 6"));
    }
}


