import java.util.ArrayList;
import java.util.List;

public class MechDetails implements mechanical {

        @Override
        public void mechCourse() {
                List<String> subjects=new ArrayList<>();
                System.out.println("The courses in cse branch are \n");
                subjects.add("FM");
                subjects.add("kinematics");
                System.out.println(subjects);

        }

        @Override
        public void classTimeTable() {
                System.out.println("The courses in cse branch are \n");
                System.out.println("FM class is from 10 to 11");
                System.out.println("KS class is from 11 to 12");

        }

        @Override
        public void labTimeTable() {
                System.out.println("The lab timings are\n");
                System.out.println("you have FM lab on every tuesday");
                System.out.println("you have KS lab on every friday");
        }
}
