package projekt;

public class Triangle {

	private int size;

	
	public Triangle(int size)
	{
		this.size = size;
		
	}
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String h = "";
		if (size < 0) {
			System.out.println("zaporne cislo");
			return null;
		}

		int i = 0;

		while (i < size) {

			h = h + printChars(size - i - 1, ' ');
			h = h + printChars(1 * (i + 1) + i, '*');
			h = h + "\n";
			i++;
		}

		return h;

	}

	private String printChars(int length, char c) {
		String g = "";
		for (int i = 0; i < length; i++) {
			g = g + c;
		}

		return g;

	}

}
