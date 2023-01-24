public class Owl  implements  Flyable{
     int age;
    @Override
    public void fly() {

    }
    public Owl(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Owl{" +
                "age=" + age +
                '}';
    }
}
