import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;

/**
 * Ce programme, Journal.java, s'agit d'une application afin de laisser l'utilisateur inséré ce qu'ils veulent dans la documentation et le sauvegarder dans un autre fichier sous la forme de "Journal.txt". 
 * @author James Malek
 * @version 06 juin 2022
 */

public class Journal {
    private static Scanner keyboard = new Scanner(System.in);
    public static String filename = "journal.txt";
    public static void main(String[] args) throws Exception {
        FileWriter fileout = new FileWriter(filename, true);

        actualdate();

        String item = activities();

        if (item.equalsIgnoreCase("A")) {
            System.out.println("Écrit quelque chose dans le journal: ");
            String writejournal = keyboard.nextLine();
            fileout.write(writejournal);
            fileout.write(" - ");
            String dateandtime = actualdate();
            fileout.write(dateandtime);
            fileout.close();
        } else if (item.equalsIgnoreCase("B")) {
            Scanner fileIn = new Scanner(new File(filename));
            while (fileIn.hasNextLine()) {
                String journal = fileIn.nextLine();
                System.out.println(journal);
            }
            fileIn.close();
        } else if (item.equalsIgnoreCase("C")) {
            PrintWriter writer = new PrintWriter(filename);
            writer.write("");
            writer.close();
        }
    }


    public static String activities() {
        String options = " ";
        System.out.println("Bienvenu dans ton journal personnel. \n");
        System.out.println("A) Écrire dans le journal");
        System.out.println("B) Lire le journal");
        System.out.println("C) Supprimer le contenu du journal ");
        System.out.print("Activité désirée: ");
        options = keyboard.nextLine();
        return options;
    }

    public static String actualdate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        return dtf.format(now);
    }
}