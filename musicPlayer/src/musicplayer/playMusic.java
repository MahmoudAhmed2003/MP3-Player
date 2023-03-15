package musicplayer;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;

public class playMusic {
//    static String songName;

    public static void play(String songName) {
        Scanner scanner = new Scanner(System.in);

        try {
            File musicPath = new File(songName);
            if (musicPath.exists()) {
               AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);

                String Input = " ";

                while (!Input.equals("c")) {
                    System.out.println("P = play , S = pause , R = restart , M = resume , L = looping , Q = quite");
                    System.out.println("Enter your choice");

                    Input = scanner.next();
                    Input = Input.toUpperCase();

                    switch (Input) {
                        case "P":
                            clip.start();
                            break;

                        case "R":
                            clip.setMicrosecondPosition(0);
                            break;

                        case "S":
                            long clipTimePosition = clip.getMicrosecondPosition();
                            clip.stop();
                            break;

                        case "M":
                            long TimePosition = clip.getMicrosecondPosition();
                            clip.setMicrosecondPosition(TimePosition);
                            clip.start();
                            break;

                        case "L":
                            clip.loop(Clip.LOOP_CONTINUOUSLY);
                            break;

                        case "Q":
                            clip.close();
                            Input = "c";
                            break;

                        default:
                            System.out.println("Soryy !! , Not a valid Input, try again!");
                    }
                }
                System.out.println("Thank youu !!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
