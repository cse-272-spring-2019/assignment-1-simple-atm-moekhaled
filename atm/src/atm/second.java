package atm;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class second {
 public static void start (cardinfo card) {
     Stage primaryStage=new Stage();
	 primaryStage.setTitle("5907");
	
	 Button deposit = new Button("Deposit");
	 Button withdraw = new Button("withdraw");
	 Button getbalance = new Button("getbalance");
	 Label balancelabel = new Label(); 
	 Button history = new Button("history");
	 Button previous = new Button("previous");
	 Button next = new Button("next");

	 
	 GridPane grid=new GridPane();
	 grid.add(deposit,1,2);
	 grid.add(withdraw,1,3);
	 grid.add(getbalance,2,2);
	 grid.add(balancelabel,2,3);
	 grid.add(history,5,5);
	 grid.add(previous,5,6);
	 grid.add(next,5,7);


	 Scene scene2=new Scene(grid,600,400);

	 primaryStage.setScene(scene2);
	 primaryStage.show();

	 history.setOnAction(e->{
		 
		 hist.start(card);
		 
		 
	 });
	 
previous.setOnAction(e->{
		 
		 hist.previous(card);
		 
		 
	 });

next.setOnAction(e->{
	 
	 hist.next(card);
	 
	 
});


	 
	 deposit.setOnAction(e->{
		 
		 third.start(card);});
	 
      withdraw.setOnAction(e->{
    	  fourth.start(card); });
      
      
      getbalance.setOnAction(e->{
    	  double x=cardinfo.geetbalance();
    	  balancelabel.setText(Double.toString(x)); }  );
 
 }
 
}
