package SandwichA.SAndwich;

public class Avocado extends Sandwich {
    public String name = "아보카도샌드위치";
    public String avocado = "아보카도";
    public String egg = "계란";
    
    public Avocado() {
        
    }

    public String aa(){
        return "금요일 : " + name + "    " +"재료 : " +bread + "," + butter + "," + avocado +"," +egg ;  
        
        // System.out.println("금요일: "+ name);
        // System.out.println("재료 : " +bread + "," + butter + "," + avocado +","+egg);
    }


    
}
