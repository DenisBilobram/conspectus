public class Program {
    public static void main(String[] args) {
        Adult x = new Adult();
        x.age = 40;
        System.out.println(x.age);
    }
}
class Student {
    int age;
}
class Bakalavr extends Student {
    int course;
}
class Adult extends Bakalavr {
    boolean finished;
}