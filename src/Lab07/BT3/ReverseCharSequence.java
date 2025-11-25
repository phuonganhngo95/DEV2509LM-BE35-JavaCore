package Lab07.BT3;

public class ReverseCharSequence implements CharSequence {

    private String reversedString;

    public ReverseCharSequence(String input) {
        this.reversedString = new StringBuilder(input == null ? "" : input).reverse().toString();
    }

    @Override
    public int length() {
        return reversedString.length();
    }

    @Override
    public char charAt(int index) {
        return reversedString.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversedString.subSequence(start, end);
    }

    @Override
    public String toString() {
        return reversedString;
    }
}