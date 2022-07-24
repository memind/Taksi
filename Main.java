import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        int km;
        double ucret, acilis = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi gir: ");
        km = input.nextInt();

        ucret = acilis + (2.2*km);
        boolean kosul = ucret >= 20;

        String sonUcret = kosul ? "Borcunuz "+ucret+"TL" : "Borcunuz 20TL";
        System.out.println(sonUcret);
    }
}