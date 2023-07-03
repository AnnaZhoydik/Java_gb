package homework_3;

import java.util.List;

public class task_4 {
    static double averageNum(List<Integer> arrList) {
        int sum = 0;
        double average;
        for (int i=0; i < arrList.size(); i++) {
            sum += arrList.get(i);
        }
        average = sum / arrList.size();
        return average;
    }
}
