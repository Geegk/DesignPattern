package factorymethod;

public class AppleFactory implements FruitFactory {

	@Override
	public Fruit getFruit() {
		// TODO Auto-generated method stub
		return new Apple();
	}

}
