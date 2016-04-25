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
	
	int function;
	double result;
	boolean determine = true;
	boolean start = true;
	
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
	
	//add DEL button
	Button buttonDel = new Button("DEL");
	buttonDel.setMinSize(50, 50);
    	gridpane.add(buttonDel, 2, 8);
	buttonDel.setOnAction(e -> {
		String answer = space.getText();
		answer = answer.substring(0, answer.length() - 1);
		space.setText(answer);
    	});
    
	//add C button
	Button buttonC = new Button("C");
	buttonC.setMinSize(50, 50);
    	gridpane.add(buttonC, 4, 8);
	buttonC.setOnAction(e -> {
		space.clear();
		determine = true;
		space.setText("");
    	});
		
	//add +/- button
	Button buttonChange = new Button("+/-");
	buttonChange.setMinSize(50, 50);
    	gridpane.add(buttonChange, 6, 8);
	buttonChange.setOnAction(e -> {
		space.setText(String.valueOf(-Double.valueOf(space.getText())));
    	});
		
	//add % button
	Button buttonPercentage = new Button("%");
	buttonPercentage.setMinSize(50, 50);
    	gridpane.add(buttonPercentage, 8, 8);
		
	//add sqrt button
	Button buttonSqrt = new Button("sqrt");
	buttonSqrt.setMinSize(50, 50);
    	gridpane.add(buttonSqrt, 10, 8);
		
	//add 7 button
	Button buttonSeven = new Button("7");
	buttonSeven.setMinSize(50, 50);
	gridpane.add(buttonSeven, 2, 10);
	buttonSeven.setOnAction(e -> {
		if(determine == true){
			space.clear();
			determine = false;
			space.setText(space.getText() + 7);
		}
		else{
			space.setText(space.getText() + 7);
		}
	});
		
	//add 8 button
	Button buttonEight = new Button("8");
	buttonEight.setMinSize(50, 50);
    	gridpane.add(buttonEight, 4, 10);
	buttonEight.setOnAction(e -> {
		if(determine == true){
			space.clear();
			determine = false;
			space.setText(space.getText() + 8);
		}
		else{
			space.setText(space.getText() + 8);
		}
	});
		
	//add 9 button
	Button buttonNine = new Button("9");
	buttonNine.setMinSize(50, 50);
    	gridpane.add(buttonNine, 6, 10);
	buttonNine.setOnAction(e -> {
		if(determine == true){
			space.clear();
			determine = false;
			space.setText(space.getText() + 9);
		}
		else{
			space.setText(space.getText() + 9);
		}
	});
		
	//add + button
    	Button buttonAdd = new Button("+");
	buttonAdd.setMinSize(50, 50);
    	gridpane.add(buttonAdd, 8, 10);
		
	//add sin button
	Button buttonSin = new Button("sin");
	buttonSin.setMinSize(50, 50);
    	gridpane.add(buttonSin, 10, 10);
		
	//add 4 button
	Button buttonFour = new Button("4");
	buttonFour.setMinSize(50, 50);
    	gridpane.add(buttonFour, 2, 12);
	buttonFour.setOnAction(e -> {
		if(determine == true){
			space.clear();
			determine = false;
			space.setText(space.getText() + 4);
		}
		else{
			space.setText(space.getText() + 4);
		}
	});
		
	//add 5 button
	Button buttonFive = new Button("5");
	buttonFive.setMinSize(50, 50);
    	gridpane.add(buttonFive, 4, 12);
	buttonFive.setOnAction(e -> {
		if(determine == true){
			space.clear();
			determine = false;
			space.setText(space.getText() + 5);
		}
		else{
			space.setText(space.getText() + 5);
		}
	});
		
	//add 6 button
	Button buttonSix = new Button("6");
	buttonSix.setMinSize(50, 50);
    	gridpane.add(buttonSix, 6, 12);
	buttonSix.setOnAction(e -> {
		if(determine == true){
			space.clear();
			determine = false;
			space.setText(space.getText() + 6);
		}
		else{
			space.setText(space.getText() + 6);
		}
	});
		
	//add - button
	Button buttonSub = new Button("-");
	buttonSub.setMinSize(50, 50);
    	gridpane.add(buttonSub, 8, 12);
		
	//add cos button
	Button buttonCos = new Button("cos");
	buttonCos.setMinSize(50, 50);
    	gridpane.add(buttonCos, 10, 12);
		
	//add 1 button
	Button buttonOne = new Button("1");
	buttonOne.setMinSize(50, 50);
    	gridpane.add(buttonOne, 2, 14);
	buttonOne.setOnAction(e -> {
		if(determine == true){
			space.clear();
			determine = false;
			space.setText(space.getText() + 1);
		}
		else{
			space.setText(space.getText() + 1);
		}
	});
		
	//add 2 button
	Button buttonTwo = new Button("2");
	buttonTwo.setMinSize(50, 50);
    	gridpane.add(buttonTwo, 4, 14);
	buttonTwo.setOnAction(e -> {
		if(determine == true){
			space.clear();
			determine = false;
			space.setText(space.getText() + 2);
		}
		else{
			space.setText(space.getText() + 2);
		}
	});
	
	//add 3 button
	Button buttonThree = new Button("3");
	buttonThree.setMinSize(50, 50);
    	gridpane.add(buttonThree, 6, 14);
	buttonThree.setOnAction(e -> {
		if(determine == true){
			space.clear();
			determine = false;
			space.setText(space.getText() + 3);
		}
		else{
			space.setText(space.getText() + 3);
		}
	});
	
	//add x button
	Button buttonMultiply = new Button("x");
	buttonMultiply.setMinSize(50, 50);
    	gridpane.add(buttonMultiply, 8, 14);
	
	//add tan button
	Button buttonTan = new Button("tan");
	buttonTan.setMinSize(50, 50);
    	gridpane.add(buttonTan, 10, 14);
		
	//add 0 button
	Button buttonZero = new Button("0");
	buttonZero.setMinSize(110, 50);
    	gridpane.add(buttonZero, 2, 16,5,1);
	buttonZero.setOnAction(e -> {
		if(determine == true){
			determine = false;
			space.setText("0");
		}
		else{
			space.setText(space.getText() + 0);
		}
	});
		
	//add . button
	Button buttonPoint = new Button(".");
	buttonPoint.setMinSize(50, 50);
    	gridpane.add(buttonPoint, 6, 16);
	buttonPoint.setOnAction(e -> {
		space.setText(space.getText() + ".");
	});
		
	//add / button
	Button buttonDivide = new Button("/");
	buttonDivide.setMinSize(50, 50);
    	gridpane.add(buttonDivide, 8, 16);
		
	//add = button
	Button buttonAmount = new Button("=");
	buttonAmount.setMinSize(50, 50);
    	gridpane.add(buttonAmount, 10, 16);
    	
    	// + - * /  = actions
	buttonAdd.setOnAction(e -> {
		if(start == false){
			switch(function){
				case 1:
					result +=  Double.valueOf(space.getText());
					break;
				case 2:
					result -=  Double.valueOf(space.getText());
					break;
				case 3:
					result *=  Double.valueOf(space.getText());
					break;
				case 4:
					result /=  Double.valueOf(space.getText());
					break;
			}
			space.setText(String.valueOf(result));
			space.appendText("+");
			determine = true;
			function = 1;
		}
		else{
			result = Double.valueOf(space.getText());
			space.setText(String.valueOf(result));
			space.appendText("+");
			determine = true;
			start = false;
			function = 1;
		}
	});
	
	buttonSub.setOnAction(e -> {
		if(start == false){
			switch(function){
				case 1:
					result +=  Double.valueOf(space.getText());
					break;
				case 2:
					result -=  Double.valueOf(space.getText());
					break;
				case 3:
					result *=  Double.valueOf(space.getText());
					break;
				case 4:
					result /=  Double.valueOf(space.getText());
					break;
			}
			space.setText(String.valueOf(result));
			space.appendText("-");
			determine = true;
			function = 2;
		}
		else{
			result = Double.valueOf(space.getText());
			space.setText(String.valueOf(result));
			space.appendText("-");
			determine = true;
			start = false;
			function = 2;
		}
	});
	
	buttonMultiply.setOnAction(e -> {
		if(start == false){
				switch(function){
				case 1:
					result +=  Double.valueOf(space.getText());
					break;
				case 2:
					result -=  Double.valueOf(space.getText());
					break;
				case 3:
					result *=  Double.valueOf(space.getText());
					break;
				case 4:
					result /=  Double.valueOf(space.getText());
					break;
			}
			space.setText(String.valueOf(result));
			space.appendText("*");
			determine = true;
			function = 3;
		}
		else{
			result = Double.valueOf(space.getText());
			space.setText(String.valueOf(result));
			space.appendText("*");
			determine = true;
			start = false;
			function = 3;
		}
	});
		
	buttonDivide.setOnAction(e -> {
		if(start == false){
				switch(function){
				case 1:
					result +=  Double.valueOf(space.getText());
					break;
				case 2:
					result -=  Double.valueOf(space.getText());
					break;
				case 3:
					result *=  Double.valueOf(space.getText());
					break;
				case 4:
					result /=  Double.valueOf(space.getText());
					break;
			}
			space.setText(String.valueOf(result));
			space.appendText("/");
			determine = true;
			function = 4;
		}
		else{
			result = Double.valueOf(space.getText());
			space.setText(String.valueOf(result));
			space.appendText("/");
			determine = true;
			start = false;
			function = 4;
		}
	});
		
	buttonAmount.setOnAction(e -> {
		if(start == false){
			switch(function){
				case 1:
					result +=  Double.valueOf(space.getText());
					break;
				case 2:
					result -=  Double.valueOf(space.getText());
					break;
				case 3:
					result *=  Double.valueOf(space.getText());
					break;
				case 4:
					result /=  Double.valueOf(space.getText());
					break;
			}
			space.setText(String.valueOf(result));
			determine = true;
			start = true;
		}
	});
	}
}
