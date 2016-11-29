/**
 * Ansvar: Magnus
 */
public class Customer {
    private String name;
    private String phone;

    public Customer(String name, String phone){
        setName(name);
        setPhone(phone);
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

    public void setName(String name){
        this.name = name;
    }

    public boolean verifyPhone(){
        if(phone.length() == 8) return true;
        else return false; //evt exception
    }
}
