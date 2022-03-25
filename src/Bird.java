public class Bird {
    enum Colour {
        GREEN, BLACK, RED, YELLOW, WHITE, BLACK_WHITE;
    }
    enum Gender {
        MALE, FEMALE, OTHER;
    }

    String name;
    Colour colour;
    Gender gender;
    boolean isFlyable;
    boolean isSwimmable;

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", colour=" + colour +
                ", gender=" + gender +
                ",isSwimmable=" + isSwimmable +
                ", isFlyable=" + isFlyable +
                '}';
    }

    void eat(){
        System.out.println(name + " can eat " );
    }

    boolean doesMakesNest(){
        return false;
    }
}
