public class Master extends FighterDecorator {

    public Master(FighterImp fighterImp) {
        super(fighterImp);
    }

    public String run() {
        return "Run. ";
    }

    @Override
    public String hit() {
        return super.hit() + run();
    }
}
