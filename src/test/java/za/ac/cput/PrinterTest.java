package za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author Asanda Mabaso
 * Student no:205049990
 */

public class PrinterTest {

    @Test
    void testMapData() {
        TechEquipment printer = new Models();
        Assertions.assertEquals("Canon imageRUNNER 2630i", printer.Printers().get("MFP1"));
    }

    @Test
    void testMapSize(){
        TechEquipment printer2 = new Models();
        Assertions.assertEquals(5, printer2.Printers().size());
    }

    @Test
    void testMapRemove(){
        TechEquipment printer3 = new Models();
        Assertions.assertEquals("HP Laser 137fnw", printer3.Printers().remove("MFP3"));
    }

}

