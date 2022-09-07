package br.com.dojoacademy.fundamentals;

public class Aula36ArrayMultidimensional {
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

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
