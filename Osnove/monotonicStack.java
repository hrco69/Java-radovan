package Osnove;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class monotonicStack {

    public static void main(String[] args) {

        int[] visineZgrada = new int[]{1,2,7,9,5,10};

        List<Integer> monotonicStack = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = visineZgrada.length - 1; i >= 0; i--){

            while(monotonicStack.size() > 0 && visineZgrada[i] > monotonicStack.get(0)){
                monotonicStack.remove(0);
            }

            if(monotonicStack.size() > 0)
                hashMap.put(visineZgrada[i], monotonicStack.get(0));
            else hashMap.put(visineZgrada[i], -1);

            monotonicStack.add(0, visineZgrada[i]);

        }

        System.out.println(hashMap.entrySet().stream().map(e -> e.getKey() + " gleda-> " + e.getValue()).toList());

    }

}
