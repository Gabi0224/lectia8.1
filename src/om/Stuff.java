package om;

public class Stuff extends Person {
    private static String school;
    private static double pay;
     public Stuff(String name,String address,String school,double pay){
     }
     public Stuff(){
         super();
     }
     public static String getSchool(){
         return school;
     }
     public void setSchool(String school){
         this.school = school;
     }
     public static double getPay(){
         return pay;
     }
     public void setPay(double pay){
         this.pay = pay;
     }
    public static void afisareInfo() {
        System.out.println("School=" + getSchool());
        System.out.println("Pay=" + getPay());
    }
}
