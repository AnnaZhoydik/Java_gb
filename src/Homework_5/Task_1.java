package Homework_5;

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами
//их необходимо считать, как одного человека с разными телефонами.
//Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Task_1{
             static void addNumber(String key, String value, Map<String, ArrayList> map){
                if (map.containsKey(key)) {
                    map.get(key).add(value);
                } else {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(value);
                    map.put(key, list);
                }
            }
            static void printBook(Map<String, ArrayList<Integer>> map){
                for (var item : map.entrySet()) {
                    String phones = "";
                    for(int el: item.getValue()){
                        phones = phones + el + " ";
                    }
                    System.out.printf("%s: %s \n", item.getKey(), phones);
                }
            }


            static void sortedPrint(Map<String, ArrayList> map) {
                Set<String> keySet = map.keySet();
                int maxCount = 0;
                int minCount = 1_000_000;

                for (var item : map.entrySet()) {
                    if (maxCount < item.getValue().size())
                        maxCount = item.getValue().size();
                    if (minCount > item.getValue().size())
                        minCount = item.getValue().size();
                }
                Stack<String> st = new Stack<>();
                int num = minCount;
                while (num <= maxCount) {
                    for (var item : map.entrySet()) {
                        if (item.getValue().size() == num) {
                            st.push(item.getKey());
                        }
                    }
                    num += 1;
                }
                String name;
                for (int i = 0; i < keySet.size(); i++) {
                    name = st.pop();
                    for (var item : map.entrySet()) {
                        if (name == item.getKey()) {
                            System.out.printf("%8s: ", item.getKey());
                            System.out.println(item.getValue());
                        }
                    }
                }
                System.out.println();
            }


        }

