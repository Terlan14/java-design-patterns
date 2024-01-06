// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class School
{
    public static void main(String[] args)
    {
        AssignmentWork assignmentWork=new AssignmentWork();
        PenAdapter penAdapter=new PenAdapter();
        assignmentWork.setPen(penAdapter);
        assignmentWork.writeAssignment("i am tired to write ");
    }
}