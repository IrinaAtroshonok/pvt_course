package home_work_9;

public class Sun extends Star {
	private String parentSun = "Star";
	private int hydrogen = 73;

	public String getParentSun() {
		return parentSun;
	}

	public void setParentSun(String parentSun) {
		this.parentSun = parentSun;
	}

	public void setHydrogen(int hydrogen) {
		this.hydrogen = hydrogen;
	}

	public void printParentSun() {
		System.out.println(parentSun);
	}

	public double getHydrogen() {
		return this.hydrogen;
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
		Sun sun = (Sun) obj;
		if (hydrogen != sun.hydrogen) {
			return false;
		}
		if (null == parentSun) {
			return (parentSun == sun.parentSun);
		} else {
			if (!parentSun.equals(sun.parentSun)) {
				return false;
			}
			return true;
		}

	}

	@Override
	public int hashCode() {
		return (int) (31 * hydrogen + ((null == parentSun) ? 0 : parentSun.hashCode()));
	}

	@Override
	public String toString() {
		return getClass().getName() + "parentSun=" + parentSun + ", hydrogen=" + hydrogen;
	}
}
