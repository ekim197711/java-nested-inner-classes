public class MyProgrma {
    public static void main(String[] args) {
        SpaceShip cool = new SpaceShip("Cool", 35, 12);
        SpaceShip.Captain captain = cool.new Captain();
        captain.sayWelcome();

        SpaceShip.Cargo tomatoes = new SpaceShip.Cargo("Tomatoes", 500);


        cool.flyAround();
    }
}
