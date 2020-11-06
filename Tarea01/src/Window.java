package src;

import java.util.LinkedList;
import java.util.List;

import javafx.scene.layout.GridPane;

public class Window implements Subject{
	private String color; //Aqui se va a registrar el color de la ventana que agarra por cada presionada de los botones
	private GridPane root;// Este sera la representación FX de la ventana.
	private List<Observer> buttons=new LinkedList<>();
	
	ddx
	public Window(String color, GridPane root) {
		super();
		this.color = color;
		this.root = root;
		
	}

	@Override
	public void add(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyOb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit(Observer o) {
		// TODO Auto-generated method stub
		
	}
    /*
     * Debe haber un metodo que sea changecolor que haga el cambio de color en la ventana
     * y a su vez notifique el cambio en notify y eso se muestre por consola.
     */
	
}
