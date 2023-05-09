public class Palawan implements Locations {

    int airFare = 120;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}