import java.util.Arrays;

public class Toktogul extends Locality{
    public Toktogul(String[] area) {
        super(area);
    }

    @Override
    public String toString() {
        return  "Toktogul," +
                "районы: " + Arrays.toString(area)+"\nРуководитель: "+Leader();
    }

    @Override
    String Leader() {
        return "ГубернаторТоктогула";
    }
}
