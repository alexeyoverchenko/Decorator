public class FighterDecorator implements FighterImp{

        FighterImp fighterImp;

        public FighterDecorator(FighterImp fighterImp) {
            this.fighterImp = fighterImp;
        }

        @Override
        public String hit() {
            return fighterImp.hit();
        }
}
