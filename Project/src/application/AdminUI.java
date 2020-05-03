package application;


import javafx.application.Application;

import java.net.URL;
import java.sql.SQLException;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
public class AdminUI extends Application{

	Scene scene3;
	boolean pizza1 = false;
	boolean pizza2 = false;
	boolean pizza3 = false;
	boolean pizza4 = false;
	boolean pizza5 = false;
	boolean pizza6 = false;
	boolean pizza7 = false;
	boolean pizza8 = false;
	boolean pizza9 = false;
	boolean drink1 = false;
	boolean drink2 = false;
	boolean drink3 = false;
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane root = new StackPane();
		
		Label close = new Label("X");
		close.setFont(Font.font(20));
		close.setTextFill(Color.RED);
		close.setTranslateX(560);

		
		Label head = new Label("ADMINISTRATOR");
		head.setTranslateX(30);
		head.setFont(Font.font(40));
		
		Label sub_head = new Label("Welcome to administrator to Pizza Ordering System");
		sub_head.setTranslateX(50);
		
		//1
		URL url1 = getClass().getResource("1.jpg");
	
		Image im1 = new Image(url1.toString(),40,40,false,true);
        
        ImageView imv1 = new ImageView(im1);
		
		Label l1 = new Label("Pizza 1  ");
		l1.setFont(Font.font(30));
		
		Button b1 = new Button("ADD");
		b1.setTranslateX(4);
		b1.setTranslateY(10);
		
		HBox hb1 = new HBox(8);
		hb1.getChildren().addAll(b1 , imv1 , l1);
		hb1.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//2
		URL url2 = getClass().getResource("2.jpg");
		
		Image im2 = new Image(url2.toString(),40,40,false,true);
        
        ImageView imv2 = new ImageView(im2);
		
		Label l2 = new Label("Pizza 2  ");
		l2.setFont(Font.font(30));
		
		Button b2 = new Button("ADD");
		b2.setTranslateX(4);
		b2.setTranslateY(10);
		
		HBox hb2 = new HBox(8);
		hb2.getChildren().addAll(b2 , imv2 , l2);
		hb2.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//3
		URL url3 = getClass().getResource("3.jpg");
		
		Image im3 = new Image(url3.toString(),40,40,false,true);
        
        ImageView imv3 = new ImageView(im3);
		
		Label l3 = new Label("Pizza 3  ");
		l3.setFont(Font.font(30));
		
		Button b3 = new Button("ADD");
		b3.setTranslateX(4);
		b3.setTranslateY(10);
		
		HBox hb3 = new HBox(8);
		hb3.getChildren().addAll(b3 , imv3 , l3);
		hb3.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		HBox hbb1 = new HBox(8);
		hbb1.getChildren().addAll(hb1,hb2,hb3);
		hbb1.setTranslateX(-130);
		
		//4
		URL url4 = getClass().getResource("4.jpg");
		
		Image im4 = new Image(url4.toString(),40,40,false,true);
        
        ImageView imv4 = new ImageView(im4);
		
		Label l4 = new Label("Pizza 4  ");
		l4.setFont(Font.font(30));
		
		Button b4 = new Button("ADD");
		b4.setTranslateX(4);
		b4.setTranslateY(10);
		
		HBox hb4 = new HBox(8);
		hb4.getChildren().addAll(b4 , imv4 , l4);
		hb4.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//5
		URL url5 = getClass().getResource("5.jpg");
		
		Image im5 = new Image(url5.toString(),40,40,false,true);
        
        ImageView imv5 = new ImageView(im5);
		
		Label l5 = new Label("Pizza 5  ");
		l5.setFont(Font.font(30));
		
		Button b5 = new Button("ADD");
		b5.setTranslateX(4);
		b5.setTranslateY(10);
		
		HBox hb5 = new HBox(8);
		hb5.getChildren().addAll(b5 , imv5 , l5);
		hb5.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//6
		URL url6 = getClass().getResource("6.jpg");
		
		Image im6 = new Image(url6.toString(),40,40,false,true);
        
        ImageView imv6 = new ImageView(im6);
		
		Label l6 = new Label("Pizza 6  ");
		l6.setFont(Font.font(30));
		
		Button b6 = new Button("ADD");
		b6.setTranslateX(4);
		b6.setTranslateY(10);
		
		HBox hb6 = new HBox(8);
		hb6.getChildren().addAll(b6 , imv6 , l6);
		hb6.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		
		HBox hbb2 = new HBox(8);
		hbb2.getChildren().addAll(hb4,hb5,hb6);
		hbb2.setTranslateX(-130);
		
		
		//7
		URL url7 = getClass().getResource("7.jpg");
		
		Image im7 = new Image(url7.toString(),40,40,false,true);
        
        ImageView imv7 = new ImageView(im7);
		
		Label l7 = new Label("Pizza 7  ");
		l7.setFont(Font.font(30));
		
		Button b7 = new Button("ADD");
		b7.setTranslateX(4);
		b7.setTranslateY(10);
		
		HBox hb7 = new HBox(8);
		hb7.getChildren().addAll(b7 , imv7 , l7);
		hb7.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//8
		URL url8 = getClass().getResource("8.jpg");
		
		Image im8 = new Image(url8.toString(),40,40,false,true);
        
        ImageView imv8 = new ImageView(im8);
		
		Label l8 = new Label("Pizza 8  ");
		l8.setFont(Font.font(30));
		
		Button b8 = new Button("ADD");
		b8.setTranslateX(4);
		b8.setTranslateY(10);
		
		HBox hb8 = new HBox(8);
		hb8.getChildren().addAll(b8 , imv8 , l8);
		hb8.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//9
		URL url9 = getClass().getResource("9.jpg");
		
