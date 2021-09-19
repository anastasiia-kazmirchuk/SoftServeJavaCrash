package otherTasks.listMapCompare;
//Create a listMapCompare() method of the MyUtils class to compare the contents of a list of strings and the values of a map.
//
//For example, for a given list
//
//[aa, bb, aa, cc]
//
//and map
//
//{1=cc, 2=bb, 3=cc, 4=aa, 5=cc}
//
//you should get true.

import java.util.*;

public class MyUtils {


    // Code
    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        // Code
        Set<String> setMap = new HashSet<>();
        Set<String> setList = new HashSet<>(list);

        for (Map.Entry<String, String> entry : map.entrySet()
        ) {
            setMap.add(entry.getValue());

        }
        for (String string : setList
        ) {
            setMap.remove(string);

        }

        return setMap.isEmpty();
    }
}