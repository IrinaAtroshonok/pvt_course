package home_work_9;

public class MainForAll {

	public static void main(String[] args) {
		String parentSiriusSun = "Parent Sirius&Sun = Star";
		String parentPlanet = "Parent Planet = StarSystem";
		int foundYear = 1844;

		Sirius sirius = new Sirius(parentSiriusSun, foundYear); // creation using constructor

		Sun sun = new Sun(); // initialization with setters and getters
		sun.setParentSun(parentSiriusSun);
		System.out.println(sun.getParentSun());

		Planet planet = new Planet(parentPlanet);// creation using constructor (unrelated)
		planet.printParentPlanet();

		planet.printAnything(); // working overridden methods
		System.out.println(planet.returnAnything());
		sun.printAnything();
		System.out.println(sun.returnAnything());

		StarSystem starSystem = new Planet(); // working overridden hashCode and toString
		System.out.println(starSystem.hashCode());
		System.out.println(starSystem.toString());

		System.out.println(planet.hashCode());
		System.out.println(planet.toString());

		Star star = new Star();
		System.out.println(star.hashCode());
		System.out.println(star.toString());

		Earth earth = new Earth();
		System.out.println(earth.hashCode());
		System.out.println(earth.toString());

		Mars mars = new Mars();
		System.out.println(mars.hashCode());
		System.out.println(mars.toString());

		System.out.println(sun.hashCode());
		System.out.println(sun.toString());

		Sirius sirius1 = new Sirius();
		System.out.println(sirius1.hashCode());
		System.out.println(sirius1.toString());
	}
}
