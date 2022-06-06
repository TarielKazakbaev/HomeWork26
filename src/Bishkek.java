import java.util.Arrays;

public class Bishkek extends Locality{

    public Bishkek(String[] area) {
        super(area);
    }

    @Override
    public String toString() {
        return  "Bishkek," +
                "районы: " + Arrays.toString(area)+"\nРуководитель: "+Leader() ;
    }

    @Override
    String Leader() {
        return "Мэр";
    }
}
