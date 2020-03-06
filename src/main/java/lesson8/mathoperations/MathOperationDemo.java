package lesson8.mathoperations;

public class MathOperationDemo {

    public static void main(String[] args) {
        OperationExecutor executor = new OperationExecutor();

        MathOperation[] ops = {new AdditionOperation(), new SubtractionOperation(), new DivisionOperation(), new MultiplicationOperation()};

        executor.execute(ops, 5, 3); //8, 2, 1.6666666666666667, 15.0
    }
}
