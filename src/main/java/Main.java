public class Main {
    public static void main(String[] args) {
        System.out.println("master");
        print("master");
        print2("master");
    }
    static void print(String m){
        System.out.println(m);
    }
    private static void print2(String m){
        System.out.println("print2 method: " + m);
    }
}
