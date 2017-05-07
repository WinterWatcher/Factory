
public class submealproduceA implements Factory{
	public Food ProduceFood() {
		// TODO 自动生成的方法存根
		return new submealA();
	}
	@Override
	public Drink ProduceDrink() {
		// TODO 自动生成的方法存根
		return new subDrinkA();
	}
	
}
