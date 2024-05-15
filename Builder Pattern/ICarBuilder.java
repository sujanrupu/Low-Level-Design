import Models.ICar;

public interface ICarBuilder {
    public void buildEngine();
    public void buildBody();
    public void buildChassis();
    public void buildTyre();
    public ICar build();
}
