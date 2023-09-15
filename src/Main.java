import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
Gryffindor harry = new Gryffindor("Гарри", "Поттер", 99,96, 99,98, 97);
Gryffindor ron = new Gryffindor("Рон", "Уизли", 85,84, 80,81,82);
Gryffindor hermione = new Gryffindor("Гермиона", "Грейнджер", 78,79,60,61,62);


Hufflepuff zachariah = new Hufflepuff("Захария", "Смит", 65,66,67, 66, 65);
Hufflepuff sedrick = new Hufflepuff("Седрик", "Диггори", 70,72,75,76,77);
Hufflepuff jastin = new Hufflepuff("Джастин", "Финч-Флетчли", 60, 61,62,60,66);


Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", 50,51,52,55,54);
Ravenclaw padma = new Ravenclaw("Падма", "Патил", 49,48,47,45,46);
Ravenclaw marcus = new Ravenclaw("маркус", "Белби", 53,54,55,56,58);


Slytherin draco = new Slytherin("Драко", "Малфой", 86, 88, 87,89,83);
Slytherin graham = new Slytherin("Грехем", "Монтегю", 85, 84, 83,86,87);
Slytherin gregory = new Slytherin("Грегори", "Гойл", 85,82,86, 88,82);


        harry.printObjectsStudent();

        hermione.equalsGryffindor(ron);
        jastin.equalsHufflepuff(sedrick);
        zhouChang.equalsRavenclaw(padma);
        gregory.equalsSlytherin(graham);

        draco.equalsAllStudents(marcus);
    }

}