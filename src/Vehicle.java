public abstract class Vehicle {
    //can run, stop and accelerate
    private  String runner;
    private String stopper;
    private String accelerator;

    public Vehicle(){

    }

    public String getRunner() {
        return runner;
    }

    public void setRunner(String runner) {
        this.runner = runner;
    }

    public String getStopper() {
        return stopper;
    }

    public void setStopper(String stopper) {
        this.stopper = stopper;
    }

    public String getAccelerator() {
        return accelerator;
    }

    public void setAccelerator(String accelerator) {
        this.accelerator = accelerator;
    }
}
