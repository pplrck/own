package rbg;

public class RBGValuesException extends RuntimeException {

    @Override
    public String getMessage() {
        printStackTrace();
        return "check rbg input values";
    }
}
