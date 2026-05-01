package ChatGBT_Tasks;

public class Main {
    public static void main(String[] args) {

        Operation op = Operation.ADD;
        int result = op.apply(5,6);
        System.out.println(result);
        Operation op1 = Operation.DIVIDE;
        int result1 = op1.apply(5,2);
        System.out.println(result1);
    }
}
