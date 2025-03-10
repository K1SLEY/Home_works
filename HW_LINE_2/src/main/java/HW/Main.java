package HW;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(1, 3), new Point(5, 8));
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.getEndPoint(), line2.getStartPoint());
        System.out.println("Линия 3 до изменения: " + line3);
        line3.getStartPoint().setX(3);
        line3.getStartPoint().setY(11);
        line3.getEndPoint().setX(25);
        line3.getEndPoint().setY(16);
        System.out.println("Линия 3 после изменения: " + line3);
        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Общая длина линий " + totalLength);
        System.out.println();

    }


}
