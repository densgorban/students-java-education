import java.util.Objects;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        Auto[][] cars = new Auto[5][3];

        cars[0][0] = new Auto("Hyundai", 1.5f);

        cars[0][2] = new Auto("Bogdan", 4f);

        cars[2] = new Auto[]{
                new HeavyAuto("KRAZ", 8f),
                new HeavyAuto("GAZ", 6.2f),
                new HeavyAuto("TAZ", 1.2f)
        };

        System.out.println(cars[0][0].equals(new Auto("Hyundai", 1.5f)));

        System.out.println(cars[2][2]);

        System.out.println(cars[2]);
//
//        int length = cars.length;
//
//        int lengthLine = cars[0].length;
//
//        Auto[][] clone = cars.clone();
//
//        for (Auto[] aline: cars){
//            for (Auto auto: aline){
//                System.out.println(auto);
//            }
//        }

        System.out.println(cars[5]);
//

    }
}

class Auto {

    private String name;
    private float volume;

    public Auto(String name, float volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (Float.compare(auto.volume, volume) != 0) return false;
        return name != null ? name.equals(auto.name) : auto.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (volume != +0.0f ? Float.floatToIntBits(volume) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}

class HeavyAuto extends Auto{
    public HeavyAuto(String name, float volume) {
        super(name, volume);
    }
}