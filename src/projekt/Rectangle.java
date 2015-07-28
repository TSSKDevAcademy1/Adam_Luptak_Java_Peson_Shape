package projekt;

public class Rectangle {

	private int width;
	private int height;

	public Rectangle() {

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {

		String vrat = "";

		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				vrat = vrat + "*";
			}
			vrat = vrat + "\n";
		}

		return vrat;
	}

}
