package SandwichA.SAndwich;
import java.util.ArrayList;

public class main {
    public static void main(String[] arg){
        Blueberry blueberry = new Blueberry();
        Bacon Bacon = new Bacon();
        Pumkin pumkin = new Pumkin();
        Egg Egg = new Egg();
        Avocado avocado = new Avocado();

        ArrayList<String> arr = new ArrayList<>();
        arr.add(blueberry.blue());
        arr.add(Bacon.bb());
        arr.add(pumkin.pp());
        arr.add(Egg.ee());
        arr.add(avocado.aa());

        for(int i =0; i< arr.size(); i++){
            System.out.println(arr.get(i));
        }
       


    }
    
}
