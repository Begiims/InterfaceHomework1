public class Eagle implements Flyable{
     String color;
    @Override
    public void fly() {

    }

    public Eagle(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "color='" + color + '\'' +
                '}';
    }
}
