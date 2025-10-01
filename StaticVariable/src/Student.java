public class Student {
    public String Name;
    public String SeatNo;
    public static String University="KU";//shared among all students
    public static int count=0;
    public static int nextnumber=101;

    //constructor
    public Student (String Name) {
        this.Name=Name;
        this.SeatNo="B24110006"+String.format("%3d",nextnumber);
        nextnumber++;
        count++; //increment whenever a student object is created
    }
    static void ShowTotalStudents(){            //Static method
        System.out.println("Total students admitted: "+ count);

    }
    @Override
    public String toString(){
        return (SeatNo + "-" +Name +"\t"+"("+ University + ")" );

    }

}
