//U10416025 張詠淳
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.Group;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculator extends Application {
	
	//override
	@Override
  public void start(Stage primaryStage) {
  
	//use gridpane to sort buttons
	GridPane gridpane = new GridPane();
	gridpane.setAlignment(Pos.TOP_CENTER);
	gridpane.setHgap(5);
	gridpane.setVgap(5);
	
	Group group = new Group();
	TextField space = new TextField();
		
	gridpane.add(space,1,2,10,5);
  space.setMinSize(300,80);
  space.setEditable(false);
		
	//Create new Pane
	Pane pane = new Pane();
		
	Scene scene = new Scene(group, 300, 400);
	scene.setFill(Color.BEIGE);
		
	//add button
	group.getChildren().add(gridpane);
		
	// Title
	primaryStage.setTitle("Calculator");
  primaryStage.setScene(scene);
	primaryStage.setResizable(false);
  primaryStage.show(); 
  }
}
