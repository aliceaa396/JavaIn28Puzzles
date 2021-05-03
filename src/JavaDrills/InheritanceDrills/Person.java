package JavaDrills.InheritanceDrills;

public class Person {


    private String name;
    private String email;
    private String phoneNum;

    //Super constructor
    //name is the only value we want to require

    public Person(String name){
        super();
        this.name = name;
        System.out.println("PErson Class");
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String toString(){
        return name + "|====|" + email + "|====|" + phoneNum + "|====|";
    }
}
