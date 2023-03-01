public class SlytherinStudent extends HogwartsStudent {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public SlytherinStudent(String name, String surname) {
        super(name, surname);
    }

    public SlytherinStudent(String name, String surname, int powerOfMagic, int apparitionDistance, int cunning, int determination,
                            int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, powerOfMagic, apparitionDistance);
        if (cunning < 0 || cunning > 100 || determination < 0 || determination > 100 || ambition < 0 || ambition > 100
        || resourcefulness < 0 || resourcefulness > 100 || thirstForPower < 0 || thirstForPower > 100) {
            throw new IllegalArgumentException("Значения умений студентов должны быть в диапазоне от 0 до 100!");
        }
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return "\nстудент факкултета Slytherin\n" + super.toString() +
                "\nхитрость: " + getCunning() +
                "\nрешительность: " + getDetermination() +
                "\nамбициозность: " + getAmbition() +
                "\nнаходчивость : " + getResourcefulness() +
                "\nжажда власти: " + getThirstForPower();
    }
}