package car.dealership;

public class Dealership {
    public static void main(String[] args){
        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress(" 123 Random Str");
        cust1.setCashOnHand(12000);

        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Honda");
        vehicle.setModel("Accord");
        vehicle.setPrice(1000);
        Employee emp = new Employee();
        cust1.purchaseCar(vehicle, emp, false );
    }
}
