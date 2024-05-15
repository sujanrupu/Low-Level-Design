public class Director {
    ICarBuilder carBuilder;
    public Director(ICarBuilder builder) {
        this.carBuilder = builder;
    }

    public void construct() {
        carBuilder.buildEngine();
        carBuilder.buildBody();
        carBuilder.buildChassis();
        carBuilder.buildTyre();
    }
}
