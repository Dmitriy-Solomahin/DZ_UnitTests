public class Average {
    public static String averageArrays(int[] arr1, int[] arr2) {
        float avgArr1;
        float avgArr2;
        int sumArr1 = 0;
        int sumArr2 = 0;

        for (int num : arr1) {
            sumArr1 += num;
        }

        for (int num : arr2) {
            sumArr2 += num;
        }

        avgArr1 = (float) sumArr1 / arr1.length;
        avgArr2 = (float) sumArr2 / arr2.length;

        if (avgArr1 > avgArr2) {
            return "Первый список имеет большее среднее значение";
        } else if (avgArr2 > avgArr1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
