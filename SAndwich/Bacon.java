package SandwichA.SAndwich;

public class Bacon extends Sandwich {
    public String name ="상추베이컨샌드위치";
    public String bacon = "베이컨";
    public String lettuce = "상추";

    public Bacon(){}

    public String bb(){
        return "화요일 : " + name + "    " +"재료 : " +bread + "," + butter + "," + bacon +"," +lettuce ;  
        // System.out.println("화요일 :" +name);
        // System.out.println("재료 : " +bread + "," + butter + "," + bacon +","+lettuce);
    }

    
   
}
