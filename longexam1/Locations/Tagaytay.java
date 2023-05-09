public class Tagaytay implements Locations {

    int airFare = 80;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}