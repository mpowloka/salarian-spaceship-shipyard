package com.shipyard;

import com.shipyard.materials.Material;
import com.shipyard.materials.Steel;
import com.shipyard.spaceships.Spaceship;
import com.shipyard.materials.Copper;
import com.shipyard.materials.Iron;


import java.util.ArrayList;
import java.util.List;

public class Shipyard1 implements Shipyard {

    List<Material> materialList = new ArrayList<>();
    List<Copper> copper = new ArrayList<>();
    List<Steel> steel = new ArrayList<>();
    List<Iron> iron = new ArrayList<>();



    public void loadMaterials(List<Material> materials){


    }


    public List<Spaceship> buildSpaceShips() {
        return null;
    }


}
