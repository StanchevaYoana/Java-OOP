package HotelReservation;

public enum Seasons {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplier;

    Seasons(Integer code) {
        this.multiplier = code;
    }

    public Integer getCode() {
        return this.multiplier;
    }
}
