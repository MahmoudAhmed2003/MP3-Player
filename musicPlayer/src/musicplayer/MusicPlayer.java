package musicplayer;

import java.util.Scanner;

public class MusicPlayer {

    public static void main(String[] args) {
//        Scanner inn = new Scanner(System.in);
        
        playMusic musicObj = new playMusic();
        playerList p = new playerList();
        p.add("109.wav");
        p.add("106.wav");
        p.add("111.wav");
        p.add("112.wav");
        p.add("113.wav");
        
        musicObj.play("106.wav");
        musicObj.play("109.wav");
        musicObj.play("111.wav");
        musicObj.play("112.wav");
        musicObj.play("113.wav");
        

//        p.getStart();
//        
//        int choice = inn.nextInt();
//        while (true) {
//            switch (choice) {
//                case 1: {
//                    System.out.println("To play Press 1");
//                    playMusic.NameSong = (String) p.Start.next.data;
//                    musicObj.play();
//                    
//                    musicObj.play("109.wav");
//                    musicObj.play("106.wav");
//                    musicObj.play("111.wav");
//                }
//                default:break;
//               
//            }
//        }
    }
}
