
public class submealproduceA implements Factory{
	public Food ProduceFood() {
		// TODO �Զ����ɵķ������
		return new submealA();
	}
	@Override
	public Drink ProduceDrink() {
		// TODO �Զ����ɵķ������
		return new subDrinkA();
	}
	
}
