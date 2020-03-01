package mg.testowanie.pesel;

public class EvenNumber {
    public int[] getEvenNumbers(int[] sampleTable) {

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
