package Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Child child = new Child(reader.readLine(), Integer.parseInt(reader.readLine()));

        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
