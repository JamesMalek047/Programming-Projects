/**
 * Ce code source sert d'un test pour l'objet dans la classe enfant Sphere
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */
public class TestSphere {
    public static void main(String args[]) {
        Sphere sph = new Sphere("VIOLET", 5);
        double volume = sph.getVolume();
        System.out.println(volume);
    }

}
