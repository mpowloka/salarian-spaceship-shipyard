package com.shipyard;

import com.shipyard.materials.Material;
import com.shipyard.spaceships.Spaceship;

import java.util.List;

public interface Shipyard {

    void loadMaterials(List<Material> materials);

    List<Spaceship> buildSpaceShips();

}
