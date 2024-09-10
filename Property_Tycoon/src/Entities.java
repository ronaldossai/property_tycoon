

import java.util.ArrayList;

/**
 * @author Ronald Ossai
 * this class is used to deal with collection of Entities
 * It has following fields:
 * entities collection
 * rentValues collection to initialise entities
 * noRent ArrayList to be used in initialising entities, which cannot
 * be purchased
 */
public class Entities {

	private ArrayList <Entity> entities;
	private ArrayList <Double> rentValues;
	private ArrayList <Double> noRent;
	
	/**
	 * Constructor of Entities class, which creates all entities used in the game 
	 */
	public Entities() {
		entities = new ArrayList<Entity>();
		noRent = new ArrayList<Double>();
		noRent.add(0.0);
		rentValues = new ArrayList<Double>();
		rentValues.add(2.0);
		rentValues.add(10.0);
		rentValues.add(30.0);
		rentValues.add(90.0);
		rentValues.add(160.0);
		rentValues.add(250.0);
		entities.add(new Entity("Start", null, 0, noRent, 0, false, -1));
		entities.add(new Entity("Mediterranean Avenue", "brown", 60, rentValues, 1, true, 0));
		entities.add(new Entity("Community chest (1)", null, 0, noRent, 2, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(4.0);
		rentValues.add(20.0);
		rentValues.add(60.0);
		rentValues.add(180.0);
		rentValues.add(320.0);
		rentValues.add(450.0);
		entities.add(new Entity("Baltic Avenue", "brown", 60, rentValues, 3, true, 1));
		entities.add(new Entity("Income Tax", null, 200, noRent, 4, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(25.0);
		entities.add(new Entity("Reading Railroad", "railroads", 200, rentValues, 5, true, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(6.0);
		rentValues.add(30.0);
		rentValues.add(90.0);
		rentValues.add(270.0);
		rentValues.add(400.0);
		rentValues.add(550.0);
		entities.add(new Entity("Oriental Avenue", "lightblue", 100, rentValues, 6,true, 2));
		entities.add(new Entity("Chance (1)", null, 0, noRent, 7, false, -1));
		entities.add(new Entity("Vermont Avenue", "lightblue", 100, rentValues, 8,true, 3));
		rentValues = new ArrayList<Double>();
		rentValues.add(8.0);
		rentValues.add(40.0);
		rentValues.add(100.0);
		rentValues.add(300.0);
		rentValues.add(450.0);
		rentValues.add(600.0);
		entities.add(new Entity("Connecticut Avenue", "lightblue", 120, rentValues, 9, true, 4));
		rentValues = new ArrayList<Double>();
		rentValues.add(10.0);
		rentValues.add(50.0);
		rentValues.add(150.0);
		rentValues.add(450.0);
		rentValues.add(625.0);
		rentValues.add(750.0);
		entities.add(new Entity("Jail", null, 0, noRent, 10, false, -1));
		entities.add(new Entity("St. Charles Place", "purple", 140, rentValues, 11, true, 5));
		entities.add(new Entity("Electric Company", "utilities", 150, rentValues, 12, true, -1));
		entities.add(new Entity("States Avenue", "purple", 140, rentValues, 13, true, 6));
		rentValues = new ArrayList<Double>();
		rentValues.add(12.0);
		rentValues.add(60.0);
		rentValues.add(180.0);
		rentValues.add(500.0);
		rentValues.add(700.0);
		rentValues.add(900.0);
		entities.add(new Entity("Virginia Avenue", "purple", 160, rentValues, 14, true, 7));
		rentValues = new ArrayList<Double>();
		rentValues.add(25.0);
		entities.add(new Entity("Pensylvania Railroad", "railroads", 200, rentValues, 15, true, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(14.0);
		rentValues.add(70.0);
		rentValues.add(200.0);
		rentValues.add(550.0);
		rentValues.add(750.0);
		rentValues.add(950.0);
		entities.add(new Entity("St James Place", "orange", 180, rentValues, 16, true, 8));
		entities.add(new Entity("Community chest (2)", null, 0, noRent, 17, false, -1));
		entities.add(new Entity("Tennesse Avenue", "orange", 180, rentValues, 18, true, 9));
		rentValues = new ArrayList<Double>();
		rentValues.add(16.0);
		rentValues.add(80.0);
		rentValues.add(220.0);
		rentValues.add(600.0);
		rentValues.add(800.0);
		rentValues.add(1000.0);
		entities.add(new Entity("New York Avenue", "orange", 200, rentValues, 19, true, 10));
		entities.add(new Entity("Free Parking", null, 0, noRent, 20, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(18.0);
		rentValues.add(90.0);
		rentValues.add(250.0);
		rentValues.add(700.0);
		rentValues.add(875.0);
		rentValues.add(1050.0);
		entities.add(new Entity("Kentucky Avenue", "red", 220, rentValues, 21, true, 11));
		entities.add(new Entity("Chance (2)", null, 0, noRent, 22, false, -1));
		entities.add(new Entity("Indiana Avenue", "red", 220, rentValues, 23, true, 12));
		rentValues = new ArrayList<Double>();
		rentValues.add(20.0);
		rentValues.add(100.0);
		rentValues.add(300.0);
		rentValues.add(750.0);
		rentValues.add(925.0);
		rentValues.add(1100.0);
		entities.add(new Entity("Illinois Avenue", "red", 240, rentValues, 24, true, 13));
		rentValues = new ArrayList<Double>();
		rentValues.add(25.0);
		entities.add(new Entity("B & O Railroad", "railroads", 200, rentValues, 25, true, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(22.0);
		rentValues.add(110.0);
		rentValues.add(330.0);
		rentValues.add(800.0);
		rentValues.add(975.0);
		rentValues.add(1150.0);
		entities.add(new Entity("Atlantic Avenue", "yellow", 260, rentValues, 26, true, 14));
		entities.add(new Entity("Ventnor Avenue", "yellow", 260, rentValues, 27, true, 15));
		entities.add(new Entity("Water Works", "utilities", 150, rentValues, 28, true, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(24.0);
		rentValues.add(120.0);
		rentValues.add(360.0);
		rentValues.add(850.0);
		rentValues.add(1025.0);
		rentValues.add(1200.0);
		entities.add(new Entity("Marvin Gardens", "yellow", 280, rentValues, 29, true, 16));
		entities.add(new Entity("Go To Jail", null, 0, noRent, 30, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(26.0);
		rentValues.add(130.0);
		rentValues.add(390.0);
		rentValues.add(900.0);
		rentValues.add(1100.0);
		rentValues.add(1275.0);
		entities.add(new Entity("Pacific Avenue", "green", 300, rentValues, 31, true, 17));
		entities.add(new Entity("North Carolina Avenue", "green", 300, rentValues, 32, true, 18));
		entities.add(new Entity("Community Chest (3)", null, 0, noRent, 33, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(28.0);
		rentValues.add(150.0);
		rentValues.add(450.0);
		rentValues.add(1000.0);
		rentValues.add(1200.0);
		rentValues.add(1400.0);
		entities.add(new Entity("Pennsylvania Avenue", "green", 320, rentValues, 34, true, 19));
		rentValues = new ArrayList<Double>();
		rentValues.add(25.0);
		entities.add(new Entity("Short Line Railroad", "railroads", 200, rentValues, 35, true, -1));
		entities.add(new Entity("Chance (3)", null, 0, noRent, 36, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(35.0);
		rentValues.add(175.0);
		rentValues.add(500.0);
		rentValues.add(1100.0);
		rentValues.add(1300.0);
		rentValues.add(1500.0);
		entities.add(new Entity("Park Place", "blue", 350, rentValues, 37, true, 20));
		entities.add(new Entity("Luxury Tax", null, 100, noRent, 38, false, -1));
		rentValues = new ArrayList<Double>();
		rentValues.add(50.0);
		rentValues.add(200.0);
		rentValues.add(600.0);
		rentValues.add(1400.0);
		rentValues.add(1700.0);
		rentValues.add(2000.0);
		entities.add(new Entity("Boardwalk", "blue", 400, rentValues, 39, true, 21));
	}
	
	/**
	 * entities getter
	 * @return ArrayList of the entities
	 */
	public ArrayList<Entity> getEntities() {
		return entities;
	}
}
