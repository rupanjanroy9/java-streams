import services.StreamFunctions;
import utils.Generators;

import java.util.List;

public class Loader {

    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Integer> intList = Generators.getIntegerList(25);
        System.out.println(intList);
        System.out.println(StreamFunctions.getDuplicates(intList));
        System.out.println(StreamFunctions.getDistinct(intList));
    }
}
