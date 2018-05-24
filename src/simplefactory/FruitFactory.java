package simplefactory;

public class FruitFactory {
	
//	public static Fruit getApple() {
//		return new Apple();
//	}
//	
//	public static Fruit getBanana() {
//		return new Apple();
//	}
	public static Fruit getFruit(String name) throws InstantiationException, IllegalAccessException {
		if("apple".equalsIgnoreCase(name)) {
			return Apple.class.newInstance();
		}else if("banana".equalsIgnoreCase(name)){
			return Banana.class.newInstance();
		}else {
			return null;
		}
	}
}
