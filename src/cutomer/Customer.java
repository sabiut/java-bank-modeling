package cutomer;

public class Customer {

    protected String accoutNumber;
    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    protected int balance;

    public Customer(String accoutNumber,String name,String address,String phone,String email,int balance) {
        this.accoutNumber = accoutNumber;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.balance = balance;
    }


    //getters
    public String getAccoutNumber() {
        return accoutNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getBalance() {
        return balance;
    }


    //setters

    public void setAccoutNumber(String accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
