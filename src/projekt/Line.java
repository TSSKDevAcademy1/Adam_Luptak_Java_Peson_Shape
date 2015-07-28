package projekt;

public class Line {

	/*
	 * Trieda Line length: int vertical: boolean toString() - vypis ciary podla
	 * dlzky, ak je vertical tak sa vypise vertikalne, ak nie, tak horizontalne
	 * 
	 * 
	 */

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	private boolean vertical = false;;

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	Line(int length, boolean vertical) {
		this.length = length;
		this.vertical = vertical;

	}

	@Override
	public String toString() {

		if (vertical) {
			return tlac(this.length, 1);

		} else {

			return tlac(1, this.length);

		}

	}

	private String tlac(int a, int a2) {
		String h = "";

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a2; j++) {
				h = h + "*";
			}

			h = h + "\n";
		}

		return h;

	}

}
