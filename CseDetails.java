import java.util.*;
public class CseDetails implements cse{

    public void csCourse()
    {
        List<String> subjects=new ArrayList<>();
        System.out.println("The courses in cse branch are \n");
        subjects.add("DS");
        subjects.add("Pythom");
        subjects.add("java");
        subjects.add("advance data structures");
        System.out.println(subjects);

    }

    public void classTimeTable()
    {

        System.out.println("The time table is \n");
        System.out.println("DS class is from 10 to 11");
        System.out.println("Python class is from 11 to 12");
        System.out.println("java class is from 1 to 2");
        System.out.println("ADS class is from 2 to 3");
    }

    public void labTimeTable()
    {
        System.out.println("The lab timings are\n");

        System.out.println("you have java lab on every tuesday");
        System.out.println("you have python lab on every friday");


    }

}
