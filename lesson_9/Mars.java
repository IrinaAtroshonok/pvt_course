package home_work_9;

public class Mars extends Planet {
	private String parentMars = "Planet";
	private int sizeNumber = 7;

	public Mars() {

	}

	public void printParentMars() {
		System.out.println(parentMars);
	}

	public double getSizeNumber() {
		return this.sizeNumber;
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
		Mars mars = (Mars) obj;
		if (sizeNumber != mars.sizeNumber) {
			return false;
		}
		if (null == parentMars) {
			return (parentMars == mars.parentMars);
		} else {
			if (!parentMars.equals(mars.parentMars)) {
				return false;
			}
			return true;
		}

	}

	@Override
	public int hashCode() {
		return (int) (31 * sizeNumber + ((null == parentMars) ? 0 : parentMars.hashCode()));
	}

	@Override
	public String toString() {
		return getClass().getName() + "parentMars=" + parentMars + ", sizeNumber=" + sizeNumber;
	}
}
