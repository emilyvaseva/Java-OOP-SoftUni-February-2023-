package P01WorkingWithAbstractionsExercise.P04TrafficLights;

public class TrafficLight {
    public enum Signal {
        RED,
        GREEN,
        YELLOW
    }

    private Signal signal;
    public TrafficLight(Signal signal) {
        this.signal=signal;
    }

    public void update() {
        switch (this.signal){
            case RED -> this.signal = Signal.GREEN;
            case GREEN -> this.signal = Signal.YELLOW;
            case YELLOW -> this.signal = Signal.RED;
            default -> throw new IllegalStateException("Unknown state "+this.signal);
        }
    }

    public Signal getSignal() {
        return signal;
    }
}
