package home_work_9;

public class Earth extends Planet {
	private static String parentEarth = "Planet";
	private int populationSize = 123;

	public void printParentEarth() {
		System.out.println(parentEarth);
	}

	public double getPopulationSize() {
		return this.populationSize;
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
		Earth earth = (Earth) obj;
		if (populationSize != earth.populationSize) {
			return false;
		}
		if (null == parentEarth) {
			return (parentEarth == Earth.parentEarth);
		} else {
			if (!parentEarth.equals(Earth.parentEarth)) {
				return false;
			}
			return true;
		}

	}

	@Override
	public int hashCode() {
		return (int) (31 * populationSize + ((null == parentEarth) ? 0 : parentEarth.hashCode()));
	}

	@Override
	public String toString() {
		return getClass().getName() + "parentEarth=" + parentEarth + ", populationSize=" + populationSize;
	}
}
