package bankingapplication1;

public class Customer {
    int idCard;
    String firstName;
    String lastName;
    Customer(int idCard, String firstName, String lastName) {
        this.idCard = idCard;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getIdCard() {
        System.out.println("ID Card: " + idCard);
    }
    public void getFirstName() {
        System.out.println("First Name: " + firstName);
    }
    public void getLastName() {
        System.out.println("Last Name: " + lastName);
    }
}