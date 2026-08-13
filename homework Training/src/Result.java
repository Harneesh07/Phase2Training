import java.util.Scanner;

class Student {
    int id;
    String name;
    int m1, m2, m3, m4, m5;
    int total;
    double average;
    char grade;

    void accept(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter 5 marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
    }

    void calculate() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        System.out.println(id + " " + name + " " +
                           total + " " + average + " " + grade);
    }
}

public class StudentResults {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Student 1");
        s1.accept(sc);
        s1.calculate();

        System.out.println("Student 2");
        s2.accept(sc);
        s2.calculate();

        System.out.println("Student 3");
        s3.accept(sc);
        s3.calculate();

        System.out.println("\nID Name Total Average Grade");

        s1.display();
        s2.display();
        s3.display();

        Student high = s1;
        Student low = s1;

        if (s2.total > high.total)
            high = s2;

        if (s3.total > high.total)
            high = s3;

        if (s2.total < low.total)
            low = s2;

        if (s3.total < low.total)
            low = s3;

        double average = (s1.average + s2.average + s3.average) / 3;

        System.out.println("Highest: " + high.name);
        System.out.println("Lowest: " + low.name);
        System.out.println("Class Average: " + average);
    }
}
