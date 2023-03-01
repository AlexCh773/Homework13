public class HufflepuffStudent extends HogwartsStudent {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, String surname) {
        super(name, surname);
    }

    public HufflepuffStudent(String name, String surname, int powerOfMagic, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(name, surname, powerOfMagic, apparitionDistance);
        if (diligence < 0 || diligence > 100 || loyalty < 0 || loyalty > 100 || honesty < 0 || honesty > 100) {
            throw new IllegalArgumentException("Значения умений студентов должны быть в диапазоне от 0 до 100!");
        }
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "\nстудент факкултета Hufflepuff\n" + super.toString() +
                "\nтрудолюбие: " + getDiligence() +
                "\nверность : " + getLoyalty() +
                "\nчестность: " + getHonesty();
    }
}