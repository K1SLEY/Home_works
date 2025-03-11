package HW;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        //массив Точек, через которые линия проходит
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
/*

Создайте класс Ломаная (PolyLine), которая будет представлять собой ломаную линию (см. пример на рис.1), которая описывается:


При создании объекта можно ничего не указывать, или указать начальный набор Точек
Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”, где TN – это результат приведения к строке Точки с номером N
Может вернуть массив Линий (getLines)
Может вернуть свою длину (getLength)
Под Точкой имеется ввиду класс, созданный в задании 1 (точка координат). Под Линией имеется ввиду класс, созданный в задании 2 (линия).

Необходимо выполнить следующие задачи:


Рассчитать длину Ломаной
Получить у Ломаной массив Линий
Рассчитать длину массива Линий
Сравнить длину Ломаной и массива Линий: они должны совпасть
Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
Подсказка: текстовое представление объекта лучше реализовывать в переопределенном методе toString()
 */