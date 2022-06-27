package SandwichA.SAndwich;

public class Blueberry extends Sandwich {
    public String name = "블루베리샌드위치";
    public String blueberry = "블루베리";
    public String bacon = "베이컨";

    public String blue(){
        return "월요일 : " + name + "    " +"재료 : " +bread + "," + butter + "," + blueberry +"," + bacon ;  
        // System.out.println("월요일 :" +name);
        // System.out.println("재료 : " +bread + "," + butter + "," + bacon +","+ blueberry);
    }
}
