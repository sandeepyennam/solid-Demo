import java.util.ArrayList;
import java.util.List;

public class CivDetails implements civil{



    @Override
    public void csCourse() {
        System.out.println("The courses in cse branch are \n");
        List<String> subjects=new ArrayList<>();
        subjects.add("CA");
        subjects.add("CS");
        System.out.println(subjects);

    }

    @Override
    public void classTimeTable() {
        System.out.println("The courses in cse branch are \n");
        System.out.println("CA class is from 10 to 11");
        System.out.println("CS class is from 11 to 12");

    }

    @Override
    public void labTimeTable() {
        System.out.println("The lab timings are\n");
        System.out.println("you have java CA on every tuesday");
        System.out.println("you have Construction lab on every friday");
    }
}
