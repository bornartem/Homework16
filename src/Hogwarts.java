public class Hogwarts {
    private String name;
    private String surname;
    private int spell;
    private int transgression;

    public Hogwarts(String name, String surname,int spell, int transgression) {
        this.name = name;
        this.surname = surname;
        this.spell = spell;
        this.transgression = transgression;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "name = " + name + " surname = " + surname +
                " , spell=" + spell + ", transgression = " + transgression;
    }
    public void printObjectsStudent(){
        System.out.println(toString());
    }
    public void equalsAllStudents(Ravenclaw marcus){
        if (this.getSpell() + this.getTransgression()< marcus.getSpell()+ marcus.getTransgression()){
            System.out.println(marcus.getName() + " better");
        }else {
            System.out.println(this.getName() + " better");
        }
    }
}
