package pl.sda.mg.testowanie.evennumber;

public class EvenNumberUtil {
    public int[] getEvenNumbers(int[] sampleTable) {
        if (sampleTable == null) {
            return null;
        }

        int size = 0;
        for (int i = 0; i < sampleTable.length; i++) {
            if (sampleTable[i] % 2 == 0) {
                size++;
            }
        }

        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < sampleTable.length; i++) {
            if (sampleTable[i] % 2 == 0) {
                result[index] = sampleTable[i];
                index ++;
            }
        }

        return result;
    }
}
