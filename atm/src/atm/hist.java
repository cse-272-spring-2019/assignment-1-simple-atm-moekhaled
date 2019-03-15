package atm;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class hist {
	 public static void start (cardinfo card) {
	     Stage primaryStage=new Stage();
		 primaryStage.setTitle("5907");	
		 GridPane grid=new GridPane();

		 
		 Label historylabel = new Label();
		 Label historylabel1 = new Label();
		 Label historylabel2= new Label();
		 Label historylabel3 = new Label();
		 Label historylabel4 = new Label();

		 Button back = new Button("back");
		 grid.add(back,2,2);
		 grid.add(historylabel,3,4);
		 grid.add(historylabel1,3,5);
		 grid.add(historylabel2,3,6);
		 grid.add(historylabel3,3,7);
		 grid.add(historylabel4,3,8);

		 
			 historylabel.setText(cardinfo.history[4]);
			 historylabel1.setText(cardinfo.history[3]);
			 historylabel2.setText(cardinfo.history[2]);
			 historylabel3.setText(cardinfo.history[1]);
			 historylabel4.setText(cardinfo.history[0]);

         back.setOnAction(e->{ second.start(card);});
		 		 
		 Scene scene=new Scene(grid,600,400);
		 primaryStage.setScene(scene);
		 primaryStage.show();


}
	 public static void next (cardinfo card) {
	     Stage primaryStage=new Stage();
		 primaryStage.setTitle("5907");	
		 GridPane grid=new GridPane();

		 
		 Label nextlabel = new Label();
		
		 Button back = new Button("back");
		 grid.add(back,2,2);
		 grid.add(nextlabel,3,4);
		 nextlabel.setText(cardinfo.history[++cardinfo.p]);
			 
	     back.setOnAction(e->{ second.start(card);});
		 
		 Scene scene=new Scene(grid,600,400);
		 primaryStage.setScene(scene);
		 primaryStage.show();


}
	 
	 public static void previous (cardinfo card) {
	     Stage primaryStage=new Stage();
		 primaryStage.setTitle("5907");	
		 GridPane grid=new GridPane();

		 
		 Label previouslabel = new Label();
		
		 Button back = new Button("back");
		 grid.add(back,2,2);
		 grid.add(previouslabel,3,4);
		 previouslabel.setText(cardinfo.history[--cardinfo.p]);
			 
	     back.setOnAction(e->{ second.start(card);});
		 
		 Scene scene=new Scene(grid,600,400);
		 primaryStage.setScene(scene);
		 primaryStage.show();
}

}
