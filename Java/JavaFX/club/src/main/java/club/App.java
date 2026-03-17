package club;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Clubs[] listaClubs = new Clubs[0];

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    public static void addClub(Clubs club) {
        listaClubs = Arrays.copyOf(listaClubs, listaClubs.length + 1);
        listaClubs[listaClubs.length - 1] = club;
    }
    
    public static String getClubs() {
        return Arrays.deepToString(listaClubs);
    }

    public static void main(String[] args) {
        launch();
    }

}