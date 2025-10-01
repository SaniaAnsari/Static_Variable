//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Sania");
        Student s2=new Student("Zoha");
        Student s3=new Student("Laiba");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        Student.ShowTotalStudents();

        System.out.println("----------"+"After updating university name"+"----------");
        //Change university name
        Student.University="Ned University";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        Student.ShowTotalStudents();

    }
}