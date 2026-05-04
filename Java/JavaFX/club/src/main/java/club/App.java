package club;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import club.model.Pelicula;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Pelicula[] listaPeliculas = new Pelicula[0];

    public static void main(String[] args) {
        cargarDatos();
        launch();
        guardarDatos();
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("main"), 260, 340);
        scene.getStylesheets().add(getClass().getResource("/club/css/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void addClub(Pelicula club) {
        for (int i = 0; i < listaPeliculas.length; i++) {
            if (listaPeliculas[i].equals(club)) {
                throw new IllegalAccessError("Ese pelicula ya esta registrado");
            }
        }
        listaPeliculas = Arrays.copyOf(listaPeliculas, listaPeliculas.length + 1);
        listaPeliculas[listaPeliculas.length - 1] = club;
    }

    public static void removeClub(String club) {
        Pelicula[] temp = new Pelicula[0];
        boolean encontrada = false;

        for (int i = 0; i < listaPeliculas.length; i++) {
            if (listaPeliculas[i].getTitulo().equalsIgnoreCase(club)) {
                encontrada = true;
            } else {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = listaPeliculas[i];
            }
        }

        if (!encontrada) {
            throw new IllegalAccessError("Esa pelicula no esta registrada");
        }

        listaPeliculas = temp;
    }

    public static String getClubs() {
        if (listaPeliculas.length <= 0) {
            return "Sin peliculas";
        } else {
            return Arrays.deepToString(listaPeliculas);
        }
    }

    public static void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("Java\\JavaFX\\club\\src\\main\\java\\club\\data\\peliculas.dat"))) {
            out.writeObject(listaPeliculas);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void cargarDatos() {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Java\\JavaFX\\club\\src\\main\\java\\club\\data\\peliculas.dat"))) {
            listaPeliculas = (Pelicula[]) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}