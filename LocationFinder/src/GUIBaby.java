/**
 * @(#)GUIBaby.java
 *
 *
 * @author 
 * @version 1.00 2018/10/12
 */
import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GUIBaby extends Application
{
	
	TextArea area = new TextArea();
	User user = new User("void", 123, 123, false);
								
	public static void main(String[] args) throws Exception
	{
		
		launch(args);
		
	    
	    
		
	}

    @Override
    public void start(Stage primaryStage) throws Exception
    {
    	 Scene scene = new Scene(new Group());
         primaryStage.setTitle("El Localizador");
         primaryStage.setWidth(1450);
         primaryStage.setHeight(800);
         
        // File css = new File("dark-theme.css");
         scene.getStylesheets().add("dark-theme.css");
         
         VBox vbox = new VBox();
         vbox.setLayoutX(20);
         vbox.setLayoutY(20);

         Image image = new Image(getClass().getResourceAsStream("explorebutton.png"));
         Image image2 = new Image(getClass().getResourceAsStream("eL Localizador label.png"));
        
         ImageView imageView = new ImageView(image2);
         //Image bg = new Image( this.getClass().getResourceAsStream("ezgif.com-resize.gif"));
         
      //   BackgroundImage motionbg = new BackgroundImage(bg, null, null, null, null);
 	//	 Background backg = new Background(motionbg);
 		 
      
         
       //  GridPane gridpane = new GridPane();
         
      //   gridpane.add(backg, columnIndex, rowIndex);
         
         Button button1 = new Button();
         button1.setGraphic(new ImageView(image));
         button1.setAlignment(Pos.BASELINE_RIGHT);
         button1.setOnAction(new EventHandler<ActionEvent>() {
             @Override public void handle(ActionEvent e) {
                 System.out.println("Explored");
                 
              
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 VBox usConsentV = new VBox();
                 vbox.setLayoutX(20);
                 vbox.setLayoutY(20);

                 Label label1 = new Label("  User Consent to Location");
                 //font is 
                 label1.setFont(new Font("Eras Light ITC", 30));
                 Label label2 = new Label("  Do we have permission to determine and use your location for the purpose of this app?");
                 label2.setFont(new Font("Eras Light ITC", 30));
                 Scene usConsent = new Scene(new Group());
                 
                 usConsentV.getChildren().add(label1);
                 usConsentV.getChildren().add(label2);
                 
                 Button yes = new Button("Yes");
                 yes.setFont(new Font("Eras Light ITC", 30));
                 Button no = new Button("No");
                 no.setFont(new Font("Eras Light ITC", 30));
               //  button1.setGraphic(new ImageView(image));
                 yes.setOnAction(new EventHandler<ActionEvent>() {
                     @Override public void handle(ActionEvent e) {
                         System.out.println("Accepted");
                         user.setUserConsent(true);
                         LocationGetter lg;
         				try {
         					lg = new LocationGetter();
         					user.setCurrentLat(lg.getLatitude());
         	                user.setCurrentLong(lg.getLongitude());
         				} catch (Exception e1) {
         					e1.printStackTrace();
         				}
                         
                        
         				VBox mainBox = new VBox();
                        
         				
         				Scene  main = new Scene(new Group());
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
                     }
                 });
             	
                 no.setOnAction(new EventHandler<ActionEvent>() {
                     @Override public void handle(ActionEvent e) {
                         System.out.println("Declined");
                        System.exit(0);
                     }
                 });
                 
                 
                 usConsentV.getChildren().add(yes);
                 usConsentV.getChildren().add(no);
                 
                 
                 ((Group)usConsent.getRoot()).getChildren().add(usConsentV);

                 primaryStage.setScene(usConsent);
                 primaryStage.show();
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
             }
         });
         vbox.getChildren().add(imageView);
         vbox.getChildren().add(button1);
         
         vbox.setSpacing(10);
         ((Group)scene.getRoot()).getChildren().add(vbox);

         primaryStage.setScene(scene);
         primaryStage.show();
         
         
        
    
    }
    /*
    public void ye(Stage usConsent) throws Exception
    {
    	Scene scene = new Scene(new Group());
        usConsent.setTitle("El Localizador");
        usConsent.setWidth(1000);
        usConsent.setHeight(400);
        
        VBox vbox = new VBox();
        vbox.setLayoutX(20);
        vbox.setLayoutY(20);
        
        HBox hbox = new HBox();
        hbox.setLayoutX(20);
        hbox.setLayoutY(20);
    	
        Label label1 = new Label("User Consent to Location");
        Label label2 = new Label("Do we have permission to determine and use your location for the purpose of this app?");
        
        
        
        
        
        
        
        
        Button button1 = new Button();
        Button button2 = new Button();
      //  button1.setGraphic(new ImageView(image));
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Accepted");
                user.setUserConsent(true);
                LocationGetter lg;
				try {
					lg = new LocationGetter();
					user.setCurrentLat(lg.getLatitude());
	                user.setCurrentLong(lg.getLongitude());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
                
				
                
            }
        });
    	
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.out.println("Declined");
               System.exit(0);
            }
        });
        
        
        
        
        hbox.setSpacing(10);
		hbox.getChildren().addAll(label1, label2, button1, button2);
		
    	
    	
		usConsent.setScene(scene);
        usConsent.show();
    	
    }
    */
    
    
    
    
    
    
    
    
    /*
    public void yee(Stage mainStage) throws Exception
    {
    	Scene scene = new Scene(new Group());
        mainStage.setTitle("El Localizador");
        mainStage.setWidth(1000);
        mainStage.setHeight(400);
        
        VBox vbox = new VBox();
        vbox.setLayoutX(20);
        vbox.setLayoutY(20);
    	
    	
    	
    	
    	
    	
    	
    	
    }
    */
    
    
    
}