public class Ravenclaw extends Hogwarts {

    private int clever;
    private int wisdom;
    private int fullOfCreation;

    public Ravenclaw(String name, String surname, int spell, int transgression, int clever, int wisdom, int fullOfCreation) {
        super(name, surname, spell,transgression);
        this.clever = clever;
        this.wisdom = wisdom;
        this.fullOfCreation = fullOfCreation;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getFullOfCreation() {
        return fullOfCreation;
    }

    public void setFullOfCreation(int fullOfCreation) {
        this.fullOfCreation = fullOfCreation;
    }

    @Override
    public String toString() {
        return super.toString( ) + "clever = " + clever + ", wisdom = " + wisdom + ", fullOfCreation = " + fullOfCreation;
    }

    public void equalsRavenclaw (Ravenclaw zhouChang){
        if (this.getWisdom() + this.getClever() + this.getFullOfCreation() > zhouChang.getWisdom() + zhouChang.getClever() + zhouChang.getFullOfCreation()) {
            System.out.println(this.getName() + " better");
        } else {
            System.out.println(zhouChang.getName() + " better");
            }
        }
}
