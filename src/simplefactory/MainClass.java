package simplefactory;

public class MainClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Fruit apple = FruitFactory.getFruit("apple");
		Fruit banana = FruitFactory.getFruit("banana");
		apple.get();
		banana.get();

	}

}
