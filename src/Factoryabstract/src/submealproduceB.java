
public class submealproduceB implements Factory{

	public Food ProduceFood() {
		// TODO �Զ����ɵķ������
		return new submealB();
	}
	@Override
	public Drink ProduceDrink() {
		// TODO �Զ����ɵķ������
		return new subDrinkB();
	}
}
