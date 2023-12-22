package ex2;

public class NumRangeException extends Exception {
    public NumRangeException() {
        super("1~100 사이의 값만 입력할 수 있습니다.");
    }

    public NumRangeException(String message) {
        super(message);
    }
}
