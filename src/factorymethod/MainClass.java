package factorymethod;

public class MainClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		FruitFactory appleFactory = new AppleFactory();
		Fruit apple = appleFactory.getFruit();
		FruitFactory bananaFactory = new BananaFactory();
		Fruit banana = bananaFactory.getFruit();
		apple.get();
		banana.get();

	}

}
