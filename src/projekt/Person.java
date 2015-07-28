package projekt;

public class Person {

	private String name;

	private int age;

	Person() {
	}

	Person(int age, String name) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		if (isValidAge(age)) {
			this.age = age;
			return true;
		}
		return false;
	}

	private boolean isValidAge(int i) {
		return i > 0 && i < 150;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return name = name + " " + age;
		// return super.toString();
	}

}
