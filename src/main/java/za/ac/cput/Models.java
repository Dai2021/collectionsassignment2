package za.ac.cput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author Asanda Mabaso
 * Student no:205049990
 */


public class Models implements TechEquipment{


    public Models() {

    }

    @Override
    public Set<String> Laptops()
    {
        Set  lTop = new HashSet();

        lTop.add("Apple MacBook Air M1");
        lTop.add("Apple MacBook Pro 2019");
        lTop.add("Dell XPS 15");               //Laptop Models
        lTop.add("HP Spectre x360");
        lTop.add("HP Elite Dragonfly");

        return lTop;
    }

    @Override
    public Map<String, String> Printers()
    {
        Map printer = new HashMap();

        printer.put("MFP1", "Canon imageRUNNER 2630i");
        printer.put("MFP2", "Canon MAXIFY MB5440");
        printer.put("MFP3", "HP Laser 137fnw");                        // MFP Printers
        printer.put("MFP4", "HP Colour LJ 179fnw");
        printer.put("MFP5", "Konica Minolta Bizhub c364");

        return printer;

    }

    @Override
    public List<String> Wearables()
    {

        ArrayList<String> wear = new ArrayList<String>();

        wear.add("Apple Watch Series 6");
        wear.add("Apple Watch Series 5");
        wear.add("Fitbit Versa 3");                            //Wearable Devices
        wear.add("Samsung Galaxy Watch");
        wear.add("Huawei Watch GT2");

        return wear;
    }
}



