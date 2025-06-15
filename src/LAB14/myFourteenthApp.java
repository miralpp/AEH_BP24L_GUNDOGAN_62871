package LAB14;

public class myFourteenthApp {

    interface FuelType {
        String getFuelType();
    }

    static class Diesel implements FuelType {
        public String getFuelType() {
            return "Diesel";
        }
    }

    static class Gasoline implements FuelType {
        public String getFuelType() {
            return "Gasoline";
        }
    }

    static class Electric implements FuelType {
        public String getFuelType() {
            return "Electric";
        }
    }

    static abstract class Vehicle {
        String registrationNumber;
        String vinNumber;
        String color;
        double price;
        double fuelConsumption;
        double fuelLevel;
        double mileage;

        public Vehicle(String registrationNumber, String vinNumber, String color, double price,
                       double fuelConsumption, double fuelLevel, double mileage) {
            this.registrationNumber = registrationNumber;
            this.vinNumber = vinNumber;
            this.color = color;
            this.price = price;
            this.fuelConsumption = fuelConsumption;
            this.fuelLevel = fuelLevel;
            this.mileage = mileage;
        }

        public void drive(double distance) {
            double fuelNeeded = (distance / 100.0) * fuelConsumption;
            if (fuelNeeded <= fuelLevel) {
                mileage += distance;
                fuelLevel -= fuelNeeded;
                System.out.println("You drove " + distance + " km.");
            } else {
                System.out.println("Not enough fuel for the trip.");
            }
        }

        public void refuel(double amount) {
            fuelLevel += amount;
            System.out.println("Refueled " + amount + " liters.");
        }
    }

    static class PassengerCar extends Vehicle {
        int numberOfDoors;

        public PassengerCar(String registrationNumber, String vinNumber, String color, double price,
                            double fuelConsumption, double fuelLevel, double mileage, int numberOfDoors) {
            super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
            this.numberOfDoors = numberOfDoors;
        }
    }

    static class Truck extends Vehicle {
        double loadCapacity;

        public Truck(String registrationNumber, String vinNumber, String color, double price,
                     double fuelConsumption, double fuelLevel, double mileage, double loadCapacity) {
            super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
            this.loadCapacity = loadCapacity;
        }
    }

    static class Motorcycle extends Vehicle {
        boolean hasSidecar;

        public Motorcycle(String registrationNumber, String vinNumber, String color, double price,
                          double fuelConsumption, double fuelLevel, double mileage, boolean hasSidecar) {
            super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
            this.hasSidecar = hasSidecar;
        }
    }

    static class ConstructionEquipment extends Vehicle {
        int hoursWorked;

        public ConstructionEquipment(String registrationNumber, String vinNumber, String color, double price,
                                     double fuelConsumption, double fuelLevel, double mileage, int hoursWorked) {
            super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
            this.hoursWorked = hoursWorked;
        }
    }

    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("ABC123", "1HGCM82633A004352", "Red", 15000,
                7.5, 50, 20000, 4);
        Truck truck = new Truck("XYZ987", "2HGCM82633A004999", "Blue", 30000,
                15, 150, 50000, 5000);
        Motorcycle bike = new Motorcycle("MOTO1", "3HGCM82633A004111", "Black", 8000,
                4, 15, 10000, true);
        ConstructionEquipment excavator = new ConstructionEquipment("CEQ456", "4HGCM82633A004888",
                "Yellow", 50000, 25, 300, 2500, 500);

        car.drive(100);
        car.refuel(20);

        truck.drive(50);
        truck.refuel(40);

        bike.drive(60);
        bike.refuel(5);

        excavator.drive(200);
        excavator.refuel(50);

        Diesel diesel = new Diesel();
        Gasoline gasoline = new Gasoline();
        Electric electric = new Electric();

        System.out.println("Car fuel type: " + gasoline.getFuelType());
        System.out.println("Truck fuel type: " + diesel.getFuelType());
        System.out.println("Motorcycle fuel type: " + gasoline.getFuelType());
        System.out.println("Excavator fuel type: " + diesel.getFuelType());
    }
}
