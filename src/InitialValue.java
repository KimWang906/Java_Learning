public class InitialValue {
    public static void main(String[] args) {
        // Unable to initialize stack memory value.
        int value1 = 0;
        System.out.println(value1);
        int[] value2 = null;
        System.out.println(value2);
        
        // Initialize the heap region.
        boolean[] array1 = new boolean[3];
        for(boolean k : array1) System.out.println(k);
        
        double[] array2 = new double[3];
        for(double k : array2) System.out.println(k);

        String[] array3 = new String[3];
        for(String k : array3) System.out.println(k);
    }
}
