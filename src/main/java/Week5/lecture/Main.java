package Week5.lecture;

public class Main {
    public static void main(String[] args) {
        Student pekka = (Student) new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Student esko = (Student) new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);

        pekka.study();
        pekka.study();

        esko.study();
        System.out.println("Pekka's credits: " + pekka.getCredits());
        System.out.println("Esko's credits: " + esko.getCredits());
    }
}
