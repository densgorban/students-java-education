import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        ArrayList<Auto> cars = new ArrayList<>();
        cars.add(new Auto("", 1f));

        cars.add(new HeavyAuto("", 2f));

        cars.isEmpty();

        cars.size();
        cars.add(null);

        new ArrayList<>(10);
    }

}
