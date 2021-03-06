package exo2.shapes.shapes3D;

import exo2.Geometry;

import java.util.Objects;

public class Cylinder extends Geometry3D {

    private String name;
    private double rayon;
    private double hauteur;

    public Cylinder(String name,double startX, double startY, double startZ, double rayon, double hauteur) {
        super(startX, startY, startZ);
        this.rayon = rayon;
        this.hauteur = hauteur;
        this.name = name;
    }

    public double getRayon() {
        return rayon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.rayon, rayon) == 0 &&
                Double.compare(cylinder.hauteur, hauteur) == 0;
    }

    @Override
    public int compareTo(Geometry3D ob) {
        return super.compareTo(ob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rayon, hauteur);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "rayon=" + rayon +
                ", hauteur=" + hauteur +
                '}';
    }

    @Override
    public double area() {
        return 2* Geometry.PI*rayon*hauteur;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("rayon : "+rayon + " ; hauteur : "+hauteur);
    }

    @Override
    public double volume() {
        return Geometry.PI*rayon*rayon*hauteur;
    }
}
