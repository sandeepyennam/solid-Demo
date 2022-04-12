public class feePayment implements feeRegistration{

    public String studentname;
    public String branch;
    public int totalFee=100000;
    public int due;
    public int feePaid;

    public feePayment(String studentname,String branch,int feePaid)
    {
        this.studentname=studentname;
        this.branch=branch;
        this.feePaid=feePaid;


    }



    @Override
    public int getDue() {
        due=totalFee-feePaid;
        return due;
    }

    public void feePay()
    {
        due=totalFee-feePaid;
        if(due==0)
            System.out.println("Your fee payment is completely done");
        else
            System.out.println("you have paid amount of "+feePaid+" your due is "+due);

    }

    @Override
    public void getReciept() {
       if(due<50000) {
           System.out.println("Here is your reciept\n");
           System.out.println("you have paid the amount" + feePaid + "\nyour remaining amount is" + due);
       }
       else
           System.out.println("you have to pay the minimum amount to be registered");
    }






}