		Image im9 = new Image(url9.toString(),40,40,false,true);
        
        ImageView imv9 = new ImageView(im9);
		
		Label l9 = new Label("Pizza 9  ");
		l9.setFont(Font.font(30));
		
		Button b9 = new Button("ADD");
		b9.setTranslateX(4);
		b9.setTranslateY(10);
		
		HBox hb9 = new HBox(8);
		hb9.getChildren().addAll(b9 , imv9 , l9);
		hb9.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		
		HBox hbb3 = new HBox(8);
		hbb3.getChildren().addAll(hb7,hb8,hb9);
		hbb3.setTranslateX(-130);
		
		
		//10
		URL url10 = getClass().getResource("10.jpg");
		
		Image im10 = new Image(url10.toString(),40,40,false,true);
        
        ImageView imv10 = new ImageView(im10);
		
		Label l10 = new Label("Drink 1 ");
		l10.setFont(Font.font(30));
		
		Button b10 = new Button("ADD");
		b10.setTranslateX(4);
		b10.setTranslateY(10);
		
		HBox hb10 = new HBox(8);
		hb10.getChildren().addAll(b10 , imv10 , l10);
		hb10.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//11
		URL url11 = getClass().getResource("11.jpg");
		
		Image im11 = new Image(url11.toString(),40,40,false,true);
        
        ImageView imv11 = new ImageView(im11);
		
		Label l11 = new Label("Drink 2  ");
		l11.setFont(Font.font(30));
		
		Button b11 = new Button("ADD");
		b11.setTranslateX(4);
		b11.setTranslateY(10);
		
		HBox hb11 = new HBox(8);
		hb11.getChildren().addAll(b11 , imv11 , l11);
		hb11.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//12
		URL url12 = getClass().getResource("12.jpg");
		
		Image im12 = new Image(url12.toString(),40,40,false,true);
        
        ImageView imv12 = new ImageView(im12);
		
		Label l12 = new Label("Drink 3  ");
		l12.setFont(Font.font(30));
		
		Button b12 = new Button("ADD");
		b12.setTranslateX(4);
		b12.setTranslateY(10);
		
		HBox hb12 = new HBox(8);
		hb12.getChildren().addAll(b12 , imv12 , l12);
		hb12.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		
		HBox hbb4 = new HBox(8);
		hbb4.getChildren().addAll(hb10,hb11,hb12);
		hbb4.setTranslateX(-130);
		
		
		VBox vb1 = new VBox(10);
		vb1.getChildren().addAll(close,head,sub_head , hbb1 ,hbb2,hbb3, hbb4);
		vb1.setTranslateX(220);
		
		Alert a = new Alert(AlertType.NONE);
		
		admin ad = new admin();
		
		b1.setOnAction(e ->{
			if (pizza1) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show();
				 
				try {
					ad.check(false, 1);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				pizza1 = true;
				 
				try {
					ad.check(pizza1, 1);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		b2.setOnAction(e ->{
			if (pizza2) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show();
				 
				try {
					ad.check(false, 2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				pizza2 = true;
				 
				try {
					ad.check(pizza2, 2);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		b3.setOnAction(e ->{
			if (pizza3) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 	
				 
				try {
					ad.check(false, 3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				pizza3 = true;
				 
				try {
					ad.check(pizza3, 3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		b4.setOnAction(e ->{
			if (pizza4) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 	
				 
				try {
					ad.check(false, 4);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				pizza4 = true;
				 
				try {
					ad.check(pizza4, 4);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		b5.setOnAction(e ->{
			if (pizza5) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 
				 
				try {
					ad.check(false, 5);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				pizza5 = true;
				 
				try {
					ad.check(pizza5, 5);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		
		b6.setOnAction(e ->{
			if (pizza6) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 	
				 
				try {
					ad.check(false, 6);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				pizza6 = true;
				 
				try {
					ad.check(pizza6, 6);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		b7.setOnAction(e ->{
			if (pizza7) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 	
				 
				try {
					ad.check(false, 7);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				pizza7 = true;
				 
				try {
					ad.check(pizza7, 7);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		b8.setOnAction(e ->{
			if (pizza8) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 	
				 
				try {
					ad.check(false, 8);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				pizza8 = true;
				 
				try {
					ad.check(pizza8, 8);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		b9.setOnAction(e ->{
			if (pizza9) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 		
				 
				try {
					ad.check(false, 9);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				pizza9 = true;
				 
				try {
					ad.check(pizza9, 9);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		b10.setOnAction(e ->{
			if (drink1) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 		
				 
				try {
					ad.check(false, 10);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				drink1 = true;
				 
				try {
					ad.check(drink1, 10);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		b11.setOnAction(e ->{
			if (drink2) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 		
				 
				try {
					ad.check(false, 11);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				drink2 = true;
				 
				try {
					ad.check(drink2, 11);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		b12.setOnAction(e ->{
			if (drink3) {
				a.setAlertType(AlertType.WARNING);
				a.setContentText("DELETED SUCCESFULLY");
				a.show(); 		
				 
				try {
					ad.check(false, 12);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("ADDED SUCCESSFULLY");
				a.show();
				drink3 = true;
				 
				try {
					ad.check(drink3, 12);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		
		
		close.setOnMouseClicked(e ->{
			LoginUI log = new LoginUI();
			log.start(primaryStage);
			primaryStage.setScene(log.scene);
			primaryStage.centerOnScreen();
		});
		
		root.getChildren().addAll(vb1);
		scene3 = new Scene(root,800,400);
		primaryStage.setScene(scene3);
		primaryStage.show();
	}
	
}
