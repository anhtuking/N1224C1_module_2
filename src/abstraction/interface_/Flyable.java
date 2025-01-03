package abstraction.interface_;

public interface Flyable {
    int MAX = 100;
    void fly();

    default void fly2(){
        System.out.println("Co body - default");
    }

    static void fly3() {
        System.out.println("Co body - static");
    }
    // static khong co ke thua
}
