public class Baguio implements Locations {

    int airFare = 170;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

}