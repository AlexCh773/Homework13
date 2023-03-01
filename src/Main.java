public class Main {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        GryffindorStudent granger = new GryffindorStudent("Hermione", "Granger", 52, 3500, 23, 34, 76);
        GryffindorStudent potter = new GryffindorStudent("Garry", "Potter", 62, 5500, 53, 31, 46);
        GryffindorStudent weasley = new GryffindorStudent("Ron", "Weasley", 22, 500, 22, 41, 26);

        SlytherinStudent malfoy = new SlytherinStudent("Draco", "Malfoy", 50, 4500, 43, 23, 56, 34, 99);
        SlytherinStudent montague = new SlytherinStudent("Graham", "Montague", 20, 1500, 13, 33, 26, 24, 59);
        SlytherinStudent goyle = new SlytherinStudent("Gregory", "Goyle", 10, 500, 33, 13, 46, 64, 29);

        RavenclawStudent chang = new RavenclawStudent("Cho", "Chang", 23, 1200, 45, 34, 12, 34);
        RavenclawStudent patil = new RavenclawStudent("Padma", "Patil", 43, 3200, 25, 14, 52, 74);
        RavenclawStudent belby = new RavenclawStudent("Marcus", "Belby", 63, 5200, 55, 24, 19, 54);

        HufflepuffStudent smith = new HufflepuffStudent("Zachariah", "Smith");
        HufflepuffStudent diggory = new HufflepuffStudent("Cedric", "Diggory", 32, 1000, 43, 12, 46);
        HufflepuffStudent finchFletchley = new HufflepuffStudent("Justin", "Finch-Fletchley", 52, 10000, 13, 72, 66);

        System.out.println(granger);
        System.out.println(potter);
        OperationWithStudents.comparisonOfGryffindorStudents(granger, potter);
        OperationWithStudents.comparisonOfSlytherinStudents(malfoy, goyle);
        OperationWithStudents.comparisonOfHufflepuffStudents(diggory, finchFletchley);
        OperationWithStudents.comparisonOfRavenclawStudents(patil, belby);

        OperationWithStudents.comparisonOfHogwartsStudents(granger, potter);
        OperationWithStudents.comparisonOfHogwartsStudents(weasley, malfoy);
        OperationWithStudents.comparisonOfHogwartsStudents(montague, smith);
    }
}