public class Regestration {

     //Dependency Inversion
    public static String branch;
    static feeRegistration fee;

    public Regestration(feeRegistration fee)
    {
        this.fee=fee;

        if(fee.getDue()>50000)
            System.out.println("please pay atleast half amount to be registered");
        else
            System.out.println("you have successfully registered");

    }

    public static void main(String[] args) {

        System.out.println("Here is your fee reciept \n");

        fee.getReciept();

    }





}
