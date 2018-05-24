package singleton;
/**
 * 懒汉式单例模式
 * @author lyc
 *
 */
public class PersonLazy {
	private static PersonLazy personLazy;
	private String name;
	private PersonLazy() {
		
	}
	public static PersonLazy getPersonLazy() {
		if(personLazy==null) {
			synchronized (PersonLazy.class) {
				if (personLazy==null) {
					personLazy = new PersonLazy();
				}
			}
		}
		return personLazy;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
