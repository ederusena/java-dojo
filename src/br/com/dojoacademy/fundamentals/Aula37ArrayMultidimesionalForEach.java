package br.com.dojoacademy.fundamentals;

public class Aula37ArrayMultidimesionalForEach {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 32;
        dias[0][2] = 33;

        dias[1][0] = 41;
        dias[1][1] = 42;
        dias[1][2] = 43;

        dias[2][0] = 51;
        dias[2][1] = 52;
        dias[2][2] = 53;

        for (int[] arrBase : dias) {
            for(int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
