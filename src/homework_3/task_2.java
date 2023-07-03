package homework_3;

import java.util.List;

public class task_2 {
    static int maxNumber(List<Integer> arrList) {
        int max = arrList.get(0);
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        return max;
    }
}
