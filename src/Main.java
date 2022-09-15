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




    }
}