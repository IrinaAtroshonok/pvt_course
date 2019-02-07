package home_work_9;

public class Planet extends StarSystem {
	private String parentPlanet = "StarSystem";
	private int countPlanet = 8;

	public Planet() {

	}

	public Planet(String parent) {
		super();
		this.parentPlanet = parent;
	}

	public void printParentPlanet() {
		System.out.println(parentPlanet);
	}

	public int getCountPlanet() {
		return this.countPlanet;
	}

	@Override
	public void printAnything() {
		printParentPlanet();
	}

	@Override
	public int returnAnything() {
		return getCountPlanet();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Planet planet = (Planet) obj;
		if (countPlanet != planet.countPlanet) {
			return false;
		}
		if (null == parentPlanet) {
			return (parentPlanet == planet.parentPlanet);
		} else {
			if (!parentPlanet.equals(planet.parentPlanet)) {
				return false;
			}
			return true;
		}

	}

	@Override
	public int hashCode() {
		return (int) (31 * countPlanet + ((null == parentPlanet) ? 0 : parentPlanet.hashCode()));
	}

	@Override
	public String toString() {
		return getClass().getName() + "parentPlanet=" + parentPlanet + ", countPlanet=" + countPlanet;
	}
}
