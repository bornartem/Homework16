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

    public static void equalsRavenclaw (Ravenclaw padma, Ravenclaw zhouChang){
        if (padma.getWisdom() + padma.getClever() + padma.getFullOfCreation() > zhouChang.getWisdom() + zhouChang.getClever() + zhouChang.getFullOfCreation()) {
            System.out.println(padma.getName() + " better");
        } else {
            System.out.println(zhouChang.getName() + " better");
            }
        }
}
