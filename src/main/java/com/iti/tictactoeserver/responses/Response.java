package com.iti.tictactoeserver.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    public static final String STATUS_ERROR = "error";
    public static final String STATUS_OK = "ok";
//    public static final String STATUS_ACCEPTED = "accepted";
//    public static final String STATUS_REJECTED = "rejected";

    public static final String RESPONSE_INVITE_TO_GAME = "inviteToGameRes";
    public static final String RESPONSE_SIGN_UP = "signupRes";

    protected String message, status, type;

    public Response() {
    }

    public Response(String status, String type) {
        this.status = status;
        this.type = type;
    }

    public Response(@JsonProperty("message") String message,
                    @JsonProperty("status") String status,
                    @JsonProperty("type") String type) {
        this.message = message;
        this.status = status;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
