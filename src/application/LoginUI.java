package application;

import java.sql.SQLException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * 
 * @author umer
 * JDK 8 , Eclips
 */


public class LoginUI extends Application{
	boolean loggged = false;
	Label message;
	Scene scene ;
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//LOGIN SCREEN
			
			StackPane root = new StackPane();
			
			/**
			 * label for close screen
			 */
			Label close = new Label("X");
			close.setFont(Font.font(20));
			close.setTextFill(Color.RED);
			close.setTranslateX(290);

			
			/**
			 * label for Login Heading
			 */
			Label head = new Label("LOGIN");
			head.setTranslateX(60);
			head.setFont(Font.font(40));
			
			/**
			 * label for Welcome to Pizza Ordering System
			 */
			Label sub_head = new Label("Welcome to Pizza Ordering System");
			sub_head.setTranslateX(20);
			
			
			/**
			 * label for Username , Password
			 */
			Label lbl_user = new Label("Username");
			Label lbl_pass = new Label("Password ");
			

			/**
			 * Textfield for Username , Password
			 */
			TextField tf_user = new TextField();
			PasswordField tf_pass = new PasswordField();
			
			
			/**
			 * Button for Username , register
			 */
			Button login = new Button("LOGIN");
			Button register = new Button("REGISTER");
		
			
			/**
			 *Horzontal box for userlable and user textfield
			 */
			HBox hb1 =new HBox(10);
			hb1.getChildren().addAll(lbl_user ,tf_user);
			
			
			/**
			 *Horzontal box for lbl_pass and tf_pass
			 */
			HBox hb2 =new HBox(10);
			hb2.getChildren().addAll(lbl_pass ,tf_pass);
			
			
			/**
			 *Horzontal box for login and register
			 */
			HBox hb3 =new HBox(20);
			hb3.getChildren().addAll(login,register);
			hb3.setTranslateX(70);
			
			message = new Label();
			
			
			/**
			 *Vertical box for close,head,sub_head,hb1,hb2,hb3,message
			 */
			VBox vb1 = new VBox(20);
			vb1.getChildren().addAll(close,head,sub_head,hb1,hb2,hb3,message);
			vb1.setTranslateX(90);
			
			
			/**
			 * Login class object
			 */
			Login users = new Login();
			
			root.getChildren().addAll(vb1);
			
			close.setOnMouseClicked(e ->{
				primaryStage.close();
			});
			
			login.setOnAction(e ->{			
				try {
					/**
					 * loggged saved the value in true or false according to textfields empty or not
					 */
					loggged = users.isLogin(tf_user.getText(), tf_pass.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (loggged) {
					Subscriber subscriber = new Subscriber();
					subscriber.setName(tf_user.getText());

					SubscriberUI sub_ui = new SubscriberUI();
					try {
						sub_ui.start(primaryStage);
						sub_ui.setsubscriber(subscriber.getName());
						primaryStage.setScene(sub_ui.scene4);
						primaryStage.centerOnScreen();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					if (tf_user.getText().contains("admin") && tf_pass.getText().contains("admin")) {
						AdminUI admin = new AdminUI();
						try {
							admin.start(primaryStage);
							primaryStage.setScene(admin.scene3);
							primaryStage.centerOnScreen();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} else {
						RegisterUI reg = new RegisterUI();
						try {
							reg.start(primaryStage);
							primaryStage.setScene(reg.scene2);
							primaryStage.centerOnScreen();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			});
			
			register.setOnAction(e ->{
				RegisterUI reg = new RegisterUI();
				try {
					reg.start(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				primaryStage.setScene(reg.scene2);
			});
			
			scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
