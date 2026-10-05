/*This is an example*/
//OK , I'll add adder and s37684 will add subtractor
public class Main{
    public static void main(String[] args){
        Adder adder = new Adder();
        System.out.println(Adder.add(1,2));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6,3));
    }
}
