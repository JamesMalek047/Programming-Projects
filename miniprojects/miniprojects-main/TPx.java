import java.util.Scanner;

/**
 * Cette application est un moyen pour afficher différentes valeurs oscillentes de 0 à 255 sur un tableau de 6 par 9. Ensuite, l'application demande les coordonnées que l'utilisateur veut et ensuide l'envoyé la valeur appropriée.
 * @author James Malek
 * @version 06 juin 2022
 */

public class TPx {
    public static Scanner keyboard = new Scanner(System.in);
    static int[] pixels;
    static int L, H;

    public static void main(String[] args) {
        L = 6;
        H = 9;
        pixels = new int[L * H];
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = (int)(Math.random() * 255);
        }

        while (true) {
            System.out.println("Pour continuer, pitoner le 1");
            System.out.println("Pour quitter, pitoner le 2");
            int userinput = keyboard.nextInt();
            if (userinput == 1) {
                showTable();
                showValue();
            } else if (userinput == 2) {
                System.out.println("Bonne journée");
                break;
            }
        }
    }

    static void showTable() {
        for (int y = 0; y < H; y++) {
            for (int x = 0; x < L; x++) {
                System.out.printf("%-5d ", pixels[x + (y * L)]);
            }
            System.out.println();
        }
    }

    static void showValue() {
        System.out.println("Inscrivez un domaine des colonnes ");
        int x = keyboard.nextInt();

        System.out.println("Inscrivez un image des images ");
        int y = keyboard.nextInt();

        int index = x + (y * L);
        System.out.println(pixels[index]);
    }
}