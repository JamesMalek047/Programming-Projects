/**
 * Ce code source sert d'un test pour l'objet dans la classe enfant Triangle
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */
public class TestTriangle {
    public static void main(String args[]) {
        Triangle tri = new Triangle("GRIS", 5, 8, 9);
        double area = tri.getArea();
        double circumference = tri.getCircumference();
        System.out.println(area);
        System.out.println(circumference);
    }
}