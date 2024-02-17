package services;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFunctions {

    public static List<Integer> getDuplicates(List<Integer> input){
        return input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .stream().filter(m->m.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static List<Integer> getDistinct(List<Integer> input){
        return input.stream().distinct().sorted().collect(Collectors.toList());
    }




}
