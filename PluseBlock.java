import java.util.Scanner;

public class PluseBlock{
    public static void main(String[] args){
        int width, height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height and width of blocks : - ");
        do {
            System.out.print("Height(positive integer) : ");
            height = scan.nextInt();
        } while (height <= 0);
        do {
            System.out.print("Width(positive integer) : ");
            width = scan.nextInt();
        } while (width <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("#");

            }
            System.out.print(" ");
            for (int k = 1; k <= width; k++) {

                System.out.print("#");
            }
            System.out.print("\n");
        }

        System.out.println("");

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("#");

            }
            System.out.print(" ");
            for (int k = 1; k <= width; k++) {

                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}