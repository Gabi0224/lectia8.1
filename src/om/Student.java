package om;
public class Student extends Person {
    private static String program;
    private static int year;
    private static double fee;
     public Student(String name,String address,String program,int year,double fee){

     }
     public Student(){
         super();
     }
     public static String getProgram(){
         return program;
     }
     public void setProgram(String program){
         this.program = program;
     }
     public static int getYear(){
         return year;
     }
     public void setYear(int year){
         this.year = year;
     }
     public static double getFee(){
         return fee;
     }

    public void setFee(double fee){
         this.fee = fee;

    }
    public static void afisareInfo() {
        System.out.println("Year=" + getYear());
        System.out.println("Fee=" + getFee());
    }
}
