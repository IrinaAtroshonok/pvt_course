package home_work_9;

public class Sirius extends Star {
	private String parentSirius = "Star";
	private int foundYear = 1798;

	public Sirius() {

	}

	public Sirius(String parent) {
		super();
		this.parentSirius = parent;
	}

	public Sirius(String parent, int foundYear) {
		this(parent);
		this.foundYear = foundYear;
	}

	public void printParentSirius() {
		System.out.println(parentSirius);
	}

	public double getFoundYear() {
		return this.foundYear;
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
		Sirius sirius = (Sirius) obj;
		if (foundYear != sirius.foundYear) {
			return false;
		}
		if (null == parentSirius) {
			return (parentSirius == sirius.parentSirius);
		} else {
			if (!parentSirius.equals(sirius.parentSirius)) {
				return false;
			}
			return true;
		}

	}

	@Override
	public int hashCode() {
		return (int) (31 * foundYear + ((null == parentSirius) ? 0 : parentSirius.hashCode()));
	}

	@Override
	public String toString() {
		return getClass().getName() + "parentSirius=" + parentSirius + ", foundYear=" + foundYear;
	}
}
