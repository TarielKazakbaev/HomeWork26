import java.util.Arrays;

public abstract class Locality {
    String[] area;

    @Override
    public String toString() {
        return "Locality{" +
                "area=" + Arrays.toString(area) +
                '}';
    }

    public Locality(String[] area) {
        this.area = area;
    }

    abstract String Leader();
}
