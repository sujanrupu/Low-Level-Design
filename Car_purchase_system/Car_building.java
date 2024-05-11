class Scorpio_building extends Scorpio{
    @Override
    public void start_prod() {
        super.start_prod();
    }
    @Override
    public void init() {
        super.init();
    }
    @Override
    public void buildEngine() {
        super.buildEngine();
    }
    @Override
    public void buildBody() {
        super.buildBody();
    }
    @Override
    public void buildChassis() {
        super.buildChassis();
    }
    @Override
    public void buildTyre() {
        super.buildTyre();
    }
}

class Swift_building extends Swift{
    @Override
    public void start_prod() {
        super.start_prod();
    }
    @Override
    public void init() {
        super.init();
    }
    @Override
    public void buildEngine() {
        super.buildEngine();
    }
    @Override
    public void buildBody() {
        super.buildBody();
    }
    @Override
    public void buildChassis() {
        super.buildChassis();
    }
    @Override
    public void buildTyre() {
        super.buildTyre();
    }
}

public class Car_building {
    public void Scorpio_build(){
        Scorpio_building sb = new Scorpio_building();
        sb.start_prod();
        sb.init();
        sb.buildEngine();
        sb.buildBody();
        sb.buildChassis();
        sb.buildTyre();
    }

    public void Swift_build() {
        Swift_building sb = new Swift_building();
        sb.start_prod();
        sb.init();
        sb.buildEngine();
        sb.buildBody();
        sb.buildChassis();
        sb.buildTyre();
    }
}
