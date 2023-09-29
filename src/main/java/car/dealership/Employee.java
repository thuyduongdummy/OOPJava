package car.dealership;

public class Employee {
    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if (finance == true){
            double loan = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loan);
        } else if (vehicle.getPrice()<= cust.getCashOnHand()){
            //customer pays in cash
            processTransaction(cust, vehicle);
        } else {
            System.out.println("The customer will need to have more money to purchase "+ vehicle);
        }

    }

    private void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("Customer has purchase "+ vehicle+ " for the price of "+vehicle.getPrice());
    }

    private void runCreditHistory(Customer cust, double loan) {
        System.out.println("Ran credit history for Customer...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }
}
