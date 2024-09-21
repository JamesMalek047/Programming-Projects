/**
 * Ce programme est le code source pour calculer les volumes des différents
 * objet géométriques à trois dimensions. Ici, nous explorons l'utilisation de
 * l'héritage avec trois classes d'enfants. Aussi, nous utilisation le
 * polymorphisme.
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */

class Shape3D { // Surclasse ou communément connu comme parent
    private String color;

    public Shape3D(String color) {
        this.color = color;
    }

    public double getVolume() {
        return 0;
    }

    protected double passThroughPositive(double n) {
        return n >= 0 ? n : -n;
    }
}

class Sphere extends Shape3D { // Premier classe enfant qui va hériter la couleur et le get volume
    private double radius;

    public Sphere(String color, double radius) {
        super(color);
        this.radius = passThroughPositive(radius);
    }

    public double getVolume() {
        return this.radius * this.radius * this.radius * Math.PI * (4 / 3); // Calcul du volume du sphère
    }
}

class Cube extends Shape3D { // Deuxième classe enfant
    private double side;

    public Cube(String color, double side) {
        super(color);
        this.side = passThroughPositive(side);
    }

    public double getVolume() {
        return this.side * this.side * this.side; // Calcul du volume du cube
    }
}

class Cylinder extends Shape3D { // Troisième classe enfant
    private double radius;
    private double height;

    public Cylinder(String color, double radius, double height) {
        super(color);
        this.radius = passThroughPositive(radius);
        this.height = passThroughPositive(height);
    }

    public double getVolume() {
        double area = Math.PI * this.radius * this.radius; // Calcul de l'aire
        return area * height; // Calcul du volume
    }
}