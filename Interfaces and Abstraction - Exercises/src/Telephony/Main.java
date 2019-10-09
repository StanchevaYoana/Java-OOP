package Telephony;

import Telephony.phone.Smartphone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> listOfNumbers = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        List<String> listOfURLs = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

        Smartphone smarthphone = new Smartphone(listOfNumbers, listOfURLs);

        System.out.println(smarthphone.call());
        System.out.println(smarthphone.browse());
    }
}
