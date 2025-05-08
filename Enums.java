public class Enums {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        Day.FRIDAY.display();
    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRIDAY, SATURDAY;

    void display() {
        System.out.println("Today is " + this.name());
    }
}
