package SandwichA.SAndwich;

public class Pumkin extends Sandwich {
    public String name = "단호박샌드위치";
    public String pumkin = "단호박";

    public String pp(){
        return "수요일 : " + name + "    " +"재료 : " +bread + "," + butter + "," + pumkin ;  
        // System.out.println("수요일 :" +name);
        // System.out.println("재료 : " +bread + "," + butter + "," + pumkin);
    }
}
