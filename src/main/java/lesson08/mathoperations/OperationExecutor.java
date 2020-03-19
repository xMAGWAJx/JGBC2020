package lesson08.mathoperations;

public class OperationExecutor {

    void execute(MathOperation[] operations, double a, double b) {
        for (MathOperation mathOperation : operations) {
            System.out.println(mathOperation.execute(a, b));
        }
    }
}
