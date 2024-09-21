/**
 * Ce code source sert d'un test pour l'objet dans la classe enfant Rectangle
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */
public class TestRectangle {
    public static void main(String args[]) {
        double area;
        double circumference;
        Rectangle rectA = new Rectangle("BLEU", 50, 20);
        area = rectA.getArea();
        circumference = rectA.getCircumference();
        System.out.println(area);

        Rectangle rectC = new Rectangle("ORANGE", 25, -62);
        area = rectC.getArea();
        circumference = rectC.getCircumference();
        System.out.println(circumference);
    }
}
