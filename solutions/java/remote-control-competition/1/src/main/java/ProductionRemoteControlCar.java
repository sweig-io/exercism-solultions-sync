class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled;
    private int numberOfVictories;

    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.getNumberOfVictories());
    }

    public void drive() {
        this.distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

}
