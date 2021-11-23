package ProjectWithSolutions.Lab5.Lab52;

public class ExptionNullSecond extends Throwable {
    private String message;
    private String reason;

    public ExptionNullSecond(String message, String reason) {
        this.message = message;
        this.reason = reason;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getReason() {
        return reason;
    }
}
