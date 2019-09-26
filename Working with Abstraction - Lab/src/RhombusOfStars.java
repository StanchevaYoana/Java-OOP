import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusOfStars {
    public static void main(String[] args) throws IOException {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int row = 1; row <= n; row++) {
            printRow(n, row);
        }

        for (int row = n - 1; row > 0; row--) {
            printRow(n, row);
        }
    }

    private static void printRow(int n, int row) {
        System.out.print(printSpace(" ", n - row));
        System.out.print(printSpace("* ", row));
        System.out.println();
    }

    private static StringBuilder printSpace(String s, int count) {
        StringBuilder str = new StringBuilder();
        while (count-- >0) {
            str.append(s);
        }
        return str;
    }
}
