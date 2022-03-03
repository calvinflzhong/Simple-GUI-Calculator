package Main;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class MainInterface extends Application{
    TextField textField;
    String num1=null;
    String operator=null;
    String num2=null;
    String numTemp=null;
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        textField=new TextField();
        textField.setDisable(true);
        textField.setStyle("-fx-opacity: 1;");
        
        Button b1=new Button("1");
        b1.setOnAction(e-> numberButton("1"));
        
        Button b2=new Button("2");
        b2.setOnAction(e-> numberButton("2"));
        
        Button b3=new Button("3");
        b3.setOnAction(e-> numberButton("3"));
        
        Button b4=new Button("4");
        b4.setOnAction(e-> numberButton("4"));
        
        Button b5=new Button("5");
        b5.setOnAction(e-> numberButton("5"));
        
        Button b6=new Button("6");
        b6.setOnAction(e-> numberButton("6"));
        
        Button b7=new Button("7");
        b7.setOnAction(e-> numberButton("7"));
        
        Button b8=new Button("8");
        b8.setOnAction(e-> numberButton("8"));
        
        Button b9=new Button("9");
        b9.setOnAction(e-> numberButton("9"));
        
        Button b0=new Button("0");
        b0.setOnAction(e-> numberButton("0"));
        
        Button bC=new Button("C");
        bC.setOnAction(e-> clear());
        
        Button bDecimal=new Button(".");
        b1.setOnAction(e-> decimalButton());
        
        Button bAdd=new Button("+");
        bAdd.setOnAction(e-> operation("+"));
        
        Button bSubtract=new Button("-");
        bSubtract.setOnAction(e-> operation("-"));
        
        Button bDivide=new Button("÷");
        bDivide.setOnAction(e-> operation("÷"));
        
        Button bMultiply=new Button("×");
        bMultiply.setOnAction(e-> operation("×"));
        
        Button bEqual=new Button("=");
        bEqual.setOnAction(e-> operation("="));
        
        GridPane pane = new GridPane();
        
        ColumnConstraints col30p = new ColumnConstraints();
        col30p.setPercentWidth(30);
        pane.getColumnConstraints().addAll(col30p, col30p, col30p, col30p);
        
        pane.add(textField, 0,0,4,2);
        pane.add(bC, 0,3);
        pane.add(bAdd, 3,3);
        pane.add(b7, 0,4);
        pane.add(b8, 1,4);
        pane.add(b9, 2,4);
        pane.add(bSubtract, 3,4);
        pane.add(b4, 0,5);
        pane.add(b5, 1,5);
        pane.add(b6, 2,5);
        pane.add(bMultiply, 3,5);
        pane.add(b1, 0,6);
        pane.add(b2, 1,6);
        pane.add(b3, 2,6);
        pane.add(bDivide, 3,6);
        pane.add(b0, 0,7,2,1);
        pane.add(bDecimal, 2,7);
        pane.add(bEqual, 3,7);
        

        Scene scene = new Scene(pane, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void operation(String operator){
        
    }
    
    public void numberButton(String s){
        if(num1==null){
            num1=s;
        }else if((num1!=null) && (operator==null)){
            num1+=s;
        }
    }
    public void decimalButton(){

    }
    public void clear(){

    }

    public void setInput(String s){
        textField.setText(s);
    }
    
    public void setInput(double num){
        textField.setText(num+"");
    }
    
    public void run(){
        launch();
    }
}
