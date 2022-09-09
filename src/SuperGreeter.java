import java.util.Scanner;

public class SuperGreeter {
    Scanner sc = new Scanner(System.in);
    public void start(){
        System.out.println("Det virker!");
    }
    public void greet (){
        System.out.println("Intast navn:");
        String navn = sc.next();
        System.out.println("Hej" + navn);
    }

    public int askAboutAge () {
        System.out.println("Indtast din alder:");
        int alder = sc.nextInt();
        return alder;
    }


}
