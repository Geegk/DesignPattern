package singleton;

public class MainClass {

	public static void main(String[] args) {
		//饿汉模式
		Person person1 = Person.getPerson();
		Person person2 = Person.getPerson();
		person1.setName("zhangsan");
		person2.setName("lisi");
		System.out.println(person1.getName());
		System.out.println(person2.getName());
		//懒汉模式
		PersonLazy person3 = PersonLazy.getPersonLazy();
		PersonLazy person4 = PersonLazy.getPersonLazy();
		person3.setName("zhangsan");
		person4.setName("lisi");
		System.out.println(person3.getName());
		System.out.println(person4.getName());
	}

}
