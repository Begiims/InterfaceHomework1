public class Bird  implements Flyable{
    String name;

    @Override
    public void fly() {

    }

    public Bird(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}
