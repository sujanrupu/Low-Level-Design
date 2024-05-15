import Models.ICar;
import Models.Scorpio;

public class ScorpioBuilder implements ICarBuilder{
    Scorpio s1;
    @Override
    public void buildEngine() {
        System.out.println("Scorpio engine inserted");
    }

    @Override
    public void buildBody() {
        System.out.println("Scorpio body inserted");
    }

    @Override
    public void buildChassis() {
        System.out.println("Scorpio chassis inserted");
    }

    @Override
    public void buildTyre() {
        System.out.println("Scorpio tyre inserted");
    }

    @Override
    public ICar build() {
        System.out.println("Scorpio ready for delivery");
        return s1;
    }
}
