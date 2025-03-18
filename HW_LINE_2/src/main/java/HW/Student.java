package HW;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, int[] grades) {
        this(name);
        for (int grade : grades) {
            addGrade(grade);

        }
    }

    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
        }
        this.grades.add(grade);
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Оценки: " + grades;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
