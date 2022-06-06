import java.util.Arrays;

public class Orlovka extends Locality{


    public Orlovka(String[] area) {
        super(area);
    }

    @Override
    String Leader() {
        return "АкимОрловки";
    }

    @Override
    public String toString() {
        return  "Orlovka " +
                "" + Arrays.toString(area)+"\nРуководитель: "+Leader();
    }
}
