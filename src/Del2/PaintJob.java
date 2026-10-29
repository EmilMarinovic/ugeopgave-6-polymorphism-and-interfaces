package Del2;

import java.util.ArrayList;

public class PaintJob {
    private String name;
    private ArrayList<Shape> surfaces;
    private ArrayList<Shape> deductions;

    public PaintJob(String name) {
        this.name = name;
        this.surfaces = new ArrayList<>();
        this.deductions = new ArrayList<>();
    }

    public void addSurface(Shape s) {
        surfaces.add(s);
    }

    public void addDeduction(Shape s) {
        deductions.add(s);
    }

    public double getTotalSurface() {
        double total = 0;
        for (Shape s : surfaces) {
            total += s.getArea();
        }
        return total;
    }

    public double getTotalDeductions() {
        double total = 0;
        for (Shape s : deductions) {
            total += s.getArea();
        }
        return total;
    }

    public double getPaintableArea() {
        return getTotalSurface() - getTotalDeductions();
    }

    public void printSummary() {
        System.out.println("=== Malerberegner: " + name + " ===");
        System.out.println("Skal males: " + getPaintableArea() + " m²");
    }
}
