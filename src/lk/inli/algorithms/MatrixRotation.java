package lk.inli.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixRotation {
    // Complete the matrixRotation function below.
    public void matrixRotation(List<List<Integer>> matrix, int r) {
        long start = System.currentTimeMillis();
        System.out.println(matrix);

        int m = matrix.size();
        int n = matrix.get(0).size();
        int noOfLoops = Math.min(m, n) / 2;
        //System.out.println(String.format("m: %d, n: %d, loops: %d", m, n, noOfLoops));

        //matrix.get(0).set(0, 2);

        Integer[][] arrayMatrix = new Integer[m][n];
        int k = 0;
        for (List<Integer> list : matrix) {
            Integer[] array = list.toArray(new Integer[n]);
            arrayMatrix[k] = array;
            k++;
        }

        /*
        1  2  3  4
        5  6  7  8
        9  10 11 12
        13 14 15 16
         */
        for (int rotation=0; rotation<r; rotation++) {

            for (int i = 0; i < noOfLoops; i++) {
                Integer temp = arrayMatrix[i][i]; //keep the first element

                int x;
                for (x = i; x < (arrayMatrix[i].length - (i + 1)); x++) {
                    arrayMatrix[i][x] = arrayMatrix[i][x + 1];
                }
                //System.out.println("x: " + x);
                //x--; //adjust the loop increment
                int y;
                for (y = i; y < (arrayMatrix.length - (i + 1)); y++) {
                    arrayMatrix[y][x] = arrayMatrix[y + 1][x];
                }
                //System.out.println("y: " + y);

                int z;
                for (z = x; z > i; z--) {
                    arrayMatrix[y][z] = arrayMatrix[y][z - 1];
                }
                //System.out.println("z: " + z);

                int a;
                for (a = y; a > (i + 1); a--) {
                    //System.out.println("a: " + a);
                    arrayMatrix[a][z] = arrayMatrix[a - 1][z];
                }

                //now copy the first element to remaining element
                arrayMatrix[a][z] = temp;

            }
        }

        this.printArray(arrayMatrix);
        System.out.println("Time taken: " + (System.currentTimeMillis() - start));
    }

    private void printArray(Integer[][] arrayMatrix) {
        for (Integer[] arr : arrayMatrix) {
            for (Integer val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private  List<List<Integer>> twoDArrayToList(Integer[][] twoDArray) {
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        for (Integer[] array : twoDArray) {
            ArrayList list = new ArrayList<Integer>();
            list.addAll(Arrays.asList(array));

            matrix.add(list);
        }
        return matrix;
    }

    public static void main(String[] args) {
        MatrixRotation mr = new MatrixRotation();

        mr.matrixRotation(mr.twoDArrayToList(new Integer[][]{{1,2}, {4,3}}), 3);
        System.out.println("------------------------------------------------------");
        mr.matrixRotation(mr.twoDArrayToList(new Integer[][]{{1,2,3}, {6,5,4}}), 1);
        System.out.println("------------------------------------------------------");
        mr.matrixRotation(mr.twoDArrayToList(new Integer[][]{{1,2}, {6,3}, {5,4}}), 3);
        System.out.println("------------------------------------------------------");
        mr.matrixRotation(mr.twoDArrayToList(new Integer[][]{{1,2}, {6,3}, {5,4}}), 3);
        System.out.println("------------------------------------------------------");
        mr.matrixRotation(mr.twoDArrayToList(new Integer[][]{{1,2,3,4}, {12,1, 2, 5}, {11, 4, 3, 6}, {10, 9, 8, 7}}), 2);
        System.out.println("------------------------------------------------------");
        mr.matrixRotation(mr.twoDArrayToList(new Integer[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}}), 2);
        System.out.println("------------------------------------------------------");
        mr.matrixRotation(mr.twoDArrayToList(new Integer[][]{{1,2,3,4}, {7,8,9,10}, {13,14,15,16}, {19,20,21,22}, {25,26,27,28}}), 7);


    }
}
