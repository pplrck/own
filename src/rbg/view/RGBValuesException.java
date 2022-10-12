package rbg.view;

public class RGBValuesException extends RuntimeException {

    @Override
    public String getMessage() {
        printStackTrace();
        return "check rbg input values";
    }
}
