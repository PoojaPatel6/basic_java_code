//write a program in java the display pattern like right angle triangle with a number. 
import java.util.Scanner;
public class RightAngleTrangle {

    public static void main(String[] args) {
        
    int x,y,z;
    System.out.println("Input Number: ");
    Scanner S = new Scanner(System.in);

    z = S.nextInt();

    for (x=1; x<=z;x++){

        for(y=1; y<=x; y++){
            System.out.print(y);

        }
        System.out.println("");
    }

}
}
