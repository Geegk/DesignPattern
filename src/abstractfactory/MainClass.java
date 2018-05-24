package abstractfactory;

public class MainClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		FruitFactory northFruit = new NorthFruitFactory();
		FruitFactory southFruit = new SouthFruitFactory();
		northFruit.getApple().get();
		northFruit.getBanana().get();
		southFruit.getApple().get();
		southFruit.getBanana().get();
	}

}
