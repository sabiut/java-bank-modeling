package bankmodel;
import processing.Processing;

public class Main {

    public static void start(){

        Processing processing= new Processing("ABoi322","Jame Thomas",
                "Brown Street","2365984","jthomas@gmail.com", 6000);

        processing.displyCustomer();

        System.out.println();
        processing.deposit(2000);

        System.out.println();
       // processing.withdraw(3000);

    }

    public static void main(String[] args) {

      start();



    }
}
