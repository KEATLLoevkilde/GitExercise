import java.util.Scanner;

public class SuperGreeter {
    public void start(){
        System.out.println("Det virker!");
    }
    public void greet (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Intast navn:");
        String navn = sc.next();
        System.out.println("Hej" + navn);
    }


}
