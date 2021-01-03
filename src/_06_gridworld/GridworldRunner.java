package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {

	public static void main(String[] args) {

		World world0 = new World();
		world0.show();
		
		Bug bug0 = new Bug();
		Location location0 = new Location(5, 5);
		world0.add(location0, bug0);
		bug0.turn();
		bug0.turn();
		
		Flower flower0 = new Flower();
		Location location1 = new Location(5, 4);
		world0.add(location1, flower0);
		
		Flower flower1 = new Flower();
		Location location2 = new Location(5, 6);
		world0.add(location2, flower1);
		
		
		
				
	}

}
