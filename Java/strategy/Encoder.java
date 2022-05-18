package design_pattern.strategy;

public class Encoder {
    private EncodingStrategy encodingStrategy;

    // public EncodingStrategy getEncodingStrategy() {
    // return this.encodingStrategy;
    // }

    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

}
