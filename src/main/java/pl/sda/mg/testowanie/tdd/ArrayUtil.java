package pl.sda.mg.testowanie.tdd;

public class ArrayUtil {
    public static String[] removeElements(String[] sampleArray, String ... elementsToRemove) {

        if (sampleArray == null || elementsToRemove == null) {
            return new String[0];
        }

        int sizeOfNewTable = sampleArray.length;
        for (int i = 0; i < elementsToRemove.length; i++) {
            for (int j = 0; j < sampleArray.length; j++) {
                if (sampleArray[j].equals(elementsToRemove[i])) {
                    sampleArray[j] = null;
                    sizeOfNewTable--;
                }
            }
        }

        String[] result = new String[sizeOfNewTable];
        int tempIndex = 0;
        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] != null) {
                result[tempIndex] = sampleArray[i];
                tempIndex++;
            }
        }

        return result;
    }
}
