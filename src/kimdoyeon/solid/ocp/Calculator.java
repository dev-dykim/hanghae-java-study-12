package kimdoyeon.solid.ocp;

public class Calculator {

    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }

}
