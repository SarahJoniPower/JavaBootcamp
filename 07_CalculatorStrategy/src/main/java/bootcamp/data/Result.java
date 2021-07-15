package bootcamp.data;

import java.math.BigDecimal;
import java.util.Optional;

public class Result {
    private Status status;
    private String statusMessage;
    private Optional<BigDecimal> value;

    public Result(Status status, String statusMessage, Optional<BigDecimal> value) {
        this.status = status;
        this.statusMessage = statusMessage;
        this.value = value;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public Optional<BigDecimal> getValue() {
        return this.value;
    }
}
