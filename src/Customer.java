/**
 * Ansvar: Magnus
 */
public class Customer {
    private String name;
    private String phone;

    public Customer(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public String getName(){
        return name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}
