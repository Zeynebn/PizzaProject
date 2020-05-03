package application;

import java.net.URL;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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


/**
 * @author iqbal
 *
 */
public class SubscriberUI extends Application{
	
	Scene scene4;
	Label sub_name;
	String pizza1 ;
	String pizza2 ;
	String pizza3 ;
	String pizza4 ;
	String pizza5 ;
	String pizza6 ;
	String pizza7 ;
	String pizza8 ;
	String pizza9 ;
	String drink1 ;
	String drink2 ;
	String drink3 ;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane root = new StackPane();
		
		Subscriber sub = new Subscriber();
		pizza1 = sub.get_check(1);
		pizza2 = sub.get_check(2);
		pizza3 = sub.get_check(3);
		pizza4 = sub.get_check(4);
		pizza5 = sub.get_check(5);
		pizza6 = sub.get_check(6);
		pizza7 = sub.get_check(7);
		pizza8 = sub.get_check(8);
		pizza9 = sub.get_check(9);
		drink1 = sub.get_check(10);
		drink2 = sub.get_check(11);
		drink3 = sub.get_check(12);

		
		
		Label close = new Label("X");
		close.setFont(Font.font(20));
		close.setTextFill(Color.RED);
		close.setTranslateX(740);

		Label head = new Label("SUBSCRIBER");

		head.setFont(Font.font(40));
		
		sub_name = new Label();
		sub_name.setFont(Font.font(15));
		
		//1
		URL url1 = getClass().getResource("1.jpg");
		
		Image im1 = new Image(url1.toString(),40,40,false,true);
        
        ImageView imv1 = new ImageView(im1);
		
		Label l1 = new Label("Pizza 1  ");
		l1.setFont(Font.font(30));
		
		Button b1 = new Button("BUY");
		b1.setTranslateX(4);
		b1.setTranslateY(10);
		
		HBox hb1 = new HBox(8);
		if(pizza1.contains("true"))
			hb1.getChildren().addAll(b1 , imv1 , l1);
		hb1.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//2
		URL url2 = getClass().getResource("2.jpg");
		
		Image im2 = new Image(url2.toString(),40,40,false,true);
        
        ImageView imv2 = new ImageView(im2);
		
		Label l2 = new Label("Pizza 2  ");
		l2.setFont(Font.font(30));
		
		Button b2 = new Button("BUY");
		b2.setTranslateX(4);
		b2.setTranslateY(10);
		
		HBox hb2 = new HBox(8);
		if(pizza2.contains("true"))
			hb2.getChildren().addAll(b2 , imv2 , l2);
		hb2.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//3
		URL url3 = getClass().getResource("3.jpg");
		
		Image im3 = new Image(url3.toString(),40,40,false,true);
        
        ImageView imv3 = new ImageView(im3);
		
		Label l3 = new Label("Pizza 3  ");
		l3.setFont(Font.font(30));
		
		Button b3 = new Button("BUY");
		b3.setTranslateX(4);
		b3.setTranslateY(10);
		
		HBox hb3 = new HBox(8);
		if(pizza3.contains("true"))
			hb3.getChildren().addAll(b3 , imv3 , l3);
		hb3.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		HBox hbb1 = new HBox(8);
		hbb1.getChildren().addAll(hb1,hb2,hb3);
		
		//4
		URL url4 = getClass().getResource("4.jpg");
		
		Image im4 = new Image(url4.toString(),40,40,false,true);
        
        ImageView imv4 = new ImageView(im4);
		
		Label l4 = new Label("Pizza 4  ");
		l4.setFont(Font.font(30));
		
		Button b4 = new Button("BUY");
		b4.setTranslateX(4);
		b4.setTranslateY(10);
		
		HBox hb4 = new HBox(8);
		if(pizza4.contains("true"))
			hb4.getChildren().addAll(b4 , imv4 , l4);
		hb4.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//5
		URL url5 = getClass().getResource("5.jpg");
		
		Image im5 = new Image(url5.toString(),40,40,false,true);
        
        ImageView imv5 = new ImageView(im5);
		
		Label l5 = new Label("Pizza 5  ");
		l5.setFont(Font.font(30));
		
		Button b5 = new Button("BUY");
		b5.setTranslateX(4);
		b5.setTranslateY(10);
		
		HBox hb5 = new HBox(8);
		if(pizza5.contains("true"))
			hb5.getChildren().addAll(b5 , imv5 , l5);
		hb5.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//6
		URL url6 = getClass().getResource("6.jpg");
		
		Image im6 = new Image(url6.toString(),40,40,false,true);
        
        ImageView imv6 = new ImageView(im6);
		
		Label l6 = new Label("Pizza 6  ");
		l6.setFont(Font.font(30));
		
		Button b6 = new Button("BUY");
		b6.setTranslateX(4);
		b6.setTranslateY(10);
		
