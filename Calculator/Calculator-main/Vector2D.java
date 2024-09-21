/**
 * Ce code source sert pour calculer des vecteurs ensemble avec différents
 * opérations soit l'addition, la soustraction ainsi que la multiplication des
 * vecteurs.
 * 
 * @author James Malek
 * @verstion 13 janvier 2023
 */

class Vector2D {
    double x;
    double y;

    public Vector2D()// Consctructeur avec aucun paramètre où nous retournons des valeurs nuls
    {
        x = 0;
        y = 0;
    }

    public Vector2D(double a, double b)// Constructeur avec des paramètres valides
    {
        x = a;
        y = b;
    }

    public Vector2D add(Vector2D v)// Méthode nommé add afin d'utiliser l'argument v et retourner la valeur finale
                                   // au type Vector2D
    {
        Vector2D tmp = new Vector2D();
        tmp.x = this.x + v.x;
        tmp.y = this.y + v.y;

        return tmp;
    }

    public Vector2D substract(Vector2D v)// Méthode
    {
        Vector2D sub = new Vector2D();
        sub.x = this.x - v.x;
        sub.y = this.y - v.y;

        return sub;
    }

    public double scalarproduct(Vector2D v)// Méthode
    {
        double sp;
        sp = this.x * v.x + this.y * v.y;

        return sp;
    }

    public void print()// Méthode
    {
        System.out.println("Vecteur (" + this.x + ", " + this.y + ") ");
    }
}