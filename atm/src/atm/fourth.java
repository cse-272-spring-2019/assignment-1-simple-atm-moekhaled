package atm;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class fourth {
	public static void start (cardinfo card) {
	     Stage primaryStage=new Stage();
		 primaryStage.setTitle("5907");	
		 Label withdrawlabel = new Label("withdraw"); 
		 TextField withdrawfield = new TextField();
		 Button withdraw = new Button("withdraw");
		 Button back = new Button("back");

		 Label balancelabel = new Label(); 
		 GridPane grid=new GridPane();
		 grid.add(withdrawlabel,0,0);
		 grid.add(withdraw,1,0);
		 grid.add(withdrawfield,0,1);
		 grid.add(balancelabel,1,1);
		 grid.add(back,2,1);
		 Scene scene=new Scene(grid,600,400);
		 primaryStage.setScene(scene);
		 primaryStage.show();
		
		 withdraw.setOnAction(e->{
			 double x = Double.valueOf(withdrawfield.getText());
			 if(x>cardinfo.balance)
			 {
					balancelabel.setText("not enough balance");	   }
			 cardinfo.withdraw(x);
	
					});
		 back.setOnAction(e->{
			 second.start(card);
			 
		 });

}

}
