public class Main{
    public static void main(String[] args) {

        Human h1 = new Human("Bob",40);
        Human h2 = new Human("Tom",30);
        h1.prinNuberOfPeople();
        h2.prinNuberOfPeople();
        Human h3 = new Human("Kot",50);
        h1.prinNuberOfPeople();
        h2.prinNuberOfPeople();
        h3.prinNuberOfPeople();

        //Human.description = "Nice";
       //h1.getAllFields();
      //h2.getAllFields();
      //Human.description = "Bad";
        // h1.getAllFields();
       //h2.getAllFields();


    }
}
class Human{
    private String name;
    private int age;
    private static int countPeople; //автомат равна 0

   // public static String description;
    public Human(String name, int age){
        this.name=name;
        this.age=age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public void prinNuberOfPeople(){
        System.out.println("number of people "+countPeople);
    }
}