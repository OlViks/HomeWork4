public class Main {
    public static void main(String[] args) {
       //Задание №1
        byte classTable = 24;
        short butle = 200;
        int board = 20000;
        long screw = 1000000L;
        float bolt = 3.24f;
        double burger = 1.246;
        System.out.println("Значение переменной classTable с типом byte равно " + classTable );
        System.out.println("Значение переменной buttle с типом short равно " + butle );
        System.out.println("Значение переменной board с типом int равно " + board );
        System.out.println("Значение переменной screw с типом long равно " + screw );
        System.out.println("Значение переменной bolt с типом float равно " + bolt );
        System.out.println("Значение переменной burger с типом double равно " + burger );

        //Задния №2
        double broad = 27.12;
        long screwLong = 987678965549L;
        byte table = 2;
        short butlle = 786;
        boolean g = 2 > 4;
        short dog =  569;
        short temperatur = -159;
        short scool = 27897;
        byte cat = 67;

        //Задание №3
        byte studentPalovna = 23;
        byte studentSergeevna = 27;
        byte studentAndreevna = 30;
        int list = 480;
        int sumStudent = studentPalovna + studentSergeevna + studentAndreevna;
        int listStudent = list / sumStudent;
        System.out.println("На каждого ученика рассчитано " + listStudent + " листов бумаги");

        //Задание №4
        byte bottle = 16;
        byte bottleMin = (byte) (bottle / 2);
        short bottleMin20 = (short) (bottleMin * 20);
        short bottleHoure = (short) (bottleMin * 60);
        short bottleDay = (short) (bottleHoure * 24);
        int bottleDay3 = bottleDay * 3;
        int bottleMonth = bottleDay * 30;
        System.out.println("За 20 минут машина произвела бутылок " + bottleMin20 + " штук ");
        System.out.println("За сутки машина произвела бутылок " + bottleDay + " штук ");
        System.out.println("За 3 дня машина произвела бутылок " + bottleDay3 + " штук ");
        System.out.println("За месяц машина произвела бутылок " + bottleMonth + " штук ");

        //Задание 5
        byte bank = 120;
        byte bankBrown = 4;
        byte bankWithe = 2;
        byte classSum = 120 / (4+2);
        byte bankBrownSum = (byte) (classSum *4);
        byte bankWitheSum = (byte) (classSum * 2);
        System.out.println("В школе, где " + classSum + " классов, нужно " + bankWitheSum + " банок белой краски и " + bankBrownSum + " банок коричневой краски.");

        //Задание 6
        byte banane = 5;
        int bananeWeight = banane*80;
        int milk = 200;
        double milkWeigth = milk * 1.05;
        byte ice = 2;
        int iceWeight = ice *  100;
        byte egg = 4;
        int eggWeight = egg * 70;
        double sumGram = bananeWeight + milkWeigth + iceWeight + eggWeight;
        double sumKg = sumGram / 1000;
        System.out.println("Завтрак " + sumGram + " грамм или " + sumKg + " килограмм.");

        //Задание 7
        int weigth = 7; // кг
        int weightGram = 7 *1000; // грамм
        int weigthX = 250;
        int weightZ = 500;
        int DayX = weightGram / weigthX;
        int DayZ = weightGram / weightZ;
        int avarage = (weigthX + weightZ) / 2;
        int avarageDay = weightGram / avarage;
        System.out.println("Если спортсмен будет терять каждый день по " + weigthX + " грамм потребуется " + DayX +  " дней.");
        System.out.println("Если спортсмен будет терять каждый день по " + weightZ + " грамм потребуется " + DayZ +  " дней.");
        System.out.println("В среднем для похудения потребуется " + avarageDay +  " дней.");



    }
}