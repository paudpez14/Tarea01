package src;

import javafx.scene.control.Button;

public class ButtonCmp implements Observer{
	private String color; //Este debe ser el atributo que represente el color que hara el cambio en la pantalla
	private Button bt; // Sera la representación del boton en la ventana
	
	public ButtonCmp(String color) {
		super();
		this.color = color;
		this.bt=new Button(color);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * Debe haber un metodo que sea un push que signifique que cada push que se la haga el boton llamara a 
	 * update para que notifique los cambios en la ventana.
	 */
}
