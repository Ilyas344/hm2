public class Main {

    public static void main(String[] args) {

        var dog = 8.;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + " " + cat + " " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + " " + cat + " " + paper);
        var friend = 19.;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var box1 = 78.2;
        var box2 = 82.7;
        System.out.println("Сумма веса боксеров: " + (box1 + box2) + "\nРазница веса боксеров: " + (box2 - box1));
        System.out.println("Разница веса с помощью остатка от деления: " + (box2 % box1));
        System.out.println("Всего работников в компании – " + 640 / 8 + " человек");
        System.out.println("Если в компании работает " + (640 / 8 + 94) + " человек, то всего " + ((640 / 8 + 94) * 8) + " часов работы может быть поделено между сотрудниками");
    }
}