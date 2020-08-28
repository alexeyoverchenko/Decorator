public class Test {
    public static void main(String[] args) {
//        Fighter fighter = new Master(new Adept(new Fighter()));
        FighterImp fighterImp = new Master(new Adept(new Fighter()));
        System.out.println(fighterImp.hit());
    }
}
