package exercise;

public class NegativeRadiusException extends Exception{
    private String errorCode;
    public String message;

    public NegativeRadiusException(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
// BEGIN

// END
