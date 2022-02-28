package Main;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class MainInterface extends Application{
    
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        TextField textField=new TextField();
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");
        Button b0=new Button("0");
        Button bC=new Button("C");
        Button bDecimal=new Button(".");
        
        Button bAdd=new Button("+");
        bAdd.setOnAction(e-> MainOperations.add());
        
        Button bSubtract=new Button("-");
        bSubtract.setOnAction(e-> MainOperations.subtract());
        
        Button bDivide=new Button("÷");
        bDivide.setOnAction(e-> MainOperations.divide());
        
        Button bMultiply=new Button("×");
        bMultiply.setOnAction(e-> MainOperations.multiply());
        
        Button bEqual=new Button("=");
        bEqual.setOnAction(e-> MainOperations.equal());
        

        GridPane pane = new GridPane();

        pane.add(textField, 0,0,2,2);
        

        Scene scene = new Scene(pane, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void run(){
        launch();
    }
}
