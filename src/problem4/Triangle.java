package problem4;

final class Triangle {

	private final double base;
	private final double height;

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	// Area of a triangle = 1/2 * base * height
	public double computeArea() {
		return 0.5 * base * height;

	}
}
