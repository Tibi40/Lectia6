public class Main {

    //private double bankAccount;
    /* Tipul de clasa: static sau altceva, se leaga de locul
    unde se repartizeaza in memorie si asta are importanta, fiindca, fie se poate salva
    pe SSD sau in RAM, din RAM se poate sterge
     */

    public static String USER_CNP = "1504261587789";
    public static void main(String[] args) {

        int x = 20;
        int y = 10;
        if (x < y) {
            System.out.println("yes");
        }

        int a = 10;
        int b = 15;
        int c = a * b;

        //public void .getName() {

        }

    }

class Test {

    int age = 10;
    //psvm
    public static void main(String[] args) {

        //String test = USER_CNP;
        //PracticeOperators practiceOperators = new PracticeOperators(); //asa creez un nou obiect si dedesubt, creez
                                                                       //caracteristicile acelei aplicatii
        //practiceOperators.getName();
    }

    public int computerTwoNumbers(int a, int b){
        return a+b;
    }

}

class AnotherTest {

    public static void main(String[] args) {
        Test test = new Test();
        test = null;
        System.out.println(test.computerTwoNumbers(10,20));

        AnotherTest anotherTest = new AnotherTest();

        String Name = "Maria";

        if (true) {
            System.out.println("Hello");
        } else {
            System.out.println("Something");
        }

        int horsepower = 250;
        int result = horsepower < 100 ? horsepower + 10: horsepower - 10;
        //? = conditie: daca horsepower < 100 => ... (in loc de if)
        // : = else (horsepower - 10
        System.out.println(result);

        /*int raceResult = horsepower < 100 ? String.valueOf(43) : "start race";

        if(horsepower < 100) {
            raceResult2 = "stop race";
        } else {
            raceResult2 = "start race";
        }
        */





        //ctrl + space = activeaza proprietati
        //name.trim;

        String test1 = "Lucian";
        String test2 = "iulian";
        String test3 = "Iulian";
        String test4 = new String("Iulian");

        System.out.println(test3 == test4);
        System.out.println(test2 == test3);
        System.out.println(test1 == test2);
        System.out.println(test1.equals(test2));
        System.out.println(test1.equals(test2));
        System.out.println(test1.equalsIgnoreCase(test2));

    }
}