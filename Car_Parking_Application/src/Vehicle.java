public class Vehicle {
    private String model;
    private String EnteredTime;
    private double duration;


    public Vehicle() {
    }

    public String getModel() {
        return model;
    }

    public String getEnteredTime() {
        return EnteredTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEnteredTime(String enteredTime) {
        this.EnteredTime = enteredTime;
    }

    public void setDuration(double duration) {
        this.duration=duration;
    }
}
