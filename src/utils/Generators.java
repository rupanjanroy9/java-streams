package utils;

import constants.Content;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generators {

    public static List<Integer> getIntegerList(int size){
        Random random = new Random();
        return random.ints(1,20).limit(size).boxed().toList();
    }

    public static List<Long> getLongList(int size){
        Random random = new Random();
        return random.longs(size).boxed().toList();
    }

    public static List<String> getRandomStringList(int size){
       return Arrays.stream(Content.StringConstant.content.split(" ")).toList();
    }
}
