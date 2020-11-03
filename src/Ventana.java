import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ventana extends Application{
	
	@Override
    public void start(Stage primaryStage) throws Exception {
        PaneOrganizer rootContainer = new PaneOrganizer();
        Scene scene = new Scene(rootContainer.getRoot(),400,500);
        primaryStage.setTitle("Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	public static void main(String[] args) {
        launch(args);
    }

}