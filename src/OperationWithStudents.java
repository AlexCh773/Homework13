public class OperationWithStudents {

    public static void comparisonOfHogwartsStudents(HogwartsStudent student1, HogwartsStudent student2) {
        if (student1.getPowerOfMagic() > student2.getPowerOfMagic()) {
            System.out.println("\nстудент " + student1.getName() + " " + student1.getSurname() + " обладает большей мощностью магии чем студент " + student2.getName() + " " + student2.getSurname());
        } else if (student1.getPowerOfMagic() < student2.getPowerOfMagic()) {
            System.out.println("\nстудент " + student2.getName() + " " + student2.getSurname() + " обладает большей мощностью магии чем " + student1.getName() + " " + student1.getSurname());
        } else {
            System.out.println("\nстудент " + student2.getName() + " " + student2.getSurname() + " равен по мощности магии со студентом " + student1.getName() + " " + student1.getSurname());
        }
        if (student1.getApparitionDistance() > student2.getApparitionDistance()) {
            System.out.println("студент " + student1.getName() + " " + student1.getSurname() + " обладает большей дистанцией трансгрессирования чем студент " + student2.getName() + " " + student2.getSurname());
        } else if (student1.getApparitionDistance() < student2.getApparitionDistance()) {
            System.out.println("студент " + student2.getName() + " " + student2.getSurname() + " обладает большей дистанцией трансгрессирования чем " + student1.getName() + " " + student1.getSurname());
        } else {
            System.out.println("студент " + student2.getName() + " " + student2.getSurname() + " равен по дистанции трансгрессирования со студентом " + student1.getName() + " " + student1.getSurname());
        }
    }

    public static void comparisonOfGryffindorStudents(GryffindorStudent student1, GryffindorStudent student2) {
        int student1SumOfAbilities = student1.getHonor() + student1.getNobility() + student1.getBravery();
        int student2SumOfAbilities = student2.getHonor() + student2.getNobility() + student2.getBravery();
        if (student1SumOfAbilities > student2SumOfAbilities) {
            System.out.println("\n" + student1.getName() + " " + student1.getSurname() + " лучший Гриффиндорец чем " + student2.getName() + " " + student2.getSurname());
        } else if (student1SumOfAbilities < student2SumOfAbilities) {
            System.out.println("\n" + student2.getName() + " " + student2.getSurname() + " лучший Гриффиндорец чем " + student1.getName() + " " + student1.getSurname());
        } else {
            System.out.println("\nГриффиндорцы " + student1.getName() + " " + student1.getSurname() + " и " + student2.getName() + " " + student2.getSurname() + " одинаковы по уровню своих способностей");
        }
    }

    public static void comparisonOfSlytherinStudents(SlytherinStudent student1, SlytherinStudent student2) {
        int student1SumOfAbilities = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getThirstForPower();
        int student2SumOfAbilities = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower();
        if (student1SumOfAbilities > student2SumOfAbilities) {
            System.out.println("\n" + student1.getName() + " " + student1.getSurname() + " лучший Слизеринец чем " + student2.getName() + " " + student2.getSurname());
        } else if (student1SumOfAbilities < student2SumOfAbilities) {
            System.out.println("\n" + student2.getName() + " " + student2.getSurname() + " лучший Слизеринец чем " + student1.getName() + " " + student1.getSurname());
        } else {
            System.out.println("\nСлизеринцы " + student1.getName() + " " + student1.getSurname() + " и " + student2.getName() + " " + student2.getSurname() + " одинаковы по уровню своих способностей");
        }
    }

    public static void comparisonOfHufflepuffStudents(HufflepuffStudent student1, HufflepuffStudent student2) {
        int student1SumOfAbilities = student1.getDiligence() + student1.getHonesty() + student1.getLoyalty();
        int student2SumOfAbilities = student2.getDiligence() + student2.getHonesty() + student2.getLoyalty();
        if (student1SumOfAbilities > student2SumOfAbilities) {
            System.out.println("\n" + student1.getName() + " " + student1.getSurname() + " лучший Пуффендуец чем " + student2.getName() + " " + student2.getSurname());
        } else if (student1SumOfAbilities < student2SumOfAbilities) {
            System.out.println("\n" + student2.getName() + " " + student2.getSurname() + " лучший Пуффендуец чем " + student1.getName() + " " + student1.getSurname());
        } else {
            System.out.println("\nПуффендуйцы " + student1.getName() + " " + student1.getSurname() + " и " + student2.getName() + " " + student2.getSurname() + " одинаковы по уровню своих способностей");
        }
    }

    public static void comparisonOfRavenclawStudents(RavenclawStudent student1, RavenclawStudent student2) {
        int student1SumOfAbilities = student1.getCreativity() + student1.getIntelligence() + student1.getWisdom() + student1.getWit();
        int student2SumOfAbilities = student2.getCreativity() + student2.getIntelligence() + student2.getWisdom() + student2.getWit();
        if (student1SumOfAbilities > student2SumOfAbilities) {
            System.out.println("\n" + student1.getName() + " " + student1.getSurname() + " лучший Когтевранец чем " + student2.getName() + " " + student2.getSurname());
        } else if (student1SumOfAbilities < student2SumOfAbilities) {
            System.out.println("\n" + student2.getName() + " " + student2.getSurname() + " лучший Когтевранец чем " + student1.getName() + " " + student1.getSurname());
        } else {
            System.out.println("\nКогтевранцы " + student1.getName() + " " + student1.getSurname() + " и " + student2.getName() + " " + student2.getSurname() + " одинаковы по уровню своих способностей");
        }
    }
}
