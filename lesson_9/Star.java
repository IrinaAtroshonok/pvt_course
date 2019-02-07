package home_work_9;

public class Star extends StarSystem {
	private String parentStar = "StarSystem";
	private int years = 15;

	public void printParentStar() {
		System.out.println(parentStar);
	}

	public int getYears() {
		return this.years;
	}

	@Override
	public void printAnything() {
		printParentStar();
	}

	@Override
	public int returnAnything() {
		return getYears();
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
		Star star = (Star) obj;
		if (years != star.years) {
			return false;
		}
		if (null == parentStar) {
			return (parentStar == star.parentStar);
		} else {
			if (!parentStar.equals(star.parentStar)) {
				return false;
			}
			return true;
		}

	}

	@Override
	public int hashCode() {
		return (int) (31 * years + ((null == parentStar) ? 0 : parentStar.hashCode()));
	}

	@Override
	public String toString() {
		return getClass().getName() + "parentStar=" + parentStar + ", years=" + years;
	}
}
