import java.util.Scanner;

public class NetherTraveler {
    public static void main(String[] args) throws Exception {
        Scanner overworld1 = new Scanner(System.in);
        double xVal, yVal, zVal, xXVal, zZVal, yYVal, xAnswer, yAnswer, zAnswer, xXAnswer, yYAnswer, zZAnswer, fXAnswer,
                fYAnswer, fZAnswer, portalLocX, portalLocY, portalLocZ;

        // xanswer, y answer, zanswer are the result of the difference i.e Desired
        // Location - Known Location
        // xxanswer, yyanswer, zzanswer is the result of xanswer, yanswer, zanswer / by
        // 8 (the length of a nether block)
        // fxanswer, fyanswer, fzanswer is the result of xx/yy/zz answer + The value of
        // known portal / 8

        System.out.println("Enter desired Overworld X value: "); // Enter the values of your desired X portal location
        xVal = overworld1.nextDouble();

        System.out.println("Enter Overworld Y value: "); // Enter the values of your desired Y portal location
        yVal = overworld1.nextDouble();

        System.out.println("Enter desired overworld Z value: "); // Enter the values of your desired Z location
        zVal = overworld1.nextDouble();

        System.out.println("Enter known Overworld-portal X value: "); // Enter the X value of your known portal
        xXVal = overworld1.nextDouble();
        xAnswer = xVal - xXVal; // Get the differance of X values
        xXAnswer = xAnswer / 8; // Divide the differance result by 8

        System.out.println("Enter known Overworld-portal Y value: "); // Enter the Y value of your known portal
        yYVal = overworld1.nextDouble();
        yAnswer = yVal - yYVal; // Get the differance of Y values
        yYAnswer = yAnswer / 8; // Divide the differance result by 8

        System.out.println("Enter known overworld-portal Z value: "); // Enter the Z value of your known portal
        zZVal = overworld1.nextDouble();
        zAnswer = zVal - zZVal; // Get the differance of Z values
        zZAnswer = zAnswer / 8; // Divide the differance result by 8

        portalLocX = (xXVal / 8);
        portalLocY = (yYVal / 8);
        portalLocZ = (zZVal / 8);

        fXAnswer = portalLocX + xXAnswer;
        fYAnswer = portalLocY + yYAnswer;
        fZAnswer = portalLocZ + zZAnswer;

        System.out.println("Here are your coordinates: "); // Prints text
        System.out.print("XYZ (-X=West)(X=East) " + fXAnswer + " / "); // Prints Text + result of xxanswer
        System.out.print(fYAnswer + " / "); // Prints Text + result of yyanswer
        System.out.println(fZAnswer + " (-Z=North)(Z=South)"); // Prints Text + result of zzanswer
        System.out.println(
                " Make sure to build portal in the Nether. Build by this many blocks not at these set of coordinates!");
    }
}
