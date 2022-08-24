package radioProject;


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static radioProject.Manager.out;

public class User {
    public static final String RED="\u001B[31m";
    public static final String GREEN="\u001B[32m";
    public static final String YELLOW="\u001B[33m";
    public static final String BLUE="\u001B[34m";
    public static final String PURPLE="\u001B[35m";
    public static final String CYAN="\u001B[36m";
    public static final String WHITE="\u001B[37m";

    static Scanner scan=new Scanner(System.in);
    static String reply="";

    public static void user() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        String manager="\n"+RED+"Select the channel you want to listen to\n"+
                GREEN+ "1: POWER FM\n"+
                YELLOW+ "2: SLOW FM\n"+
                BLUE+   "3: METRO FM\n"+
                PURPLE+ "4: VIRGIN RADIO\n"+
                CYAN+   "5: DREAM FM\n"+
                WHITE+ "6: OUT";
        System.out.println(manager);
        reply=scan.next();
        switch(reply){
            case "1":
                powerFM();
                break;
            case "2":
                slowFM();
                break;
            case "3":
                metroFM();
                break;
           case "4":
                virginFM();
                break;
           case "5":
                dreamFM();
                break;
           case "6":
               out();
               break;
        }

    }

    private static void powerFM() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/radioProject/the moon.wav");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while(!reply.equals("5")){
            System.out.println(
                    GREEN+ "1 : PLAY \n"+
                    "2 : STOP \n"+
                    "3 : PLAY AGAIN \n"+
                    "4 : CHANNEL LIST \n"+
                    "5 : OUT \n");

            reply=scan.next();
            switch(reply){
                case "1":
                    clip.start();
                    break;
                case "2":
                        clip.stop();
                        break;
                 case "3":
                        clip.setMicrosecondPosition(0);
                        break;
                case "4":
                    clip.stop();
                    user();
                       break;
                 case "5":
                     clip.stop();
                       out();
                       break;
                default:
                    System.out.println("Entry is invalid\n"+
                            "You are taken to the selection screen");
                    Thread.sleep(3000);
            }
        }


    }



    private static void slowFM() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/radioProject/src_radyoProjesi_Riv-Riv-Riv.wav");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while(!reply.equals("5")){
            System.out.println(
                    GREEN+"1 : PLAY \n"+
                            "2 : STOP \n"+
                            "3 : PLAY AGAIN \n"+
                            "4 : CHANNEL LIST \n"+
                            "5 : OUT \n");

            reply=scan.next();
            switch(reply){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    user();
                    break;
                case "5":
                    clip.stop();
                    out();
                    break;
                default:
                    System.out.println("Entry is invalid\n"+
                            "You are taken to the selection screen");
                    Thread.sleep(3000);
            }
        }


    }



    private static void metroFM() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/radioProject/PAnda.wav");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while(!reply.equals("5")){
            System.out.println(
                    GREEN+ "1 : PLAY \n"+
                            "2 : STOP \n"+
                            "3 : PLAY AGAIN \n"+
                            "4 : CHANNEL LIST \n"+
                            "5 : OUT \n");

            reply=scan.next();
            switch(reply){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    user();
                    break;
                case "5":
                    clip.stop();
                    out();
                    break;
                default:
                    System.out.println("Entry is invalid\n"+
                            "You are taken to the selection screen");
                    Thread.sleep(3000);
            }
        }


    }



    private static void virginFM() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/radioProject/ezhel.wav");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while(!reply.equals("5")){
            System.out.println(
                    GREEN+   "1 : PLAY \n"+
                            "2 : STOP \n"+
                            "3 : PLAY AGAIN \n"+
                            "4 : CHANNEL LIST \n"+
                            "5 : OUT \n");

            reply=scan.next();
            switch(reply){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    user();
                    break;
                case "5":
                    clip.stop();
                    out();
                    break;
                default:
                    System.out.println("Entry is invalid\n"+
                            "You are taken to the selection screen");
                    Thread.sleep(3000);
            }
        }


    }





    private static void dreamFM() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File file=new File("src/radioProject/the moon.wav");
        AudioInputStream inputStream= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(inputStream);

        while(!reply.equals("5")){
            System.out.println(
                    GREEN+  "1 : PLAY \n"+
                            "2 : STOP \n"+
                            "3 : PLAY AGAIN \n"+
                            "4 : CHANNEL LIST \n"+
                            "5 : OUT \n");

            reply=scan.next();
            switch(reply){
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
                    break;
                case "4":
                    clip.stop();
                    user();
                    break;
                case "5":
                    clip.stop();
                    out();
                    break;
                default:
                    System.out.println("Entry is invalid\n"+
                            "You are taken to the selection screen");
                    Thread.sleep(3000);
            }
        }


    }


}
