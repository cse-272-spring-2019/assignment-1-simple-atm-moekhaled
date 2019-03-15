package atm;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class third {
	 public static void start (cardinfo card) {
	     Stage primaryStage=new Stage();
		 primaryStage.setTitle("5907");	
		 Label depositlabel = new Label("Deposit"); 
		 TextField depositfield = new TextField();
		 Button deposit = new Button("Deposit");
		 GridPane grid=new GridPane();
		 grid.add(depositlabel,0,0);
		 grid.add(deposit,1,0);
		 grid.add(depositfield,0,1);
		 Scene scene=new Scene(grid,600,400);
		 primaryStage.setScene(scene);
		 primaryStage.show();
		
		 deposit.setOnAction(e->{
			 
			 double x = Double.valueOf(depositfield.getText());
			 cardinfo.deposit(x);	
			 second.start(card);
		 });

}
}
