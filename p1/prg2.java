package p1;

public class prg2 {
    public static void main(String[] args) {
        int[][][] a;
        a = new int[3][3][3];
        a[0][0][0] = 1;
        a[0][0][1] = 2;
        a[0][1][0] = 67;
        a[0][1][1] = 4;
        a[1][0][0] = 69;
        a[1][0][1] = 5;
        a[1][1][0] = 98;
        a[1][1][1] = 6;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z < 2; z++)
                    System.out.println("arr[" + i
                            + "]["
                            + j + "]["
                            + z + "] = "
                            + a[i][j][z]);
    }
}
