public class Main {
    public static void main(String[] args) {

        Summator summator = new Summator();

//        Сумма двух произвольных целых чисел
        System.out.println("First number: " + 2 +
                ", second number: " + 2 + ". " +
                "Sum is: " + summator.sum(2, 2));
        System.out.println();

//        Сумма значений полей объекта
        summator.setFirstNumber(6);
        summator.setSecondNumber(-4);
        System.out.println("First number: " + summator.getFirstNumber() +
                ", second number: " + summator.getSecondNumber() + ". " +
                "Sum is: " + summator.getSum() + "\n");

//        Сумма значений полей объекта
        summator.setFirstNumber(2000000000);
        summator.setSecondNumber(2_000_000_000);
        System.out.println("First number: " + summator.getFirstNumber() +
                ", second number: " + summator.getSecondNumber() + ". " +
                "Sum is: " + summator.getSum() + "\n");
    }
}
