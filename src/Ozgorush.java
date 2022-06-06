import java.util.Arrays;

public class Ozgorush extends Locality{
    public Ozgorush(String[] area) {
        super(area);
    }

    @Override
    String Leader() {
        return "АкимОзгоруша";
    }

    @Override
    public String toString() {
        return  "Ozgorush " +
                "" + Arrays.toString(area)+"\nРуководитель: "+Leader();
    }
}
