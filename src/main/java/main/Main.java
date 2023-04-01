package main;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Customer[] customers = createCustomers();
        System.out.println("-------------");
        printCustomersWithName(customers, "Vasya");
        System.out.println("-------------");
        printCustomersWithCardNumber(customers, 1, 30000);
        System.out.println("-------------");
        printCustomersWithMinusCardBalance(customers);
    }

    Customer[] createCustomers(){
        return new Customer[] {
                new Customer(1, "Ivanov", "Vasya", "Ivanov", "First Str", 12345, 0),
                new Customer(2, "Petrov", "Ivan", "Maksimov", "Second Str", 12435, 10000),
                new Customer(3, "Shevchenko", "Vasya", "Petrovich", "Third Str", 54321, 723),
                new Customer(4, "Ivanova", "Victoria", "Oleksiivna", "Fourth Str", 24257, -584),
                new Customer(5, "Ivanov", "Petya", "Vladymirovich", "First Str", 93841, -50000)
        };
    }

    void printCustomersWithName(Customer[] customers, String name){
        for (Customer c : customers) {
            if (c.getName().equals(name)) {
                System.out.println(c);
            }
        }
    }

    void printCustomersWithCardNumber(Customer[] customers, long min, long max){
        for (Customer c : customers) {
            if (c.getCardNumber()>=min && c.getCardNumber() <= max){
                System.out.println(c);
            }
        }
    }

    void printCustomersWithMinusCardBalance(Customer[] customers){
        int count = 0;
        for (Customer c : customers) {
            if (c.getCardBalance() < 0){
                count++;
            }
        }
        System.out.println("Customers with negative balance = " + count);
        for (Customer c : customers) {
            if (c.getCardBalance() < 0) {
                System.out.println(c);
            }
        }
    }
}
