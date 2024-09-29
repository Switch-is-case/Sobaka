package BuilderPattern;

public class House {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    private House(HouseBuilder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House with " + numRooms + " room(s), " + numFloors + " floor(s), " +
                (hasPool ? "a pool" : "no pool") + ", " +
                (hasGarage ? "a garage" : "no garage");
    }


    public static class HouseBuilder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        public HouseBuilder setNumRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }

        public HouseBuilder setNumFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public HouseBuilder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

