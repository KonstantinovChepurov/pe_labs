package asu.cars;


public class NoSuchCarException extends Exception {

    public NoSuchCarException() {}

    public NoSuchCarException(String msg) {
        super(msg);
    }
}
