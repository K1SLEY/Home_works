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

/*
Создайте класс Линия (Line), расположенную на двумерной плоскости, которая описывается:

Координата начала: Точка
Координата конца: Точка
Создается одним из следующих способов:
с указанием двух Точек
с указанием четырех целых чисел (x y начала и x y конца)
Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
Может вернуть длину Линии. Для расчёта длины следует использовать формулу расчёта гипотенузы: корень суммы квадратов катетов. Для извлечения корня можно использовать Math.sqrt.
Под Точкой имеется ввиду класс, созданный в задании 1 (точка координат).

Создайте три объекта Линии таким образом, чтобы:

Линия 1 начиналась в Точке  {1;3} и кончалась в Точке {5;8}.
Линия 2 начиналась в Точке {10;11} и кончалась в Точке {15;19}
Линия 3 начиналась в Точке конца Линии 1, а кончалась в Точке начала Линии 2
Используя эти объекты, выполните следующее:

Выведите текстовое представление Линии 3 на экран
Измените координаты точек начала и конца Линии 3 таким образом, чтобы изменились все три объекта Линии
Выведите текстовое представление Линии 3 на экран после изменения её состояния
Рассчитайте суммарную длину всех трех линий и выведите её на экран
Подсказка:

·       текстовое представление объекта лучше реализовывать в переопределенном методе toString().

·       наименование метода расчета длины линии - getLength
 */