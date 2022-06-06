import java.util.Arrays;

public class Talas extends Locality{
    public Talas(String[] area) {
        super(area);
    }

    @Override
    public String toString() {
        return  "Talas," +
                "районы: " + Arrays.toString(area)+"\nРуководитель: "+Leader();
    }

    @Override
    String Leader() {
        return "ГубернаторТаласа";
    }
}
