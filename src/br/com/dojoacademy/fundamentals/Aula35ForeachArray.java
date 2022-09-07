package br.com.dojoacademy.fundamentals;

public class Aula35ForeachArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5};

        for(int num : numbers2) {
            System.out.println(num);
        }

    }
}
