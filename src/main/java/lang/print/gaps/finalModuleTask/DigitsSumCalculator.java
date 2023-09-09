package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int digitOne = number % 10;
        int digitTwo = (number - digitOne) / 10 % 10;
        int digitThree = ((number - digitOne) / 10 - digitTwo) / 10 % 10;
        int digitFour = (((number - digitOne) / 10 - digitTwo) / 10 - digitThree) / 10;
        System.out.println(digitOne + digitTwo + digitThree + digitFour);
    }
}
