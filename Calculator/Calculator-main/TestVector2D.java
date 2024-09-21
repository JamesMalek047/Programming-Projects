/**
 * Ce code source sert à tester notre classe Vector2D qui subit différentes
 * opérations
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */
public class TestVector2D {
    public static void main(String args[]) {

        Vector2D addvct1 = new Vector2D(9, 8);
        Vector2D addvct2 = new Vector2D(10, 2);
        Vector2D addvct3 = addvct1.add(addvct2);
        addvct3.print();

        Vector2D subvct1 = new Vector2D(5, 9);
        Vector2D subvct2 = new Vector2D(54, -8);
        Vector2D subvct3 = subvct1.substract(subvct2);
        subvct3.print();

        Vector2D multvct1 = new Vector2D(-8, 16);
        Vector2D multvct2 = new Vector2D(50, 8);
        double multvct3 = multvct1.scalarproduct(multvct2);
        multvct1.print();
        multvct2.print();
        System.out.println(multvct3);
    }
}