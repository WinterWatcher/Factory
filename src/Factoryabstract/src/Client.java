
public class Client {
	public static void main(String[] args) {
		try {
			Factory factory;
			Food food;
			Drink dk;
			factory = (Factory)XMLUtil.getBean();
			food = factory.ProduceFood();
			food.eat();
			dk = factory.ProduceDrink();
			dk.drink();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
