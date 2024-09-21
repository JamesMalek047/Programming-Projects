import java.util.Scanner;

/**
 * Cette application est une calculatrice afin de calculer le périmètre de différentes formes géométrique. Les formes sont: le cercle, le carré, le triangle et le rectange en utilisant divers fonctions pour calculer les différentes paramètres. 
 * @author James Malek
 * @version 06 juin
 */
public class Fonctions {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
        String item;
        boolean fin = false;
        double perimeter;

        accueille();
        while (!fin) {

            item = lanceMenu();

            if (item.equals("1")) {
                System.out.println("Quel est le rayon du cercle? ");
                double rayon = clavier.nextDouble();
                clavier.nextLine();
                perimeter = calculePerimetreCercle(rayon);
                System.out.println("La circonférence est de " + perimeter);
            } else if (item.equals("2")) {
                System.out.println("Quel est la longueur d'une des cotés? ");
                double side = clavier.nextDouble();
                clavier.nextLine();
                perimeter = calculePerimetreCarre(side);
                System.out.println("Le périmètre du carré est de " + perimeter);
            } else if (item.equals("3")) {
                System.out.println("Quelle est la longueur de la base? ");
                double side = clavier.nextDouble();
                clavier.nextLine();
                System.out.println("Quelle est la longueur de l'hauteur? ");
                double side2 = clavier.nextDouble();
                clavier.nextLine();
                perimeter = calculePerimetreRectangle(side, side2);
                System.out.println("Le périmètre du rectangle est de " + perimeter);
            } else if (item.equals("4")) {
                System.out.println("Coté 1");
                double side = clavier.nextDouble();
                clavier.nextLine();
                System.out.println("Coté 2");
                double side2 = clavier.nextDouble();
                clavier.nextLine();
                System.out.println("Coté 3");
                double side3 = clavier.nextDouble();
                clavier.nextLine();
                perimeter = calculePerimetreTriangle(side, side2, side3);
                System.out.println("Le périmètre du triangle est de " + perimeter);
            }
            if (item.equals("5")) {
                fin = true;
            }
        }
    }
    public static void accueille() {
        System.out.println("Bienvenu à la calculatrice de périmètre.");
        System.out.println("Par James Malek.");
    }

    public static String lanceMenu() {
        String choix = "";

        System.out.println("1) Cercle");
        System.out.println("2) Carre");
        System.out.println("3) Rectangle");
        System.out.println("4) Triangle");
        System.out.println("5) Quitter");
        choix = clavier.nextLine();
        return choix;

    }
    public static double calculePerimetreCercle(double rayon) {
        double A;
        A = Math.PI * rayon * 2;
        return A;
    }

    public static double calculePerimetreCarre(double side) {
        double A;
        A = 4 * side;
        return A;
    }

    public static double calculePerimetreRectangle(double hauteur, double base) {
        double A;
        A = 2 * hauteur + 2 * base;
        return A;
    }

    public static double calculePerimetreTriangle(double side, double side2, double side3) {
        double A;
        A = side + side2 + side3;
        return A;
    }

}