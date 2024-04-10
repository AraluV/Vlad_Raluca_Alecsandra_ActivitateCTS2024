package Builder2;

public class Autobuz {
    private String model;
    private String sofer;
    private boolean oprire;
    private boolean deschideUsa;

    public Autobuz(String model, String sofer, boolean oprire, boolean deschideUsa) {
        this.model = model;
        this.sofer = sofer;
        this.oprire = oprire;
        this.deschideUsa = deschideUsa;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSofer() {
        return sofer;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public boolean isOprire() {
        return oprire;
    }

    public void setOprire(boolean oprire) {
        this.oprire = oprire;
    }

    public boolean isDeschideUsa() {
        return deschideUsa;
    }

    public void setDeschideUsa(boolean deschideUsa) {
        this.deschideUsa = deschideUsa;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", sofer='" + sofer + '\'' +
                ", oprire=" + oprire +
                ", deschideUsa=" + deschideUsa +
                '}';
    }
}
