package otherTasks.noteBook;

import java.util.*;

public class MyUtils {


    public Map<String, List<String>> createNotebook(Map<String, String> phones) {

        Map<String, List<String>> notebook = new HashMap<>();
        if (phones != null) {


            for (Map.Entry<String, String> entry : phones.entrySet()
            ) {
                if (entry.getKey() != null) {
                    notebook.put(entry.getValue(), new ArrayList<>());
                }
            }
            if (notebook.size() > 0) {
                for (String key : notebook.keySet()
                ) {
                    List<String> stringList = new ArrayList<>();
                    for (Map.Entry<String, String> entry : phones.entrySet()
                    ) {
                        if (entry.getValue() == null && entry.getKey() != null) {
                            stringList.add(entry.getKey());
                        } else if (entry.getValue().equals(key) && entry.getKey() != null) {
                            stringList.add(entry.getKey());
                        }

                    }
                    notebook.replace(key, stringList);

                }
            }
        }

        return notebook;
    }
}