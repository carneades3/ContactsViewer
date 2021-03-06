/* Main application class that loads and displays the ContactsViewer GUI
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactsViewer extends Application {   
   @Override
   public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("ContactsViewer.fxml"));
      
      Scene scene = new Scene(root);
      stage.setTitle("Contacts Viewer"); // displayed in window's title bar
      stage.setScene(scene);
      stage.setMaximized(true);
      stage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}
