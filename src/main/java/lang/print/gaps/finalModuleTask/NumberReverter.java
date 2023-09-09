package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int digitOne = number % 10;
        int digitTwo = (number - digitOne) / 10 % 10;
        int digitThree = ((number - digitOne) / 10 - digitTwo) / 10 % 10;
        System.out.println("" + digitOne + digitTwo + digitThree);
    }
}
