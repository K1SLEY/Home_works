package HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PolyLine {
    private ArrayList<Point> points;

    public PolyLine() {
        this.points = new ArrayList<>();
    }


    public PolyLine(List<Point> points) {
        this.points = new ArrayList<>(points);

    }


    public ArrayList<Point> getPoints() {
        return points;
    }


    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += new Line(points.get(i), points.get(i + 1)).getLength();
        }
        return length;

    }


    public List<Line> getLines() {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            lines.add(new Line(points.get(i), points.get(i + 1)));
        }
        return lines;
    }

    @Override
    public String toString() {
        return "{" + points.toString() +
                '}';
    }


}
