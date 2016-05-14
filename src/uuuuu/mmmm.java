package uuuuu;
import javafx.scene.image.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
public class mmmm {
	 public void openFile() {
         try {

             FileChooser fc = new FileChooser();
             File chosen = fc.showOpenDialog(null);
             String path = chosen.getAbsolutePath();
             listview.getItems().clear();

             ListView.getItems().add(chosen.getName());
             if (mediaPlayer != null) {
                 mediaPlayer.stop();
             }

             media = new Media(new File(path).toURI().toString());
             mediaPlayer = new MediaPlayer(media);
             mediaPlayer.play();

             volumeSlider();
             timeSlider();
         } catch (Exception ex) {
         }

     }
//********************************************************************************************

     public void openMultiFiles() {
         try {
             arraylist = new ArrayList<String>();
             FileChooser fc = new FileChooser();
             List<File> chosen = fc.showOpenMultipleDialog(null);
             if (mediaPlayer != null) {
                 mediaPlayer.stop();
             }
             listview.getItems().clear();
             for (int i = 0; i < chosen.size(); i++) {
                 arraylist.add(chosen.get(i).getAbsolutePath());

                 listview.getItems().add(chosen.get(i).getName());

             }
             
             String path = chosen.get(0).getAbsolutePath();
             media = new Media(new File(path).toURI().toString());
             mediaPlayer = new MediaPlayer(media);
             mediaPlayer.play();

             volumeSlider();
             timeSlider();
         } catch (Exception ex) {
         }

     }

}
