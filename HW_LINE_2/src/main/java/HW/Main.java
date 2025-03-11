package HW;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = Arrays.asList(new Point(1, 5), new Point(2, 8), new Point(5, 3), new Point(8, 9));
        PolyLine polyLine = new PolyLine(points);
        System.out.println("Ломаная, проходящую через точки " + polyLine);
        double length = polyLine.getLength();
        System.out.println("Длина ломаной линии: " + length);
        List<Line> lines = polyLine.getLines();
        double linesLength = 0;
        for (Line line : lines) {
            linesLength += line.getLength();
        }
        System.out.println("Длина массива линий: " + linesLength);

        if (length == linesLength) {
            System.out.println("Длины совпадают");
        } else {
            System.out.println("Длины не совпадают");

        }

        Point pointToChange = polyLine.getPoints().get(1);
        pointToChange.setX(12);
        pointToChange.setY(8);
        lines = polyLine.getLines();
        linesLength = 0;
        for (Line line : lines) {
            linesLength += line.getLength();
        }
        System.out.println("Линии после изменения: " + lines);
        System.out.println("Длина массива линий после изменения: " + linesLength);
    }
}
