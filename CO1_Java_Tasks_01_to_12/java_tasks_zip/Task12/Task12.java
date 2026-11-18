class Vehicle {
    String vehicleNo;

    Vehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    double calculateFee() {
        return 30;
    }
}

class E_Bike extends Vehicle {
    E_Bike(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double calculateFee() {
        return 15;
    }
}

class DeliveryVan extends Vehicle {
    DeliveryVan(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double calculateFee() {
        return 60;
    }
}

class VisitorPass {
    void displayPass() {
        System.out.println("One Day Visitor Pass");
        System.out.println("Valid for One Day");
    }
}

public class Task12 {
    public static void main(String[] args) {
        E_Bike bike = new E_Bike("TN01AB1111");
        DeliveryVan van = new DeliveryVan("TN02CD2222");
        System.out.println("E-Bike Fee: Rs " + bike.calculateFee());
        System.out.println("Delivery Van Fee: Rs " + van.calculateFee());
        VisitorPass pass = new VisitorPass();
        pass.displayPass();
    }
}
