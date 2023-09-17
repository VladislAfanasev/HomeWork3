public class Main {
    public static void main(String[] args) {

        byte a = 127;
        short b = -32768;
        int c = 2147483647;
        long d = -92000000000L;
        System.out.println("Значение переменной a с типом byte равно "+a);
        System.out.println("Значение переменной b с типом short равно "+b);
        System.out.println("Значение переменной c с типом int равно "+c);
        System.out.println("Значение переменной d с типом long равно "+d);

        float aa = 27.12F;
        long bb = 987678965549L;
        double cc = 2.786;
        short dd = 569;
        short ee = -159;
        int ff = 27897;
        byte gg = 67;
        System.out.println(" ");

        short papers = 480;
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int allStudents = firstClass + secondClass + thirdClass;
        int listsForStudent = papers / allStudents;
        System.out.println("В первом классе "+firstClass+" ученика");
        System.out.println("Во втором классе "+secondClass+" учеников");
        System.out.println("В третьем классе "+thirdClass+" учеников");
        System.out.println("Всего купили "+papers+" листов бумаги");
        System.out.println("На каждого ученика рассчитано "+listsForStudent+" листов бумаги");
        System.out.println(" ");

        byte per2Min = 16;
        int per20Min = 20 / 2 * per2Min;
        int per1Hour = per2Min * 30;
        int per1Day = per1Hour * 24;
        int per3Days = per1Day * 3;
        int per1Month = per3Days * 10;
        System.out.println("За 20 минут машина произвела "+per20Min+" штук бутылок");
        System.out.println("За сутки машина произвела "+per1Day+" штук бутылок");
        System.out.println("За трое суток машина произвела "+per3Days+" штук бутылок");
        System.out.println("За месяц машина произвела "+per1Month+" штук бутылок");
        System.out.println(" ");

        byte generalTins = 120;
        byte whiteTinsForClass = 2;
        byte brownTinsForClass = 4;
        int tinsForClass = whiteTinsForClass + brownTinsForClass;
        int numberOfClasses = generalTins / tinsForClass;
        int whiteTins = numberOfClasses * whiteTinsForClass;
        int brownTins = numberOfClasses * brownTinsForClass;
        System.out.println("В школе, где "+numberOfClasses+" классов, нужно "+whiteTins+
                " банок белой краски и "+brownTins+" банок коричневой краски");
        System.out.println(" ");

        byte bananaWheight = 80;
        byte numberOfBananas = 5;
        int bananasWheight = bananaWheight * numberOfBananas;
        byte milkWheight = 105;
        byte numberOfMilk = 2;
        int milkWheightG = milkWheight * numberOfMilk;
        byte iceCreamWheight = 100;
        byte numberOfIceCreams = 2;
        int iceCreamsWheight = iceCreamWheight * numberOfIceCreams;
        byte eggWheight = 70;
        byte numberOfEggs = 4;
        int eggsWheight = eggWheight * numberOfEggs;
        int wheightInGrams = bananasWheight + milkWheightG + iceCreamsWheight + eggsWheight;
        float wheightKg = 1000;
        float wheightInKg = wheightInGrams / wheightKg;
        System.out.println("Вес спортзавтрака "+wheightInGrams+" грамм");
        System.out.println("Вес спортзавтрака "+wheightInKg+" килограмм");
        System.out.println(" ");

        byte wheightLeftKg = 7;
        short kg = 1000;
        int wheightLeftG = wheightLeftKg * kg;
        short minPerDay = 250;
        short maxPerDay = 500;
        int minDays = wheightLeftG / maxPerDay;
        int maxDays = wheightLeftG / minPerDay;
        System.out.println("Для похудения потребуется минимум "+minDays+" дней");
        System.out.println("Для похудения потребуется максимум "+maxDays+" дней");
        System.out.println(" ");

        int mashaBefore = 67760;
        int mashaAfter = mashaBefore * 110 / 100;
        int mashaDifMonth = mashaAfter - mashaBefore;
        int mashaDifYear = mashaDifMonth * 12;
        int denisBefore = 83690;
        int denisAfter = denisBefore * 110 / 100;
        int denisDifMonth = denisAfter - denisBefore;
        int denisDifYear = denisDifMonth * 12;
        int kristinaBefore =  76230;
        int kristinaAfter = kristinaBefore * 110 / 100;
        int kristinaDifMonth = kristinaAfter - kristinaBefore;
        int kristinaDifYear = kristinaDifMonth * 12;
        System.out.println("Маша теперь получает "+mashaAfter+" рублей. Годовой доход вырос на "
        +mashaDifYear+" рублей.");
        System.out.println("Денис теперь получает "+denisAfter+" рублей. Годовой доход вырос на "
                +denisDifYear+" рублей.");
        System.out.println("Кристина теперь получает "+kristinaAfter+" рублей. Годовой доход вырос на "
                +kristinaDifYear+" рублей.");
    }
}