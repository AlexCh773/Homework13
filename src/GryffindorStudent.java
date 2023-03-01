public class GryffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, String surname) {
        super(name, surname);
    }

    public GryffindorStudent(String name, String surname, int powerOfMagic, int apparitionDistance, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, apparitionDistance);
        if (nobility < 0 || nobility > 100 || honor < 0 || honor > 100 || bravery < 0 || bravery > 100) {
            throw new IllegalArgumentException("Значения умений студентов должны быть в диапазоне от 0 до 100!");
        }
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "\nстудент факкултета Gryffindor\n" + super.toString() +
                "\nблагородство: " + getNobility() +
                "\nчесть: " + getHonor() +
                "\nхрабрость: " + getBravery();
    }
}