import java.util.*;

public class Graphs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vx = sc.nextInt();

        while(vx<0){
            vx = sc.nextInt();
        }

        int mt[][] = new int[vx][vx];

        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                int edge = sc.nextInt();
                 mt[i][j] = edge;
                 mt[j][i] = edge;
            }
        }
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                System.out.print(mt[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
        
    }
}