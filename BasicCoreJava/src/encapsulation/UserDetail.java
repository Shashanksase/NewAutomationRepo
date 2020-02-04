package encapsulation;

public class UserDetail {

	private int age;

	// right click />>> source>> getter and setter >> generate
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}

	private String name;

}
