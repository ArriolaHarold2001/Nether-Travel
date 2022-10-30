import java.util.Scanner;

public class NetherTraveler {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double xVal, yVal, zVal, xXVal, zZVal, yYVal, xAnswer, yAnswer, zAnswer, xXAnswer, yYAnswer, zZAnswer, fXAnswer,
                fYAnswer, fZAnswer, portalLocX, portalLocY, portalLocZ;

        // xanswer, y answer, zanswer are the result of the difference i.e Desired
        // Location - Known Location
        // xxanswer, yyanswer, zzanswer is the result of xanswer, yanswer, zanswer / by
        // 8 (the length of a nether block)
        // fxanswer, fyanswer, fzanswer is the result of xx/yy/zz answer + The value of
        // known portal / 8

        System.out.println("Enter desired Overworld X value: "); // Enter the values of your desired X portal location
        xVal = scanner.nextDouble();

        System.out.println("Enter Overworld Y value: "); // Enter the values of your desired Y portal location
        yVal = scanner.nextDouble();

        System.out.println("Enter desired overworld Z value: "); // Enter the values of your desired Z location
        zVal = scanner.nextDouble();

        System.out.println("Enter known Overworld-portal X value: "); // Enter the X value of your known portal
        xXVal = (xVal - scanner.nextDouble()) / 8; // Get the differance of X values

        System.out.println("Enter known Overworld-portal Y value: "); // Enter the Y value of your known portal
        yYVal = (yVal - scanner.nextDouble()) / 8; // Get the differance of Y values

        System.out.println("Enter known overworld-portal Z value: "); // Enter the Z value of your known portal
        zZVal = (zVal - scanner.nextDouble()) / 8; // Get the differance of Z values

        portalLocX = (xXVal / 8);
        portalLocY = (yYVal / 8);
        portalLocZ = (zZVal / 8);

        fXAnswer = portalLocX + xXAnswer;
        fYAnswer = portalLocY + yYAnswer;
        fZAnswer = portalLocZ + zZAnswer;

        scanner.close();

        System.out.println("Here are your coordinates: "); // Prints text
        System.out.print("XYZ (-X=West)(X=East) " + fXAnswer + " / "); // Prints Text + result of xxanswer
        System.out.print(fYAnswer + " / "); // Prints Text + result of yyanswer
        System.out.println(fZAnswer + " (-Z=North)(Z=South)"); // Prints Text + result of zzanswer
        System.out.println(
                " Make sure to build portal in the Nether. Build by this many blocks not at these set of coordinates!");
    }
}
