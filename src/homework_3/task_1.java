package homework_3;

import java.util.List;

public class task_1 {
    static List deleteEven(List<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        }
        return arrList;
    }
}