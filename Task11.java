package GroupTasks2;

class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car {
    private double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSalePrice() * 0.95;
        } else {
            return super.calculateSalePrice() * 0.90;
        }
    }

}

class Truck extends Car {
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return super.calculateSalePrice() * 0.90;
        } else {
            return super.calculateSalePrice() * 0.80;
        }
    }
}

    public class Task11 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(25000, "Blue", 22.5);
        Truck truck = new Truck(30000, "Red", 1800);

        System.out.println("Sedan Sale Price: $" + sedan.calculateSalePrice());
        System.out.println("Truck Sale Price: $" + truck.calculateSalePrice());
    }
}




