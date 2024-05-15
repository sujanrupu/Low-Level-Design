import Models.Fortuner;
import Models.ICar;

public class FortunerBuilder implements ICarBuilder{
    Fortuner s1;
    @Override
    public void buildEngine() {
        System.out.println("Fortuner engine inserted");
    }

    @Override
    public void buildBody() {
        System.out.println("Fortuner body inserted");
    }

    @Override
    public void buildChassis() {
        System.out.println("Fortuner chassis inserted");
    }

    @Override
    public void buildTyre() {
        System.out.println("Fortuner tyre inserted");
    }

    @Override
    public ICar build() {
        System.out.println("Fortuner ready for delivery");
        return s1;
    }
}
