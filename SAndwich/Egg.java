package SandwichA.SAndwich;

public class Egg extends Sandwich {
    public String name = "에그샐러드샌드위치";
    public String salad = "샐러드";
    public String egg = "계란";
    
    public String ee(){
        return "목요일 : " + name + "    " +"재료 : " +bread + "," + butter + "," + salad +"," +egg ;  
        // System.out.println("목요일 :" +name);
        // System.out.println("재료 : " +bread + "," + butter + "," + salad +","+egg);
    }
}
