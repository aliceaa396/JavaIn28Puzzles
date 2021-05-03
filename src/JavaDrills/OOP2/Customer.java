package JavaDrills.OOP2;

public class Customer {
    private String name;
    //Below is what is called Object composition,Address will be a class of its own. Customer OBJ has a reference to an instance of the address OBJ.
    private Address homeAddress;
    private Address workAddress;

    //What ever values are mandatory must be in the constructor. So if a work address is optional it should not go in the constructor.
    public Customer(String name, Address homeAddress){
        this.name = name;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }


    //Operations

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
    public Address getHomeAddress() {
        return homeAddress;
    }


    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }
    public Address getWorkAddress() {
        return workAddress;
    }

    public String toString() {
        return String.format("Name: [%s] Home Address: [%s], Work Address: [%s]", name,homeAddress, workAddress);
    }




}
