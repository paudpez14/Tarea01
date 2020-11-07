package src;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public  aspect ObserverProtocol {
	
	pointcut changeColor(GridPane root) : call(* setStyle(*) )  && target (root);
	after(GridPane root):changeColor(root){
		String color=root.getStyle();
		color=color.replace("-fx-background-color:", "");
		System.out.println("Nuevo color de la pantalla:"+color);
		System.out.println("Cambiado con exito");
	}
	
}
