public class Geeks {
    String name;
    int id;

    Geeks(String name, int id) {        // Constructor
        this.name = name;               // 'this' refers to the current object
        this.id = id;
    }

    public static void main(String[] args) {
        Geeks geek1 = new Geeks("Prateek", 19); // Creating an object

        System.out.println("Geek name: " + geek1.name + " and GeekId: " + geek1.id);
    }
}
