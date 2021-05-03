package JavaDrills.OOP2;

//1. First we decide the classes
//2. Then we decide on the composition, how each class is made. IE: CUstomer has rwo different objects
//3. How you would like the creation of the objects
//4. Then the different operations involved

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("818 Dover Street, ", " Lawrenceville ", "NJ ", "08647");
        Customer customer = new Customer("Angel", homeAddress);

        Address workAddress = new Address("85 River Street, ", "HoJokin ", "BooJersey ", " 069069");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
