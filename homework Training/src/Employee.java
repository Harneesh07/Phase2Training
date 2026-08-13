class Employee {
    int id;
    String name;
    double basic, net;

    Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
        net = basic + basic * 0.20 + basic * 0.10 + basic * 0.05;
        net = net - net * 0.08;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Arun", 30000);
        Employee e2 = new Employee(2, "Bala", 40000);
        Employee e3 = new Employee(3, "Kiran", 25000);

        Employee high = e1;
        Employee low = e1;

        if (e2.net > high.net) {
            high = e2;
        }
        if (e3.net > high.net){ 
            high = e3;
        }
        if (e2.net < low.net) low = e2;
        if (e3.net < low.net) low = e3;

        double average = (e1.net + e2.net + e3.net) / 3;

        System.out.println("Highest: " + high.name);
        System.out.println("Lowest: " + low.name);
        System.out.println("Average: " + average);
    }
}
