public class Adept extends FighterDecorator {

    public Adept(FighterImp fighterImp) {
        super(fighterImp);
    }

    public String kick() {
        return "Kick. ";
    }

    @Override
    public String hit() {
        return super.hit() + kick();
    }
}
