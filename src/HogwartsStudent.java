public class HogwartsStudent {
    private final String name;
    private final String surname;
    private int powerOfMagic;
    private int apparitionDistance;

    public HogwartsStudent(String name, String surname) {
        this.name = name.trim();
        this.surname = surname.trim();
    }

    public HogwartsStudent(String name, String surname, int powerOfMagic, int apparitionDistance) {
        if (name.trim().isEmpty() || surname.trim().isEmpty() ) {
            throw new IllegalArgumentException("Не верно заданы имя и фамилия студента!");
        }
        if (powerOfMagic < 0 || apparitionDistance < 0) {
            throw new IllegalArgumentException("Значения умений не могут быть отрицательными!");
        }
        this.name = name.trim();
        this.surname = surname.trim();
        this.powerOfMagic = powerOfMagic;
        this.apparitionDistance = apparitionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return getName() + " " + getSurname() +
                "\n" + "сила колдовства: " + getPowerOfMagic() +
                "\n" + "дистанция трансгрессирования: " + getApparitionDistance();
    }
}
