package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyThread  extends Thread{

    public void run() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            list.add((int)(Math.random()*100));
        }
        System.out.println(list);

        int summ = 0;
        for (int i=0; i<list.size(); i++) {
            summ = summ + list.get(i);
        }
        float average = (float) summ/list.size();
        System.out.println("Средее арифметическое коллекции: " + average );
    }
}
