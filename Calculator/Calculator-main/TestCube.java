/**
 * Ce code source sert d'un test pour l'objet dans la classe enfant Cube
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */

public class TestCube {
    public static void main(String args[]) {
        double volume;
        Cube cub = new Cube("BRUN", 7.2);
        volume = cub.getVolume();
        System.out.println(volume);

        Cube ncub = new Cube("BEIGE", -8.5);
        volume = ncub.getVolume();
        System.out.println(volume);
    }
}
