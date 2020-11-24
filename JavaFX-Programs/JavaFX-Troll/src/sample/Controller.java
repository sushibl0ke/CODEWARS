package sample;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller {


    @FXML
    private Button btnDAW;

    @FXML
    private ImageView imgCops;

    @FXML
    private ImageView imgFinger;

    @FXML
    private ImageView imgOil;

    @FXML
    private Label labelMSG;

    @FXML
    private ImageView imgDeath;
    

    @FXML

    void handleCopsImage(MouseEvent event) {

        labelMSG.setText("last input: le cops have found me");
        File Cops = new File("src\\sample\\lecops.wav");
        PlayCops(Cops);
        System.out.println("le cops have found me");

    }

    @FXML
    void handleDeathImage(MouseEvent event) {

        labelMSG.setText("last input: E̶̻͎̹̙̹͈̦̻͉͓͈̯̥̹̦̞͖̤͈͛̏̔̔̑͠ͅW̸̧̛̖͙̏̐͋͆̈̀͌́̉̏̔̈́̇̈́̒̽̔̒͗̈́͘͘͠F̵̡̼͓͚͖͓̥͔̦̦͇̪͙̰̝͔͊̏̃̓͒͛͋̈̆̋̐ͅR̸̢̛̼͎̙̦̻̹͍̬̙̯̭͔̘̳̱̥̹̜̖͓͖̖̿̔͛̉͛͂̇̾̓̒͑͐̀̊̌̓͌̍͛̿́̽̾̉̐̇̏̏͘̚̚̚͠͠͠ͅW̵̡̧̨̹̼͖̱͕͉̼̥̺̱̬̫̼̮͚̯͖͇̩̜̫͙̖͔͈̹̞͖͇͇̥̬̞̏̿̈́̿̑̀͋̊̋̏̽̌̚͘͜͠͝F̵̨̢̢̯͈͉̫̝̣̣̣̲̱̳͎͕̩̯͎̖̮̳̥͛̈́͛͋̈́̈̾W̸̛͎͔̦̝͖͎̜̰̪͚̣͗̃́͗̅̍͂̒͐̽̊̑̽͗͐͊̒͆̎̽̋́͒̈́͆͐̑̿̀̈́͐̄̈́͘̕͘͝͝͝͠Ḑ̵̢̨͉̙͇͈̜͈͚̦̪̤̱̤̪͙̱̘͍͈͙̖̘̘̩͕͍̯̫͌͌̍̈́̿̐̈́̌̄͑̽́̾͐̽͂͛̔͐͗̅͋͐́͋̂͝͠͝@̵̛͈̘̺̙͎͎͆̀͌̈́͗̉̄͒̂́͌̐͒͋̔̿̇̆͗̍̓͒͗̎̉͋̈́̀̆̚̚̚͝͠͠$̸̲̟̜̻̼̈́̌̏̆̽̾̈́̏̚͠͠Q̴̨̧̧̨̧̢̨̡̯͚͎̖͓̞̲̗̥̤̣͙̹͇̻̹̲̹̱͉͔̲̱̙͇͚̺̼͖̠̔̄́͜͜A̶͔͉̾͑͗͋̈́̆̔͗̀̈́̅S̴̡̛̥̘̱̺̬͖͚̽̽͋̀͛̀̐̅̃͂̈̋̐̃͑̃̓́̐̒̔̏̓͊̚͘̚̚̕̕͝͝Ǎ̷̧̠̜̫̗͙̂̈̀̎̐̆̈́̓̿͆̒̈́̍̑̅̄͘̚̚̚̚̚͝Ŝ̵̳̭͔̠͍̥̯̞̳̳̣̐̑͐̋̈́́̈́͒̔͌̀̄̀͛̎̕̕͝Ý̵̢̡̧̢̧̛̦̲̳͉̮̗͓͈̥̝̱̦̯̮̱͈̜̦̯̼̞̰̺̤̟͔͉̯͓̜̻̩̜͎͍̤̀̈́̔̊͆͛͑̓̂̈̍͑̀̊A̷̢̢̧̨̨͇͈̺͖̩̙͖̬̲̮̹͔̖̤̳̯͔̖͈͇̳͇͉̙͎̝̔̐͜ͅͅG̷̢̢̯̯̱̺̘͔̭̙̪̝̜̞̬̰̪̭̦̞͈͈̦̻̗̟̳̺͕͚̭̫̾̈́́̌̓̇̀Ų̵̨̬̞̣̲̝͚̺͇̟͉̖̼̳͓͕̬͔͚̺̭̝͇̲͕̜̙̥̜̺̿̈́̄̍͌̑̈̀͊͗̍͜͝ͅĘ̵̛̛̺̟̻̳̪̘̜͓̩̘̟͎̭̪̝̘̠͚̮͖͉̟̫̥͎̫̯̊̽̍́̋̋͛̿̅̉̍̕͘̚ͅǪ̸̧̛̫͓̠̗̫͎͌̆͊̈̽̈́͗́͂̇̅̍͑́̕͝ͅ!̸̛̛̛̪̖̦̩͈̍͐͂͆͒̅̑̅͛̎̋͂͋͑̈́̔͒̾͋̅̎̓̒̍͋͛̓̓̌̉̿̄̆̚̚͝͝͝ͅ@̴̧̢̧̧̛̣̗̱̰̥͔̱̜̓̃̒͋́͑̃͋͑̐́̆̄͂͋̆̚̚͝͠*̸̨̛̜̤͔̎͗̒̋̐̐͗̏̀͛̄͊̂́̃͗̋́̑͒͗̈̀̅̌̀̂͐͐͑̑̆͋̅͌̚͝͠͝&̸̧̨̨̧̮͈̦̣̜͖̱̭̖͎̰̗͎̱͎̬̼͖͇̘͇̻̞̘̩̥̰̗̇̀̽̽͑͆͊̿̈̍̾͋͗̿͒͗̈́̽̿͋̽͊̕͝͠$̶̨̨̢̛͎̲̬̩͇̩͕͍̲̪̯̤̻̥͚͙̠͚͎̬͔͌̈́͊͂̈́̓̿͜͝#̷̧̛͇̩̳̮̺̹̟̣̼͓̻͈̥͈̱͙̰͋̃̓̀̇̽̈́̎̉͆͑̄̍̿̈̍̿͐̌̋̒̒̾̓̿͛͐́͌̈́̐͊͜͝!̸̢̧̧̛̟̲͕̪̜͍̘͖̼̮̳͖͚̪̪̀̾̍̊̅̒̌͘͝͝ͅẈ̴̨̛̛̪͙̭̜̩̱̮̬̝̙̬̗̟̯͕̱̮̙̳͎͚͔̘͕̞͇̝̻̉̌͒͒̐̎̇͌͛̇̊́̑̓̔̏͌̐̈́̇̊̎̒́̿͂͘̕͝Ǫ̵̠̜̞̥̯͎̥̞̮̘͉̞͔̣̙̠̪͑̑̍̍͐̐̿́̽̔́͑͌̉̆̇̋̊̐͘̕̚͜͝ͅ&̸̡͎̲̻̰͍̈́̏͋̆͝S̶̨̢̨̧̥͈̻̝̤͔̻̺͓͎̦̙̙͖̣̱̣̜̠̫̳͔̻̞̗̯̝̭̳̬̳̼̈́̋̽͊̍̃̚͜͝͝Ǫ̴͙̖̺͎̣͓̱̑́̋̈̒̑̾̀̍̑̀̀͝!̸̨̢̬̙͇͔̟͚̹͍̟̜̜͍͓͚̲̼̳̻̣̯͙̦̖̫̗̹̠͕̮̙̝̟̐̈̈́̏͆̄́̿̇͆̓̐͗̕͘͝Ḑ̵͕̦̮͍̜͍͇̙̖͕͍̮̥̍̔̀̈͆͌̽̈́̉̃͛̑͋̍̾̓̈̇͗̀̚F̷̤̜̗̫̤̥̹̜̼͌̃̊̃̈́̅͗̉̈́̂ͅ!̷̛̪͔̰͓̜͔͇̬͖̰͍̹̯̼̱̏̓̌̊̒̈̋̃̆̿͌̀͒̆̒̃̃̓̀̎͌́͋̇̾̐́̚͘̕͝͝͠#̸̨͍̯̩͙͇̖̳̻̮͍̰̠̹̦̠̣͍̝̹̩̞̖̜͉̳̙̥͛̌̀͂̄̎̽̓̽̌͑͐̃͌̎̚̚͜ͅ%̴̢̡̡̧̩͚̯̜̳͈̥̤̻̻̰̼̟͓̟̯͔̖̘͙͕̲͚͓͖̞̯͛̇͗̽͛̃̈́̂̂̒̽͂̈͐̈̕͝ͅ!̴̨̡̫̭̖͖̺̤͍̱̭́̈́̓̂͜");
        File Death = new File("src\\sample\\death.wav");
        PlayDeath(Death);
        System.out.println("E̶̻͎̹̙̹͈̦̻͉͓͈̯̥̹̦̞͖̤͈͛̏̔̔̑͠ͅW̸̧̛̖͙̏̐͋͆̈̀͌́̉̏̔̈́̇̈́̒̽̔̒͗̈́͘͘͠F̵̡̼͓͚͖͓̥͔̦̦͇̪͙̰̝͔͊̏̃̓͒͛͋̈̆̋̐ͅR̸̢̛̼͎̙̦̻̹͍̬̙̯̭͔̘̳̱̥̹̜̖͓͖̖̿̔͛̉͛͂̇̾̓̒͑͐̀̊̌̓͌̍͛̿́̽̾̉̐̇̏̏͘̚̚̚͠͠͠ͅW̵̡̧̨̹̼͖̱͕͉̼̥̺̱̬̫̼̮͚̯͖͇̩̜̫͙̖͔͈̹̞͖͇͇̥̬̞̏̿̈́̿̑̀͋̊̋̏̽̌̚͘͜͠͝F̵̨̢̢̯͈͉̫̝̣̣̣̲̱̳͎͕̩̯͎̖̮̳̥͛̈́͛͋̈́̈̾W̸̛͎͔̦̝͖͎̜̰̪͚̣͗̃́͗̅̍͂̒͐̽̊̑̽͗͐͊̒͆̎̽̋́͒̈́͆͐̑̿̀̈́͐̄̈́͘̕͘͝͝͝͠Ḑ̵̢̨͉̙͇͈̜͈͚̦̪̤̱̤̪͙̱̘͍͈͙̖͌͌̍̈́̿̐̈́̌̄͑̽́̾͐̽͂͛̔͐͗̅͋͐́͋̂͝͠͝");

    }

    @FXML
    void handleFingerImage(MouseEvent event) {

        labelMSG.setText("last input: >mfw fingerprints are unrecognizable");
        File Finger = new File("src\\sample\\fingerprints.wav");
        PlayFinger(Finger);
        System.out.println("mfw fingerprints are unrecognizable");

    }

    @FXML
    void handleOilImage(MouseEvent event) {

        labelMSG.setText("last input: because i covered myself in oil");
        File Oil = new File("src\\sample\\oil.wav");
        PlayOil(Oil);
        System.out.println("because i covered myself in oil");
    }


        static void PlayFinger(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
        }
    }
    static void PlayCops(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {

        }
    }

    static void PlayDeath(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {

        }
    }

    static void PlayOil(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {

        }

    }

}
