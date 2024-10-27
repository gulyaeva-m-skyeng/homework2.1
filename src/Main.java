public class Main {
    public static void main(String [] args) {

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}

//Задача 2

public class Main {
    public static void main(String [] args) {

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}


//задача 3

public class Main {
    public static void main(String [] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}

//задача 4

public class Main {
    public static void main(String[] args) {
        var friend = 19;
        System.out.println("Значение переменной friend: " + friend);

        friend = friend + 2;
        System.out.println("Значение переменной friend после увеличения на 2: " + friend);

        friend = friend / 7;
        System.out.println("Значение переменной friend после деления на 7: " + friend);
    }
}

// задача 5

public class Main {
    public static void main(String[] args) {
        double frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);

    }
}


// Задача 6

public class Main {
    public static void main(String[] args) {
        double boxer1Weightkg = 78.2;
        double boxer2Weightkg = 82.7;

        double totalWeight = boxer1Weightkg + boxer2Weightkg;
        double weightDifference = Math.abs(boxer1Weightkg - boxer2Weightkg);

        System.out.println(" Total weight of two boxers: " + totalWeight + " kg");
        System.out.println("Weight difference between two boxers: " + weightDifference + "kg");
    }
}

//Задача 7

public class Main {
    public static void main(String[] args) {
        var weight1 = 78.2;
        var weight2 = 82.7;

        var remainder = weight2 % weight1;
        System.out.println(" Результат операции остаток от деления: " + remainder);
    }
}


// Задача 8

public class Main {
    public static void main(String[] args) {
        var workTime = 640;
        var timePerDay = 8;

        var employeeCount = workTime / timePerDay;
        System.out.println("Всего работников в компании " + employeeCount + " человек");

        employeeCount += 94;
        var newTimePerDay = workTime / employeeCount;
        System.out.println("Если в компании работает " + employeeCount + " человек, " + "то всего " + newTimePerDay + " часов работы может быть поделено между сотрудниками");
    }
}