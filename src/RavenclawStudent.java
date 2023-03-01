public class RavenclawStudent extends HogwartsStudent {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, String surname) {
        super(name, surname);
    }

    public RavenclawStudent(String name, String surname, int powerOfMagic, int apparitionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, powerOfMagic, apparitionDistance);
        if (intelligence < 0 || intelligence > 100 || wisdom < 0 || wisdom > 100 || wit < 0 || wit > 100 || creativity < 0 || creativity > 100) {
            throw new IllegalArgumentException("Значения умений студентов должны быть в диапазоне от 0 до 100!");
        }
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "\nстудент факкултета Ravenclaw\n" + super.toString() +
                "\nум: " + getIntelligence() +
                "\nмудрость: " + getWisdom() +
                "\nостроумие: " + getWit() +
                "\nтворчество : " + getCreativity();
    }
}