		HBox hb6 = new HBox(8);
		if(pizza6.contains("true"))
			hb6.getChildren().addAll(b6 , imv6 , l6);
		hb6.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		
		HBox hbb2 = new HBox(8);
		hbb2.getChildren().addAll(hb4,hb5,hb6);
		
		
		//7
		URL url7 = getClass().getResource("7.jpg");
		
		Image im7 = new Image(url7.toString(),40,40,false,true);
        
        ImageView imv7 = new ImageView(im7);
		
		Label l7 = new Label("Pizza 7  ");
		l7.setFont(Font.font(30));
		
		Button b7 = new Button("BUY");
		b7.setTranslateX(4);
		b7.setTranslateY(10);
		
		HBox hb7 = new HBox(8);
		if(pizza7.contains("true"))
			hb7.getChildren().addAll(b7 , imv7 , l7);
		hb7.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//8
		URL url8 = getClass().getResource("8.jpg");
		
		Image im8 = new Image(url8.toString(),40,40,false,true);
        
        ImageView imv8 = new ImageView(im8);
		
		Label l8 = new Label("Pizza 8  ");
		l8.setFont(Font.font(30));
		
		Button b8 = new Button("BUY");
		b8.setTranslateX(4);
		b8.setTranslateY(10);
		
		HBox hb8 = new HBox(8);
		if(pizza8.contains("true"))
			hb8.getChildren().addAll(b8 , imv8 , l8);
		hb8.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//9
		URL url9 = getClass().getResource("9.jpg");
		
		Image im9 = new Image(url9.toString(),40,40,false,true);
        
        ImageView imv9 = new ImageView(im9);
		
		Label l9 = new Label("Pizza 9  ");
		l9.setFont(Font.font(30));
		
		Button b9 = new Button("BUY");
		b9.setTranslateX(4);
		b9.setTranslateY(10);
		
		HBox hb9 = new HBox(8);
		if(pizza9.contains("true"))
			hb9.getChildren().addAll(b9 , imv9 , l9);
		hb9.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		
		HBox hbb3 = new HBox(8);
		hbb3.getChildren().addAll(hb7,hb8,hb9);
		
		
		//10
		URL url10 = getClass().getResource("10.jpg");
		
		Image im10 = new Image(url10.toString(),40,40,false,true);
        
        ImageView imv10 = new ImageView(im10);
		
		Label l10 = new Label("Drink 1 ");
		l10.setFont(Font.font(30));
		
		Button b10 = new Button("BUY");
		b10.setTranslateX(4);
		b10.setTranslateY(10);
		
		HBox hb10 = new HBox(8);
		if(drink1.contains("true"))
			hb10.getChildren().addAll(b10 , imv10 , l10);
		hb10.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//11
		URL url11 = getClass().getResource("11.jpg");
		
		Image im11 = new Image(url11.toString(),40,40,false,true);
        
        ImageView imv11 = new ImageView(im11);
		
		Label l11 = new Label("Drink 2  ");
		l11.setFont(Font.font(30));
		
		Button b11 = new Button("BUY");
		b11.setTranslateX(4);
		b11.setTranslateY(10);
		
		HBox hb11 = new HBox(8);
		if(drink2.contains("true"))
			hb11.getChildren().addAll(b11 , imv11 , l11);
		hb11.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		//12
		URL url12 = getClass().getResource("12.jpg");
		
		Image im12 = new Image(url12.toString(),40,40,false,true);
        
        ImageView imv12 = new ImageView(im12);
		
		Label l12 = new Label("Drink 3  ");
		l12.setFont(Font.font(30));
		
		Button b12 = new Button("BUY");
		b12.setTranslateX(4);
		b12.setTranslateY(10);
		
		HBox hb12 = new HBox(8);
		if(drink3.contains("true"))
			hb12.getChildren().addAll(b12 , imv12 , l12);
		hb12.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,new CornerRadii(2),new BorderWidths(1))));
		
		
		HBox hbb4 = new HBox(8);
		hbb4.getChildren().addAll(hb10,hb11,hb12);
	
		
		VBox vb1 = new VBox(10);
		vb1.getChildren().addAll(close,head,sub_name,hbb1,hbb2,hbb3,hbb4);
		vb1.setTranslateX(40);
		
		
		Alert a = new Alert(AlertType.NONE);
		
		b1.setOnAction(e ->{
			
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b2.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b3.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b4.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b5.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		
		b6.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b7.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b8.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b9.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b10.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b11.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		b12.setOnAction(e ->{
				a.setAlertType(AlertType.CONFIRMATION);
				a.setContentText("BUYED SUCCESSFULLY");
				a.show();
		});
		
		close.setOnMouseClicked(e ->{
			LoginUI log = new LoginUI();
			log.start(primaryStage);
			primaryStage.setScene(log.scene);
			primaryStage.centerOnScreen();
		});
		
		root.getChildren().addAll(vb1);
		scene4 = new Scene(root,800,400);
		primaryStage.setScene(scene4);
		primaryStage.show();
	}
	public void setsubscriber(String name) {
		sub_name.setText("Welcome "+name.toUpperCase()+" ! to Pizza Ordering System");
	}
}
