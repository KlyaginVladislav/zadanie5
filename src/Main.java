public class Main {
    public static void main(String[] args) {
        int [] weight = new int[12];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;

        int januaryWeight = weight [0];
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);


        float[] weight1 = {1.57f, 7.654f, 9.986f};

        int[] weight2 = {4, 5, 6};

        for (int i=0; i<weight1.length; i++){

            if(i!=weight2.length-1)
            System.out.print(weight1[i]+", ");

            else
                System.out.println(weight1[i]);
        }

        System.out.println("--в обратном порядке--");

        for (int i=weight1.length-1; i>=0; i--){

            if(i !=0)
                System.out.print(weight1[i]+", ");

            else
                System.out.println(weight1[i]);
        }

        System.out.println();
        for (int i=0; i<weight2.length; i++) {

            if (weight2[i] % 2 == 1) {
                weight2[i] +=1;
            }

            if (i != weight2.length - 1)
                System.out.print(weight2[i] + ", ");

            else
                System.out.println(weight2[i]);


        }

    }
}
