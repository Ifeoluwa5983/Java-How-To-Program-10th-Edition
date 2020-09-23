import javafx.application.Application;
import javafx.events.ActionEvents;
import javafx.events.EventHandleler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Controller extends Application {
    public static void main(String ...args){
        launch(args);
    }
    public static void start(android.content.Context context) {
        android.content.Intent starter = new Intent(context, Controller.class);
        starter.putExtra();
        context.startActivity(starter);
    }
    
}
