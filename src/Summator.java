import java.util.function.IntToLongFunction;

public class Summator {

    private int firstNumber = 0;
    private int secondNumber = 0;
    private long resultOfSum = 0;

    public void setFirstNumber(int numberToSet) {

        firstNumber = numberToSet;
    }

    public void setSecondNumber(int numberToSet) {

        secondNumber = numberToSet;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    // Сложение двух произвольных целых чисел
    public long sum(int firstNum, int secondNum) {

        return (long) firstNum + (long) secondNum;
    }

    // Сложение двух целых чисел, сохранённых в полях объекта
    public long getSum() {

        resultOfSum = (long) (firstNumber) + (long) (secondNumber);
        return resultOfSum;
    }
}
