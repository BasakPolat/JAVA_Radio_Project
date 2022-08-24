package radioProject;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static radioProject.User.user;

public class Manager {
    static Scanner scan = new Scanner(System.in);
    static String reply = " ";
    static ArrayList<Store> channelList = new ArrayList<>();

    public static void login() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {


        String login = "\n" + "***************************LMP FM****************************\n" +
                "1-USER LOGIN\n" +
                "2-MANAGER LOGIN\n" +
                "3-OUT";

        System.out.println(login);

        reply = scan.next();
        switch (reply) {
            case "1":
                user();

                break;
            case "2":
                manager();
                break;
            case "3":
                out();
                break;

        }

    }

    public static void manager() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        String manager = "\n" +
                "1: ADD CHANNEL\n" +
                "2: CHANNEL LIST\n" +
                "3: DELETE CHANNEL\n" +
                "4: MAIN MENU\n" +
                "5: OUT";

        System.out.println(manager);
        reply = scan.next();

        switch (reply) {
            case "1":
                addChannel();
                next();
                manager();
                break;
            case "2":
                showChannelList();
                System.out.println("redirecting to the menu...");
                Thread.sleep(3000);
                manager();
                break;
            case "3":
                deleteChannel();
                System.out.println("redirecting to the menu");
                Thread.sleep(3000);
                manager();
                break;
            case "4":
                login();
                break;
            case "5":
                out();
                break;

        }
    }

    public static void out() {
        System.out.println("LMP FM wishes you a pleasant day.");

    }

    public static void deleteChannel() {
        if (channelList.isEmpty()) {
            System.out.println("no channels to delete");
            System.out.println();

        } else {
            System.out.println("The list of channels you want to delete");
            System.out.println(channelList);
            scan.nextLine();
            System.out.println("Type the name of the channel you want to delete");
            String delete = scan.nextLine();

            for (Store each : channelList) {
                if (each.getName().equalsIgnoreCase(delete)) {
                    channelList.remove(each);
                }

            }

        }
    }

    public static void showChannelList() {
        for (Store each : channelList) {
            System.out.println(each);

        }
    }

    public static void addChannel() {
        scan.nextLine();
        System.out.println("Enter the name of the channel you want to add");
        String name = scan.nextLine();

        System.out.println("Enter the frequency of the channel you want to add");
        String frequency = scan.next();

        Store addChannel = new Store(name, frequency);
        channelList.add(addChannel);


    }

    public static boolean next() {
        boolean next = false;
        System.out.println("Do you want to add a new channel? \n +" +
                "Enter Yes or No");
        reply = scan.next();

        while (reply.equalsIgnoreCase("Yes")) {
            addChannel();
            System.out.println("Do you want to add a new channel? \n +" +
                    "Enter Yes or No");
            reply = scan.next();

        }


        return next;
    }



}
