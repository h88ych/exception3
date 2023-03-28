package exception3;

public class LAB7 {

    public static void main(String[] args) {
        try {
            doThis();
        } catch (Exception e) {
            System.out.println("Main method receive exception " + e.getMessage());
        }
    }

    public static void doThis() throws Exception {
        System.out.println("Method doThis() call method doThat()");
        doThat();
    }

    public static void doThat() throws Exception {
//        throw new Exception("Hello");
//        System.out.println(1/0);
    throw new MyException("Hello Exception");
    }
}
