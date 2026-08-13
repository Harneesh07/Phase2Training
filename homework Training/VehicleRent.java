abstract class Vehicle {

    void rent(int days) {

        System.out.println("Basic rent for " + days + " days" + " is: " + (days * 1000));
    }

    void rent(int days, boolean insurance) {
        System.out.println("Rent with insurance for " + days + " days" + " is: " + (days * 1000 + 500));
    }

    void rent(int days, boolean insurance, boolean driver) {
        System.out.println("Rent with insurance and driver for " + days + " days" + " is: " + (days * 1000 + 500 + 1000));
    }

    abstract void calculateRent(int days);
}


class Car extends Vehicle {

    @Override
    void calculateRent(int days) {
        int totalRent = days * 2000;
        System.out.println("Car rent: " + totalRent);
    }
}


class Bike extends Vehicle {

    @Override
    void calculateRent(int days) {
        int totalRent = days * 800;
        System.out.println("Bike rent: " + totalRent);
    }
}


class Truck extends Vehicle {

    @Override
    void calculateRent(int days) {
        int totalRent = days * 3000;
        System.out.println("Truck rent: " + totalRent);
    }
}


public class VehicleRent {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.calculateRent(3);

        Vehicle bike = new Bike();
        bike.calculateRent(3);

        Vehicle truck = new Truck();
        truck.calculateRent(3);

        // Method overloading
        car.rent(3);
        car.rent(3, true);
        car.rent(3, true, true);
    }
}