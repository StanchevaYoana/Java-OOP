package HotelReservation;


public class PriceCalculator {

    public static double calculate(Reservation reservation) {

        double basePrice = reservation.getPricePerDay() * reservation.getNumberOfDays()
                * reservation.getSeason().getCode();

        double discount = 1 - (reservation.getDiscountType().getDiscount() / 100.0);
        return basePrice * discount;

    }
}
