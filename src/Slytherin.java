public class Slytherin extends Hogwarts {
    private int trick;
    private int resole;
    private int ambitions;

    public Slytherin(String name, String surname, int spell, int transgression, int trick, int resole, int ambitions) {
        super(name, surname,spell,transgression);
        this.trick = trick;
        this.resole = resole;
        this.ambitions = ambitions;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getResole() {
        return resole;
    }

    public void setResole(int resole) {
        this.resole = resole;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    @Override
    public String toString() {
        return super.toString( ) + "trick = " + trick + ", resole = " + resole + ", ambitions = " + ambitions;
    }

    public void equalsSlytherin (Slytherin gregory){
        if (this.getTrick() + this.getResole() + this.getAmbitions() > this.getTrick() + this.getTrick() + gregory.getAmbitions())
        {
            System.out.println(this.getName() + " better");
        } else {
            System.out.println(gregory.getName() + " better");
        }
    }
}
