package org.spree.eventsapi.endpoints.response;

public class AuthResponse {

    private boolean success;
    private String token;
    private String message;

    public static AuthResponse success(String token) {
        return new AuthResponse(true, token, null);
    }

    public static AuthResponse fail(String message) {
        return new AuthResponse(false, null, message);
    }

    private AuthResponse(boolean success, String token, String message) {
        this.success = success;
        this.token = token;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
