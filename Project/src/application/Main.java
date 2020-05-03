package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;


/**
 * @author umer
 *
 */
public class Main extends Application {
	boolean loggged = false;
	Scene main ;
	@Override
	public void start(Stage primaryStage) {
		primaryStage.initStyle(StageStyle.UNDECORATED);
		try {
			LoginUI log =new LoginUI();
			log.start(primaryStage);
			primaryStage.setScene(log.scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
