package questions;
public class Employee {
    public static void main(String[] args) {
        User obj1 = new User("Uma",new Address("Ardee City"));
        System.out.println(obj1.toString());
    }
}
final class User {
    String name;
    Address address;
    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address.getAddress() +
                '}';
    }
}
final class Address{
    final String address;
    public Address(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
}