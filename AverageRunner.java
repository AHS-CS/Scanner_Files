//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner {
    public static void main(String args[]) {
        Average test = new Average("9 10 5 20");
        out.println(test);
        out.println("average = " + String.format("%.3f", test.getAverage()) + "\n\n");

        test.setLine("11 22 33 44 55 66 77");
        out.println(test);
        out.println("average = " + String.format("%.3f", test.getAverage()) + "\n\n");

        test.setLine("48 52 29 100 50 29");
        out.println(test);
        out.println("average = " + String.format("%.3f", test.getAverage()) + "\n\n");

        test.setLine("0");
        out.println(test);
        out.println("average = " + String.format("%.3f", test.getAverage()) + "\n\n");

        test.setLine("100 90 95 98 100 97");
        out.println(test);
        out.println("average = " + String.format("%.3f", test.getAverage()) + "\n\n");
    }
}