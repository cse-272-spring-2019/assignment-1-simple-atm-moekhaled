package atm;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class atm extends Application {
	cardinfo card=new cardinfo();
public static void main(String[]args)
{
	launch(args);
}
public void start (Stage primaryStage) throws Exception{
	primaryStage.setTitle("5907");
Label cardnumberlabel = new Label("Cardnumber"); 
Label passwordlabel = new Label("Pin");
TextField cardnumberfield = new TextField();
PasswordField passwordfield = new PasswordField();
Button submit = new Button("submit");
Label validationlabel = new Label("validation");

GridPane grid=new GridPane();
grid.add(cardnumberlabel,0,0);
grid.add(passwordlabel,0,1);
grid.add(cardnumberfield,1,0);
grid.add(passwordfield,1,1);
grid.add(submit,1,2);
grid.add(validationlabel,1,3);


Scene scene1=new Scene(grid,600,400);

primaryStage.setScene(scene1);
primaryStage.show();
	




 submit.setOnAction(e->{
 
double cardnumber = Double.valueOf(cardnumberfield.getText());
double pin = Double.valueOf( passwordfield.getText());
if(cardinfo.cardnumber == cardnumber & cardinfo.pin == pin )
{
second.start(card);
} else {
	validationlabel.setText("wrong card-number or password");	
     }
});

	}

}
 



