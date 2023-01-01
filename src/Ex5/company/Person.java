package Ex5.company;

public class Person {
    private String name;
    private String dni;
    private int height;
    private int weight;

    public Person(String name, String dni, int height, int weight) {
        this.name = name;
        this.dni = dni;
        this.height = height;
        this.weight = weight;
    }

    public Person(String dni) {
        this.dni = dni;
        this.name = "";
        this.height = 0;
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + weight;
    }
}
