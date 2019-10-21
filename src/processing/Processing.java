package processing;


import cutomer.Customer;

public class Processing extends Customer {

    public Processing(String accoutNumber, String name, String address, String phone, String email, int balance) {
        super(accoutNumber, name, address, phone, email, balance);
    }

    public void displyCustomer(){

        System.out.println("Account Number:" + this.accoutNumber+"\n"
                +"Name:"+ this.name+"\n"+"Address:"+this.address+"\n"+
                "Phone:"+this.phone+"Email:"+this.email+"\n"+"Current Balance:"
                +this.balance);
    }

    public void deposit(int deposit){
        this.balance +=deposit;
        System.out.println("You have deposited "+ "$"+deposit+ " into the account "+ this.accoutNumber+
                " You new balance is "+ "$"+this.balance);
    }

    public void withdraw(int withdraw){
        if(this.balance-withdraw<0){
            System.out.println("You have insufficient Fund");

        }else {
            this.balance=this.balance-withdraw;
            System.out.println("You have withdraw "+ "$"+withdraw + " from the account " + this.accoutNumber+ "\n"
            + "You new balance is "+ "$"+this.balance);
        }
    }
}
