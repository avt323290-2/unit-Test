package hw_3.nums;

public class CheckNumber {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        return n >= 25 && n <= 100;
    }
}