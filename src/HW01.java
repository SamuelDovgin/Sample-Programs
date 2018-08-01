public class HW01 {

    //Java subset: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap-computer-science-a-java-subset.pdf
    /**
     * Return the sum of the elements in array.
     */

    public static void main(String[] args)
    {
        int [] array = new int [5];
        array[3]=9;
        System.out.println(sum(array));
    }

    public static int sum(final int[] array) {

        int sum = 0;
        for (int i=0;i<array.length;i++)
            sum = sum + array[i];
        return sum;
    }

}
