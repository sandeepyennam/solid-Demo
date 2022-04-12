import java.util.Scanner;

public class Main {

  public static void main(String args[]) {

      Scanner sc=new Scanner(System.in);
      String studentName;
      String branch;
      int feePaid;
      System.out.println("please enter the following details \n" +
              "1.name of the student\n" +
              "2.branch of the student\n" +
              "3.amount paid for registration");

      studentName=sc.next();
      branch=sc.next();
      feePaid=sc.nextInt();
      feeRegistration fee=new feePayment(studentName,branch,feePaid);
           fee.feePay();
           fee.getReciept();
      Regestration r = new Regestration(fee);

      Branch branchOfStudent=new Branch(branch);


  }



}
