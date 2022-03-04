package Main;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class MainCalculator extends Application{
    TextField textField;
    String num1=null;
    String operator=null;
    String num2=null;
    String temp=null;
    
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        GridPane pane = new GridPane();

        textField=new TextField();
        textField.setDisable(true);
        textField.setStyle("-fx-opacity: 1;-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:45");
        
        Button b1=new Button("1");
        b1.setOnAction(e-> numberButton("1"));
        b1.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button b2=new Button("2");
        b2.setOnAction(e-> numberButton("2"));
        b2.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button b3=new Button("3");
        b3.setOnAction(e-> numberButton("3"));
        b3.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button b4=new Button("4");
        b4.setOnAction(e-> numberButton("4"));
        b4.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button b5=new Button("5");
        b5.setOnAction(e-> numberButton("5"));
        b5.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button b6=new Button("6");
        b6.setOnAction(e-> numberButton("6"));
        b6.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button b7=new Button("7");
        b7.setOnAction(e-> numberButton("7"));
        b7.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button b8=new Button("8");
        b8.setOnAction(e-> numberButton("8"));
        b8.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button b9=new Button("9");
        b9.setOnAction(e-> numberButton("9"));
        b9.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button b0=new Button("0");
        b0.setOnAction(e-> numberButton("0"));
        b0.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button bC=new Button("C");
        bC.setOnAction(e-> clear());
        bC.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button bDecimal=new Button(".");
        bDecimal.setOnAction(e-> decimalButton());
        bDecimal.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button bAdd=new Button("+");
        bAdd.setOnAction(e-> operation("+"));
        bAdd.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button bSubtract=new Button("-");
        bSubtract.setOnAction(e-> operation("-"));
        bSubtract.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");

        Button bMultiply=new Button("×");
        bMultiply.setOnAction(e-> operation("×"));
        bMultiply.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button bDivide=new Button("÷");
        bDivide.setOnAction(e-> operation("÷"));
        bDivide.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        Button bEqual=new Button("=");
        bEqual.setOnAction(e-> operation("="));
        bEqual.setStyle("-fx-pref-height: 100px;-fx-pref-width: 100px;-fx-font-size:40");
        
        
        ColumnConstraints col30p = new ColumnConstraints();
        col30p.setPercentWidth(30);
        pane.getColumnConstraints().addAll(col30p, col30p, col30p, col30p);
        
        pane.add(textField, 0,0,4,1);
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
        pane.add(b0, 0,7);
        pane.add(bDecimal, 2,7);
        pane.add(bEqual, 3,7);
        
        Scene scene = new Scene(pane, 400, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void operation(String o){
        switch(o){
            case "=":{
                if(num1==null && num2==null){
                    setInput(temp);
                }
                else if(operator==null) {
                    setInput(temp=num1+"");
                    num1=null;
                    operator=null;
                }
                else if(num1!=null && num2!=null) {
                    setInput(temp = calculate(operator) + "");
                    num1=null;
                    num2=null;
                    operator=null;
                }
                else{
                    setInput(num1);
                }
                
            } break;
            case "+": operationEvent("+");break;
            case "-": operationEvent("-");break;
            case "×": operationEvent("×");break;
            case "÷": operationEvent("÷");break;
        }
    }
    
    public void operationEvent(String o){
        if(num1==null && num2==null && temp==null && operator==null) {
            //do nothing
        }else if(temp!=null && num1==null && num2==null){
            setInput(num1=temp);
            operator=o;
        }else if(num1!=null && num2==null && operator==null){
            operator=o;
        }else if(num1!=null && operator!=null && num2==null){
            operator=o;
        }else{
            setInput(num1 = calculate(operator) + "");
            num2=null;
            operator=o;
        }
    }
    
    public double calculate(String o){
        double result=0;
        switch (o) {
            case "+" -> result = MainOperations.add(Double.parseDouble(num1), Double.parseDouble(num2));
            case "-" -> result = MainOperations.subtract(Double.parseDouble(num1), Double.parseDouble(num2));
            case "×" -> result = MainOperations.multiply(Double.parseDouble(num1), Double.parseDouble(num2));
            case "÷" -> result = MainOperations.divide(Double.parseDouble(num1), Double.parseDouble(num2));
        }
        return result;
    }
    
    public void numberButton(String s){
        if(num1==null){
            num1=s;
            setInput(num1);
        }else if(num1!=null && operator==null){
            if(num1.length()>10){
                
            }
            else if(!num1.equals("0")) {
                num1 += s;
                setInput(num1);
            }else{
                num1 = s;
                setInput(num1);
            }
        }else if(num1!=null && operator!=null && num2==null){
            num2=s;
            setInput(num2);
        }else{
            if(num2.length()>10){

            }
            else if(!num2.equals("0")) {
                num2 += s;
                setInput(num2);
            }else{
                num2 = s;
                setInput(num2);
            }
        }
    }
    
    public void decimalButton(){
        if(num1==null){
            //do nothing
        }else if(operator==null){
            if(!num1.contains(".")) {
                num1 += ".";
                setInput(num1);
            }
        }else if(num2==null){
            //do nothing
        }else{
            if(!num2.contains(".")) {
                num2 += ".";
                setInput(num2);
            }
        }
    }
    public void clear(){
        num1=null;
        num2=null;
        temp=null;
        operator=null;
        textField.setText(null);
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
