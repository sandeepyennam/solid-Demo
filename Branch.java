public class Branch {

    public Branch(String branch)
    {

        if(branch.equals("cse"))
        {
            cse c=new CseDetails();
            c.csCourse();
            c.labTimeTable();
            c.classTimeTable();

        }
        else if(branch.equals("mechanical"))
        {
            mechanical m=new MechDetails();
            m.mechCourse();
            m.classTimeTable();;
            m.labTimeTable();;

        }
        else if(branch.equals("civil"))
        {
            civil c=new CivDetails();
            c.csCourse();
            c.classTimeTable();;
            c.labTimeTable();

        }

    }
}
