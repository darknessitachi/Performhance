package com.monitise.performhance.api.model;

public class Response<T> {

    protected boolean success;
    protected T data;
    protected Error error;

    // region Getters

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public Error getError() {
        return error;
    }

    // endregion

    // region Setters

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setError(Error error) {
        this.error = error;
    }

    // endregion

}