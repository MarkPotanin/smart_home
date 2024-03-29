package ru.sbt.mipt.oop;

import java.util.function.Function;

public class Light implements Functionable{
    private boolean isOn;
    private final String id;

    public Light(String id, boolean isOn) {
        this.id = id;
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getId() {
        return id;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void executeFunc(Function<Object, Void> function) {
        function.apply(this);
    }
}
