/**
 * Ce code source sert d'un test pour l'objet dans la classe enfant Cylinder
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */
public class TestCylinder {
    public static void main(String args[]) {
        double volume;

        Cylinder cyl = new Cylinder("NOIR", 16, 11);
        volume = cyl.getVolume();
        System.out.println(volume);

        Cylinder cyl2 = new Cylinder("BLEU", -16, -1);
        volume = cyl2.getVolume();
        System.out.println(volume);
    }
}
