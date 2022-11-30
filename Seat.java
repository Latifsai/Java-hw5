public class Seat {
    //В Кинотеатре пять посадочных Мест. Каждое посадочное Место имеет порядковый Номер и Признак Занятости.
    // При каждом бронировании Места, программа должна создавать новый Билет, содержащий номер бронируемого Места и Уникальный Номер Билета
    // - случайное число в диапазоне от 1000 до 9999. Каждый созданный билет должен выводится на экран.


    String seatNumber;
    boolean seatStatus;


    public Seat(String seatNumber, boolean seatStatus) {
        this.seatNumber = seatNumber;
        this.seatStatus = seatStatus;
    }

    long book() {

        long ticketRan = (long) (1000 + Math.random() * 9999);
        return ticketRan;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", seatStatus=" + seatStatus +
                '}';
    }
}



