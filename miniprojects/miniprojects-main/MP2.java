import java.util.Scanner;
/**
 * Ce programme se sert comme une calculatrice pour déterminer la force du champ gravitationel sur un corps qui y est placé sur n'importe quel planète de notre système solaire incluant pluto même si ce n'est pas une planète.
 * @author James Malek
 * @version 19 avril 2022
 */

public class MP2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int âge;
        double masse, poids;
        String nom, planet, contributions;

        System.out.println("\nVeux-tu connaitre ton poids? ");

        System.out.println("\nInscrit ton nom: ");
        nom = keyboard.next();

        System.out.println("\nInscrit ton âge: ");
        âge = keyboard.nextInt();

        System.out.println("\nInscrit ta masse ici: ");
        masse = keyboard.nextDouble();

        System.out.println("\nSur quelle planète veux-tu connaître ton poids? ");
        planet = keyboard.next();
        keyboard.nextLine();

        //Ce programme est très conditionnel. C'est pour cette raison il y a plusieurs if statements avec sa propre phrase unique. 

        if (planet.equalsIgnoreCase("terre")) {
            poids = masse * 9.81;
            System.out.print("Ton poids sur terre est de " + poids + "N");
        }

        if (planet.equalsIgnoreCase("mars")) {
            poids = masse * 3.721;
            System.out.print("Ton poids sur mars est de " + poids + "N");
        }

        if (planet.equalsIgnoreCase("mercure")) {
            poids = masse * 3.7;
            System.out.print("Ton poids sur mercure est de " + poids + "N");
        }

        if (planet.equalsIgnoreCase("venus")) {
            poids = masse * 8.87;
            System.out.print("Ton poids sur vénus est de " + poids + "N");
        }

        if (planet.equalsIgnoreCase("jupiter")) {
            poids = masse * 24.79;
            System.out.print("Ton poids sur jupiter est de " + poids + "N");
        }

        if (planet.equalsIgnoreCase("saturne")) {
            poids = masse * 10.44;
            System.out.print("\nTon poids sur saturne est de " + poids + "N");
        }

        if (planet.equalsIgnoreCase("uranus")) {
            poids = masse * 8.87;
            System.out.print("\nTon poids sur uranus est de " + poids + "N");
        }

        if (planet.equalsIgnoreCase("neptune")) {
            poids = masse * 11.15;
            System.out.println("\nTon poids sur neptune est de " + poids + "N");
        }

        if (planet.equalsIgnoreCase("pluto")) {
            poids = masse * 0.62;
            System.out.print("\nLOL pluto n'est plus une planète elle est négligeable. \nTon poids sur pluto est de " + poids + "N");
        }

        System.out.println("\nAs-tu aimé ce programme? ");
        contributions = keyboard.nextLine();

        System.out.println("\nVoici le sommaire des informations: " + âge + "; " + masse + "; " + nom + "; " + planet + "; " + contributions);

    }

}