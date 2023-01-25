public class Car extends Vehicle{
    double priceCar = 10;

   @Override
   public String getModel() {
    return super.getModel();
    }

    @Override
    public String getEnteredTime() {
        return super.getEnteredTime();
    }

    @Override
    public double getDuration() {
        return super.getDuration();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setEnteredTime(String enteredTime) {
        super.setEnteredTime(enteredTime);
    }

    @Override
    public void setDuration(double duration) {
        super.setDuration(duration);
    }
}
