package om;
public class Person {
    private static String name;
    private static String address;

    public Person(String name, String address) {
      this.name = name;
      this.address = address;
    }

    public Person() {
        super();
    }

    public static String getName() {
    return name;

    }
    public static String getAddress(){
    return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public static void afisareInfo(){
       // System.out.println("Name:"+ getName() );
        System.out.println("Address="+ getAddress());
    }

}


