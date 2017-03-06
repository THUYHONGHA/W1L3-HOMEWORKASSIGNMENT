package problem4;

final class Rectangle {

	private final double width;
	private final double height;

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Area of a rectangle = width * height
	public double computeArea() {
		return width * height;
	}
}
