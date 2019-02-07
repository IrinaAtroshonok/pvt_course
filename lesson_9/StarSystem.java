package home_work_9;

public abstract class StarSystem {
	private int sumStars = 100;
	private String nameStarSystem = "name";

	public void printNameStarSystem() {
		System.out.println(nameStarSystem);
	}

	public int getSumStars() {
		return this.sumStars;
	}

	public abstract void printAnything();

	public abstract int returnAnything();

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
		StarSystem starSystem = (StarSystem) obj;
		if (sumStars != starSystem.sumStars) {
			return false;
		}
		if (null == nameStarSystem) {
			return (nameStarSystem == starSystem.nameStarSystem);
		} else {
			if (!nameStarSystem.equals(starSystem.nameStarSystem)) {
				return false;
			}
			return true;
		}

	}

	@Override
	public int hashCode() {
		return (int) (31 * sumStars + ((null == nameStarSystem) ? 0 : nameStarSystem.hashCode()));
	}

	@Override
	public String toString() {
		return getClass().getName() + "nameStarSystem=" + nameStarSystem + ", sumStars=" + sumStars;
	}
}
