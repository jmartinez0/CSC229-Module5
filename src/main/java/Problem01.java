public class Problem01 {

    public static void main(String[] args) {
        
        int[] A= {1,2,3,4,5,0,0,0,0,0,0};
        int[] B= {3,5,6,7,9};
        
        for(int i=0; i<A.length;i++){
            System.out.print(A[i]+" , ");
        }
        merge(A,B,5,5);
        System.out.println();
        for(int i=0; i<A.length;i++){
            System.out.print(A[i]+" , ");
        }

    }

    public static void merge(int[] a, int[] b, int lastA, int lastB) {
        int indexA = lastA - 1;
        /* Index of last element in array a */
        int indexB = lastB - 1;
        /* Index of last element in array b */
        int indexMerged = lastB + lastA - 1;
        /* end of merged array */

 /* Merge a and b, starting from the last element in each */
        while (indexA >= 0 && indexB >= 0) {
            /* end of a is > than end of b */
            if (a[indexA] > b[indexB]) {
                a[indexMerged] = a[indexA]; // copy element
                indexMerged--; // move indices
                indexA--;
            } else {
                a[indexMerged] = b[indexB]; // copy element
                indexMerged--; // move indices
                indexB--;
            }
        }

        /* Copy remaining elements from b into place */
        while (indexB >= 0) {
            a[indexMerged] = b[indexB];
            indexMerged--;
            indexB--;
        }
    }

}

//Time complexity O(n)
//Space complexity O(n)
