

public class Main {


    public static void main(String[] args) {
        // true - full

        Seat seat1 = new Seat("N1",false);
        Seat seat2 = new Seat("N2",true);
        Seat seat3 = new Seat("N3",false);
        Seat seat4 = new Seat("N4",true);
        Seat seat5 = new Seat("N5",false);

        System.out.println(seat1);
        System.out.println(seat2 );
        System.out.println(seat3 );
        System.out.println(seat4 );
        System.out.println(seat5);

        if (seat1.seatStatus == true){
            System.out.println("Ваш билет: " + seat1.book() + " на место 1.");
        } if (seat2.seatStatus == true) {
            System.out.println("Ваш билет: " + seat2.book() + " на место 2.");
        } if (seat3.seatStatus == true) {
            System.out.println("Ваш билет: " + seat3.book() + " на место 3.");
        } if (seat4.seatStatus == true) {
            System.out.println("Ваш билет: " + seat4.book() + " на место 4.");
        } if (seat5.seatStatus == true) {
            System.out.println("Ваш билет: " + seat5.book() + " на место 5.");
        }















    }
}