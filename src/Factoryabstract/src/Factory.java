import java.rmi.server.Operation;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public interface Factory {
	public Food ProduceFood();
	public Drink ProduceDrink();
		
	
}
