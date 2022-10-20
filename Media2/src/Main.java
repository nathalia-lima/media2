import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A,B,C, Media;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        Media = (A/10*2)+(B/10*3)+(C/10*5);
        System.out.printf("MEDIA = %.1f\n", Media);
    }
}