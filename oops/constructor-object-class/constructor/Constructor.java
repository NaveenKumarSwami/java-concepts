package constructor;

public class Constructor {

	public static void main(String[] args) {

		// here p1 and p2 are object of Person class.
		// they takes memory. becuase object are physically present in memory. we can
		// make infinite object from one class.
		// like we can make multiple houses by using same blue print. like that we can
		// also make multiple object by using class.
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Anjana");
		Person p2 = new Person(26, "Naveen");
		System.out.println(Person.getCount()); // here count is static so need to create object to get static values;
	}
}

/**
 * Here Person class is blue print. it does not take any memory at runtime. it
 * is not physically present in memory.
 * 
 * <h1>Like we have house blue print. so house blue print is not house. we have
 * to make house using house's blue print</h1>
 * 
 * @author Naveen Swami
 *
 */
class Person {

	private int age;
	private String name;
	// static variable and method belong to class not to object.
	private static int count;

	// default constructor
	Person() {
		count++;
	}

	// two parameterized constructor
	Person(int age, String name) {
		this(); // by this() method we can call current class constructor
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

}