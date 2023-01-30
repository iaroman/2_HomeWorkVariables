public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("...Task 1...");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("...Task 2...");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("...Task 3...");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("...Task 4...");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
    }
    public  static void task5() {
        System.out.println("...Task 5...");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("...Task 6...");
        var box1 = 78.2;
        var box2 = 82.7;
        var summa = box1 + box2;
        var diff = box1 - box2;
        System.out.println("Общий вес спортсменов - " + summa + " кг");
        System.out.println("Разница в весе между боксерами " + diff + " кг");
    }
    public static void task7() {
        System.out.println("...Task 7...");
        var box1 = 78.2;
        var box2 = 82.7;
        var diff = box2 - box1;
        System.out.println("Разница в весе между боксерами " + diff + " кг (способ '-')");
        diff = box2 % box1;
        System.out.println("Разница в весе между боксерами " + diff + " кг (спооб '%')");
    }
    public static void task8() {
        System.out.println("...Task 8...");
        var timeTotal = 640;
        var timeOnOne = 8;
        var emp = timeTotal / timeOnOne;
        System.out.println("Всего работников в компании - " + emp + " человек");
        emp = emp + 94;
        timeTotal = emp * timeOnOne;
        System.out.println("Если в компании работает " + emp + " человек, то всего " + timeTotal + " часа работы может быть поделено между сотрудниками. ");

    }

}