public class Hufflepuff extends Hogwarts {

    private int workAbility;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int spell, int transgression, int workAbility, int loyalty, int honesty) {
        super(name, surname, spell, transgression);
        this.workAbility = workAbility;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getWorkAbility() {
        return workAbility;
    }

    public void setWorkAbility(int workAbility) {
        this.workAbility = workAbility;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString( ) + "workAbility = " + workAbility + ", loyalty = " + loyalty + ", honesty = " + honesty;
    }

    public void equalsHufflepuff (Hufflepuff jastin) {
        if (this.getWorkAbility() + this.getLoyalty() + this.getHonesty() < jastin.getWorkAbility() + jastin.getLoyalty() + jastin.getHonesty()) {
            System.out.println(this.getName() + " better");
        } else {
            System.out.println(jastin.getName() + " better");
        }
    }
}
