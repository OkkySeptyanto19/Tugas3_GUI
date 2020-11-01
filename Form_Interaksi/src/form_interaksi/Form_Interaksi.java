/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Form_Interaksi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.text.Text;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


/**
 *
 * @author ASUS
 */
public class Form_Interaksi extends Application {
    
    @Override
    public void start(Stage stage) {
        
        Text text1 = new Text("Nama    : ");
        Text text2 = new Text("Telepon : ");
        Text text3 = new Text("Alamat  : ");
        
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextArea textArea1 = new TextArea();
        
        Button button1 = new Button("Kirim");
        Button button2 = new Button("Hapus");
        
        //Event
        button1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                System.out.println("Nama    : "+textField1.getText());   
                System.out.println("Telepon : "+textField2.getText());   
                System.out.println("Alamat  : "+textArea1.getText());   
            }
        });
        
        button2.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                textField1.setText("");
                textField2.setText("");
                textArea1.setText("");
                
            }
        });
        
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(50,50,50,50));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(text3, 0, 2);
        gridPane.add(textArea1, 1, 2);
        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3);
        
        Scene scene = new Scene(gridPane);
        stage.setTitle("IDDM_Fest");
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
