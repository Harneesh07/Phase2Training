class Employee {
    int id;
    String name;
    double basic, hra, da, bonus, tax, gross, net;

    void accept(int i, String n, double b) {
        id = i;
        name = n;
        basic = b;
    }

    void calculate() {
        hra = basic * 0.20;
        da = basic * 0.10;
        bonus = basic * 0.05;
        gross = basic + hra + da + bonus;
        tax = gross * 0.08;
        net = gross - tax;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Bonus: " + bonus);
        System.out.println("Tax: " + tax);
        System.out.println("Gross: " + gross);
        System.out.println("Net: " + net);
        System.out.println();
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        e1.accept(1, "Arun", 30000);
        e2.accept(2, "Bala", 40000);
        e3.accept(3, "Kiran", 25000);
        e4.accept(4, "Ravi", 50000);
        e5.accept(5, "John", 35000);

        e1.calculate();
        e2.calculate();
        e3.calculate();
        e4.calculate();
        e5.calculate();

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();

        Employee high = e1;
        Employee low = e1;

        if (e2.net > high.net) high = e2;
        if (e3.net > high.net) high = e3;
        if (e4.net > high.net) high = e4;
        if (e5.net > high.net) high = e5;

        if (e2.net < low.net) low = e2;
        if (e3.net < low.net) low = e3;
        if (e4.net < low.net) low = e4;
        if (e5.net < low.net) low = e5;

        double average = (e1.net + e2.net + e3.net + e4.net + e5.net) / 5;

        System.out.println("Highest Salary: " + high.name);
        System.out.println("Lowest Salary: " + low.name);
        System.out.println("Average Salary: " + average);
    }
}
