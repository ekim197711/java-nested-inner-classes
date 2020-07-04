public class SpaceShip {
    private String model;
    private Integer fuel;
    private Integer crew;

    public SpaceShip(String model, Integer fuel, Integer crew) {
        this.model = model;
        this.fuel = fuel;
        this.crew = crew;
    }

    class Captain{
        private String name;

        public void sayWelcome(){
            System.out.println("Hello welcome to "
                    + model + " spaceship. We have "
                    + fuel + "% left. Enjoy your flight.");
        }
    }

    static class Cargo{
        private String type;
        private Integer qty;

        public Cargo(String type, Integer qty) {
            this.type = type;
            this.qty = qty;
        }

        @Override
        public String toString() {
            return "Cargo{" +
                    "type='" + type + '\'' +
                    ", qty=" + qty +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "model='" + model + '\'' +
                ", fuel=" + fuel +
                ", crew=" + crew +
                '}';
    }



    public void flyAround(){
        class DistanceCalculator{
            Integer distance(){
                return fuel *15;
            }
        }
        DistanceCalculator distanceCalculator = new DistanceCalculator();

        System.out.println("Flying around sjuuusshhh. We can fly around for "
                + distanceCalculator.distance()
                + " km berfore refueling!"
                );

        Landing landing = new Landing() {
            @Override
            public void land() {
                System.out.println("Landing slowly and safely. It was fun flying around.");
            }
        };
        landing.land();

        Landing landing2 = () -> System.out.println("Landing fast but still safe.");
        landing2.land();

    }

    public String getModel() {
        return model;
    }

    public Integer getFuel() {
        return fuel;
    }

    public Integer getCrew() {
        return crew;
    }
}
