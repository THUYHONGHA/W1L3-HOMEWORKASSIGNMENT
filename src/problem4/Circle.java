package problem4;

final class Circle {

	private final double radius;

	public double getRadius() {
		return radius;
	}

	Circle(double radius) {
		this.radius = radius;
	}

	// Area of a circle = PI * radius * radius
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
