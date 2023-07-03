package homework_3;

import java.util.List;

public class task_3 {
    static int MinNum(List<Integer> arrList) {
        int min = arrList.get(0);
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        }
        return min;
    }
}
