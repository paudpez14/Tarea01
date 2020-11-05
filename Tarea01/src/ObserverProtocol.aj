package src;

import javafx.scene.control.Button;

public  aspect ObserverProtocol {
	
	PaneOrganizer pn= new PaneOrganizer();
	
	pointcut changeColor() : execution(* handle(*) ) ;
	after():changeColor(){
		System.out.println("Color:");
		
	}
		
}
