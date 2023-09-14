public class Gryffindor extends Hogwarts {
    private int generosity;
    private int honor;

    private int courage;

    public Gryffindor(String name, String surname, int spell, int transgression, int generosity, int honor, int courage) {
        super(name, surname, spell,transgression);
        this.generosity = generosity;
        this.honor = honor;
        this.courage = courage;
    }

    public int getGenerosity() {
        return generosity;
    }

    public void setGenerosity(int generosity) {
        this.generosity = generosity;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    public static void printObjectsStudent(Gryffindor gryffindor){
        System.out.println(gryffindor.getName() + " " + gryffindor.getSurname() + " , spell - " + gryffindor.getSpell() + " , transgression - " + gryffindor.getTransgression() + " ,  generosity - " + gryffindor.getGenerosity() + ", honor - " + gryffindor.getHonor() + " , courage - " + gryffindor.getCourage());
    }

    public static void equalsGryffindor (Gryffindor ron, Gryffindor hermione) {
        if (ron.getGenerosity() + ron.getHonor() + ron.getCourage() > hermione.getGenerosity() + hermione.getHonor() + hermione.getCourage()) {
            System.out.println(ron.getName() + " better");
        } else {
            System.out.println(hermione.getName() + " better");
        }
    }
}
