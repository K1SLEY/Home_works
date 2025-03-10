package HW;

class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point start, Point end) {
        this.startPoint = start;
        this.endPoint = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);

    }

    public double getLength() {
        int endX = endPoint.getX() - startPoint.getX();
        int endY = endPoint.getY() - startPoint.getY();
        return Math.sqrt(endX * endX + endY * endY);
    }

    @Override
    public String toString() {
        return String.format(" Линия от %s до %s", startPoint.toString(), endPoint.toString());
    }

    public Point getStartPoint() {
        return startPoint;
    }


    public Point getEndPoint() {
        return endPoint;
    }


}