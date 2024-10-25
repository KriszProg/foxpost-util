package hu.foxpost.util.error;

import java.time.LocalDateTime;
import java.util.Objects;

public class ApiError {

    private LocalDateTime timestamp;
    private String error;

    private Integer status;

    public ApiError() {}

    public ApiError(LocalDateTime timestamp, String error, Integer status) {
        this.timestamp = timestamp;
        this.error = error;
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public ApiError timestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getError() {
        return error;
    }

    public ApiError error(String error) {
        this.error = error;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public ApiError status(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ApiError apiError = (ApiError) object;
        return Objects.equals(timestamp, apiError.timestamp)
                && Objects.equals(error, apiError.error)
                && Objects.equals(status, apiError.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, error, status);
    }

    @Override
    public String toString() {
        return "ApiError{" +
                "timestamp=" + timestamp +
                ", error='" + error + '\'' +
                ", status=" + status +
                '}';
    }

}
