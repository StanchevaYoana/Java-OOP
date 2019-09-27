package HotelReservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] data = reader.readLine().split("\\s");
        double price = Double.parseDouble(data[0]);
        int numOfDays = Integer.parseInt(data[1]);
        Seasons season = Seasons.valueOf(data[2].toUpperCase());
        DiscountType discountType = discountParser(data[3]);

        Reservation reservation = new Reservation(price, numOfDays, season, discountType);
        double result = PriceCalculator.calculate(reservation);
        System.out.printf("%.2f", result);
    }

    private static DiscountType discountParser(String discount) {
        Pattern pattern = Pattern.compile("[A-Z]+[a-z]*");
        Matcher matcher = pattern.matcher(discount);
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            if (counter > 0) {
                sb.append("_");
            }
            sb.append(matcher.group(0).toUpperCase());
            counter++;
        }
        return DiscountType.valueOf(sb.toString());
    }
}
