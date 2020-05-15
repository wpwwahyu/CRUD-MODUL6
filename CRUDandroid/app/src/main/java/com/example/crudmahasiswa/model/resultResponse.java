package com.example.crudmahasiswa.model;

public class resultResponse {
    String status; //respon pada json
    String message;

    public String getStatus() { //mendapat nilai status
        return status;
    }

    public String getMessage() {
        return message;
    }
}
