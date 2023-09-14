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

    public static void equalsSlytherin (Slytherin graham, Slytherin gregory){
        if (graham.getTrick() + graham.getResole() + graham.getAmbitions() > graham.getTrick() + graham.getTrick() + gregory.getAmbitions())
        {
            System.out.println(graham.getName() + " better");
        } else {
            System.out.println(gregory.getName() + " better");
        }
    }
}
