package radioProject;

public class Store {
    String name;
    String frequency;


    public Store(String name, String frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return
                " CHANNEL NAME= " + name +
                " FREQUENCY= " + frequency ;
    }
}
