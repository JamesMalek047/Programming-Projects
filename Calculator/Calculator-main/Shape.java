/**
 * Ce programme est le code source pour calculer l'aire et le périmètre
 * de différentes formes géométriques.
 * 
 * @author James Malek
 * @version 13 janvier 2023
 */

class Shape { // Sur classe ou classe parent

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public double getCircumference() {
        return 0;
    }

    /** Passes through the absolute value of n */
    protected double passThroughPositive(double n) {
        return n >= 0 ? n : -n;
    }
}

class Rectangle extends Shape { // Classes enfants
    private double width; // Encapsulation de width afin d'éviter la modification des variables
    private double length; // Encapsulation de width afin d'éviter la modificaion des variables

    public Rectangle(String color, double width, double length) { // Constructeur
        super(color); // Fait appel à la surclasse
        this.width = passThroughPositive(width);

        // Fait appel que le width de la class correspond au width ici
        this.length = passThroughPositive(length);
    }

    public double getArea() { // Méthode pour calculer la surface
        return this.width * this.length;
    }

    public double getCircumference() { // Méthode pour calculer le périmètre
        return 2 * this.width + 2 * this.length;
    }
}

class Circle extends Shape { // Classes enfants
    private double radius;

    public Circle(String color, double radius) { // Constructeur
        super(color);
        this.radius = passThroughPositive(radius);
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = passThroughPositive(side1);
        this.side2 = passThroughPositive(side2);
        this.side3 = passThroughPositive(side3);
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getCircumference() {
        return side1 + side2 + side3;
    }
}