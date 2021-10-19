package lesson6;

public class Animal {
    private String name;
    private int runLimit;
    private int swimLimit;

    public Animal() {
    }

    public Animal(String name, int run, int swimLimit) {
        this.name = name;
        this.runLimit = run;
        this.swimLimit = swimLimit;
    }

    public void swim(int length) {
        if (length <= swimLimit)
            System.out.println(name + " проплыл " + length + "м");
        else
            System.out.println(name + " не решился плыть так далеко");
    }

    public void run(int length) {
        if (length <= runLimit)
            System.out.println(name + " пробежал " + length + "м");
        else
            System.out.println(name + " не решился бежать так далеко");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", runLimit=" + runLimit +
                ", swimLimit=" + swimLimit;
    }

    public void printInfo() {
        System.out.println(this);
    }
}
