package KnapSackAlgo;

public class KnapSack {
    public static void main(String[] args) {

        int n = 5, W = 100;

        float[] weight = {10, 20, 30, 40, 50};

        float[] value = {20, 30, 66, 40, 60};

        float[] vbyw = new float[n];
        for (int i = 0; i < vbyw.length; i++) {
            vbyw[i] = value[i] / weight[i];
        }

        float[] answers = new float[n];

        float cWeight = 0;
        while (cWeight <= W) {
            int index = findBestValue(vbyw);
            
            if (weight[index] + cWeight <= W) {
                answers[index] = 1;
                cWeight += weight[index];
            }
            else{
                answers[index] = (W - cWeight) / weight[index];
                break;
            }

            vbyw[index] = 0;
        }

        float profit = 0;
        for (int i = 0; i < answers.length; i++) {
            profit += value[i] * answers[i];
        }

        System.out.println("Profit : " + profit);
    }

    static public int findBestValue(float[] vbyw) {
        float max = vbyw[0];
        int index = 0;
        for (int i = 0; i < vbyw.length; i++) {
            if (vbyw[i] > max) {
                max = vbyw[i];
                index = i;
            }
        }

        return index;
    }

}
