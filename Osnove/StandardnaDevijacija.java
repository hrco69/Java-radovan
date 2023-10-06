package Osnove;

public class StandardnaDevijacija {

    public static void main(String[] args) {
        Integer[] integers = {5,5,5,4,4};

        double standardDeviation = calcualteSD(integers);

        System.out.println( standardDeviation);
    }

    private static double calcualteSD(Integer[] integers) {
        double sum = 0, standardDeviation = 0;
        int len = integers.length;

        for(Integer integer : integers)
            sum += integer;

        double average = sum/len;

        for(Integer integer : integers)
            standardDeviation += Math.pow(integer - average,2);

        return Math.sqrt(standardDeviation/len);
    }

}
