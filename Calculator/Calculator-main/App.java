import java.util.Scanner;

/**
 * Ce programme s'agit d'une calculatrice conçu avec l'orienté objet.
 * Dans ce code, nous calculons les mesures des surfaces de différentes formes
 * géométriques,
 * les périmètres des formes géométriques, les mesures des volumes de
 * différentes formes géométriques,
 * ainsi que les calculs pour les vecteurs.
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */

public class App {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in); // Défini le type scanner afin de recevoir les réponses des utilisateurs
    int choice = 1;
    while (choice != 10) { // Déclaration du while loop avec la condition pour que la réponse ne soit pas
                           // égale à 10
      display_Menu(); // Appel à la méthode display_Menu() afin de montrer le menu à l'utilisateur
      System.out.print("SVP entrez votre choix: ");
      choice = sc.nextInt(); // Choix de l'utilisateur
      switch (choice) { /*
                         * En Java, l'instruction switch, communément connu comme swith cases, est
                         * une instruction qui peut branchée en différentes voies.
                         */
        case 1: // Même concept que les if-else-if statements
          triangle(); // Appel à la méthode pour calculer l'aire du triangle
          break; // fin de l'exécution de l'instruction étiquetée dans l'instruction switch
        case 2:
          circle();
          break;
        case 3:
          rectangle();
          break;
        case 4:
          cylinder();
          break;
        case 5:
          cube();
          break;
        case 6:
          sphere();
          break;
        case 7:
          add_Vectors();
          break;
        case 8:
          substract_Vectors();
          break;
        case 9:
          multiply_Vectors();
        case 10:
          System.out.println("Aurevoir\n");
          break;
        default: // Default est utilisé lorsqu'aucun des réponses est vraies.
          System.out.println("Mauvais choix\n");
      }
    }
  }

  public static void display_Menu() { // Méthode pour afficher le menu des différents paramètres de la calculatrice
    System.out
        .println("\nBienvenue à la calculatrice géométrique et vectorielle.  Veuillez choisir une forme pour laquelle");
    System.out.println(
        "vous voulez trouver l'aire, la circonférence ou le volume d'une forme. Vous pouvez également calculer ");
    System.out.println("la somme, la différence et le produit scalaire de vecteurs 2D.");
    System.out.println("1. Triangle");
    System.out.println("2. Cercle");
    System.out.println("3. Rectangle");
    System.out.println("4. Cylindre");
    System.out.println("5. Cube");
    System.out.println("6. Sphère");
    System.out.println("7. Additionner deux vecteurs");
    System.out.println("8  Soustraire deux vecteurs");
    System.out.println("9. Multiplier deux vecteurs");
    System.out.println("10. Quitter");
  }

  //
  // MÉTHODES
  //

  public static void triangle() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez la mesure du premier côté: ");
    double side1 = sc.nextDouble(); // Chercher la réponse de l'utilisateur
    System.out.println("Entrez la mesure du deuxième côté: ");
    double side2 = sc.nextDouble();
    System.out.println("Entrez la mesure du troisième côté: ");
    double side3 = sc.nextDouble();
    Triangle t = new Triangle("RED", side1, side2, side3); // Déclaration de l'objet t de la classe Triangle
    double area = t.getArea(); // Calcul de l'aire en se basant sur les valeurs que l'utiliseur inscrit. getArea() est appelé de la sous-classe Triangle.
    System.out.println("\nL'aire est de: " + area); // Affichage de l'aire
    double circumference = t.getCircumference();
    System.out.println("Le périmètre est de: " + circumference);
  }

  public static void circle() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le rayon: ");
    double radius = sc.nextDouble();
    Circle c = new Circle("RED", radius);
    double area = c.getArea();
    double circumference = c.getCircumference();
    System.out.println("\nL'aire: " + area);
    System.out.println("Le périmètre est de: " + circumference);
  }

  public static void rectangle() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez la largeur: ");
    double width = sc.nextDouble();
    System.out.println("Entrez la longueur: ");
    double length = sc.nextDouble();
    Rectangle r = new Rectangle("RED", width, length);
    double area = r.getArea();
    double circumference = r.getCircumference();
    System.out.println("L'aire: " + area);
    System.out.println("Le périmètre: " + circumference);
  }

  public static void cylinder() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le rayon: ");
    double radius = sc.nextDouble();
    System.out.println("Entrez la hauteur: ");
    double height = sc.nextDouble();
    Cylinder cY = new Cylinder("green", radius, height); // Déclaration de l'objet cY de la classe Cylinder
    double volume = cY.getVolume(); // Calcul du volume du cylindre cY
    System.out.println("\n Le volume du cylindre est: " + volume); // Affichage du volume
    System.out.println();
  }

  public static void cube() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez un des côtés: ");
    double side = sc.nextDouble();
    Cube c = new Cube("blue", side);
    double volume = c.getVolume();
    System.out.println("\n Le volume du cube est: " + volume);
  }

  public static void sphere() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrer le rayon: ");
    double radius = sc.nextDouble();
    Sphere s = new Sphere("red", radius);
    double volume = s.getVolume();
    System.out.println("\n Le volume du sphere est: " + volume);
  }

  public static void add_Vectors() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez la première coordonnée: ");
    double firstCoordinatesA = sc.nextDouble();
    System.out.println("X: ");
    double firstCoordinatesB = sc.nextDouble();
    System.out.println("y: ");
    System.out.println("Entrez la deuxième coordonnée: ");
    double secondCoordinatesA = sc.nextDouble();
    System.out.println("x: ");
    double secondCoordinatesB = sc.nextDouble();
    System.out.println("y: ");
    Vector2D v1 = new Vector2D(firstCoordinatesA, firstCoordinatesB); // Déclaration de l'objet v1
    Vector2D v2 = new Vector2D(secondCoordinatesA, secondCoordinatesB); // Déclaration de l'objet v2
    Vector2D v3 = v1.add(v2); // Calcul de la somme des vecteurs v1 et v2
    v1.print(); // Imprimer les valeurs
    v2.print();
    v3.print();
  }

  public static void substract_Vectors() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le premier coordonnée: ");
    System.out.println("x: ");
    double firstCoordinatesA = sc.nextDouble();
    System.out.println("y: ");
    double firstCoordinatesB = sc.nextDouble();
    System.out.println("Entrez la deuxième coordonnée: ");
    double secondCoordinatesA = sc.nextDouble();
    double secondCoordinatesB = sc.nextDouble();
    Vector2D v1 = new Vector2D(firstCoordinatesA, firstCoordinatesB);
    Vector2D v2 = new Vector2D(secondCoordinatesA, secondCoordinatesB);
    Vector2D v4 = v1.substract(v2); //Nous retournons une valeur de type Vector2D de la méthode qu'on a défini
    v1.print();
    v2.print();
    v4.print();
  }

  public static void multiply_Vectors() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le premier coordonnée: ");
    System.out.println("x: ");
    double firstCoordinatesA = sc.nextDouble();
    System.out.println("y: ");
    double firstCoordinatesB = sc.nextDouble();
    System.out.println("Entrez la deuxième coordonnée: ");
    double secondCoordinatesA = sc.nextDouble();
    double secondCoordinatesB = sc.nextDouble();
    Vector2D v1 = new Vector2D(firstCoordinatesA, firstCoordinatesB);
    Vector2D v2 = new Vector2D(secondCoordinatesA, secondCoordinatesB);
    double v5 = v1.scalarproduct(v2);
    v1.print();
    v2.print();
    System.out.println(v5);

  }
}