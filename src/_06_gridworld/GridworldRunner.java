package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {

	public static void main(String[] args) {

		World world0 = new World();
		world0.show();
		
		Bug bug0 = new Bug();
		Location location0 = new Location(5, 5);
		world0.add(location0, bug0);
		
				
	}

}
