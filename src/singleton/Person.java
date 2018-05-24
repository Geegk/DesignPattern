package singleton;
/**
 * 饿汉式单例模式
 * @author lyc
 *
 */
public class Person {
	private static Person person = new Person();
	private String name;
	private Person() {
		
	}
	public static Person getPerson() {
		return person;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
