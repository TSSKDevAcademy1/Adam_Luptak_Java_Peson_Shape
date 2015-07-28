package projekt;

public class Square {

	/*
	 * Trieda Square size: int toString() - vypis rovnostranneho trojuholnika
	 * podla size
	 * 
	 */

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Square(int size) {
		this.size = size;

	}

	@Override
	public String toString() {

		String t = "";

		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				t = t + "*";
			}
			t = t + "\n";
		}

		return t;
	}

}
