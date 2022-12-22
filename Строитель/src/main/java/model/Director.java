package model;

public class Director {

    public smileAgrigator build(Builder builder) {
        builder.buildHead();
        builder.buildBrows();
        builder.buildEyes();
        builder.buildMouth();
        return builder.getSmile();
    }
}