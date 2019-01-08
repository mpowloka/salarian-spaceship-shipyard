package com.shipyard;

import com.shipyard.materials.Copper;
import com.shipyard.materials.Iron;
import com.shipyard.materials.Material;
import com.shipyard.materials.Steel;

import java.util.ArrayList;
import java.util.List;

public class Playground{


    // Korzystajcie z tej klasy jako miejsca do testowania.
    public static void main(String[] args) {

        List<Material> list = new ArrayList<>();
        list.add(new Copper());
        list.add(new Copper());
        list.add(new Copper());
        list.add(new Iron());
        list.add(new Steel());


        Shipyard1 ship = new Shipyard1();
        ship.loadMaterials(list);
        System.out.println(ship.copper);
        System.out.println(ship.iron);
        System.out.println(ship.steel);






    }

}
