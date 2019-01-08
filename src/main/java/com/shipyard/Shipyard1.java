package com.shipyard;

import com.shipyard.materials.Copper;
import com.shipyard.materials.Iron;
import com.shipyard.materials.Material;
import com.shipyard.materials.Steel;
import com.shipyard.spaceships.Spaceship;

import java.util.ArrayList;
import java.util.List;

public class Shipyard1 implements Shipyard {

    List<Copper> copper = new ArrayList<>();
    List<Steel> steel = new ArrayList<>();
    List<Iron> iron = new ArrayList<>();


    public void loadMaterials(List<Material> materials) {

        for (Material material : materials) {
            if (material instanceof Copper) {
                copper.add((Copper) material);
            }
            if (material instanceof Steel) {
                steel.add((Steel) material);
            }
            if (material instanceof Iron) {
                iron.add((Iron) material);
            }
        }
    }


    public List<Spaceship> buildSpaceShips() {
        return null;
    }


}
