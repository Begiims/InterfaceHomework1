public class Main {
    public static void main(String[] args) {
        Flyable bird = new Bird("lkjhgfd");
        Flyable eagle = new Eagle("grey");
        Flyable owl = new Owl(4);
        Flyable[] flyables = {bird,eagle,owl};
        System.out.println(bird);
    }
}