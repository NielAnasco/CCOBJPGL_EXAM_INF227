public class App {
    public static void main(String[] args) throws Exception {

        Baguio baguio = new Baguio();
        Bohol bohol = new Bohol();
        Boracay boracay = new Boracay();
        Batangas batangas = new Batangas();
        Tagaytay tagaytay = new Tagaytay();
        Palawan palawan = new Palawan(); 

        Me tourist = new Me();

        baguio.accept(tourist);
        bohol.accept(tourist);
        boracay.accept(tourist);
        batangas.accept(tourist);
        tagaytay.accept(tourist);
        palawan.accept(tourist);

    }
}
