package solidLab.p05_DependencyInversion.p01_HelloWord;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.greeting("Yoana", LocalDateTime.now().getHour()));
    }
}
