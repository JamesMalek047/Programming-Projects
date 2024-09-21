/**
 * Ce code source sert d'un test pour l'objet dans la classe enfant Circle
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */

public class TestCircle {
    public static void main(String args[]) {
        double area;
        double circumference;

        Circle circA = new Circle("VERT", 8); //Déclaration de mon objet de la sous-classe Circle 
        area = circA.getArea();
        circumference = circA.getCircumference();
        System.out.println(area);

        Circle circB = new Circle("ROUGE", -4); //Déclaration de mon objet de la sous-classe Circle 
        area = circA.getArea();
        circumference = circB.getCircumference();
        System.out.println(circumference);
    }
}