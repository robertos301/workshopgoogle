import java.util.Scanner;

public class ThisIsMain {

    public static void main(String [] args)
    {
        System.out.println("Hello world, hello git hub, hello!!!");
        int [] v = new int[6];

        Scanner sc= new Scanner(System.in);
        int nr=v.length;
        for(int i=0;i<nr;i++) {
            v[i] = sc.nextInt();
            System.out.println(v[i]);
        }
    }

}
