package Del2;

public class Main {

    public static void main(String[] args) {
        PaintJob pj = new PaintJob("Lejlighed");
        PaintCalculator pc = new PaintCalculator();
        pj.addSurface(new Rectangle(8, 7));
        pj.addSurface(new Rectangle(22, 14));
        pj.addSurface(new Square(5));
        pj.addDeduction(new Circle(5));
        pj.addDeduction(new Rectangle(12, 10));
        pj.printSummary();
        System.out.println("Der skal købes " +
                pc.calculatePaint(pj.getPaintableArea(), 12) + " liter maling");
    }
}
