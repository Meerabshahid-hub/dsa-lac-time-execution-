public class InsertionSort_1Lac_Time {

	    static void InsertionSort(int A[], int N) {
	        for (int i = 1; i <= N - 1; i++) {
	            int key = A[i];
	            int j = i - 1;
	            while (j >= 0 && A[j] > key) {
	                A[j + 1] = A[j];
	                j = j - 1;
	            }
	            A[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {
	        int N = 100000; // 1 LAC
	        int A[] = new int[N];

	        for (int i = 0; i < N; i++) {
	            A[i] = N - i; // 100000 to 1 - worst case
	        }

	        System.out.println("Sorting " + N + " elements (1 Lac) with Insertion Sort...");

	        long startTime = System.nanoTime();

	        InsertionSort(A, N);

	        long endTime = System.nanoTime();

	        long nano = endTime - startTime;
	        double milli = nano / 1_000_000.0;
	        double sec = nano / 1_000_000_000.0;

	        System.out.print("\n sorted: ");
	        for (int i = 0; i < 100000; i++) System.out.print(A[i] + " ");

	        System.out.println("\n\n--- EXECUTION TIME FOR 1 LAC ---");
	        System.out.println("Nano seconds  : " + nano + " ns");
	        System.out.println("Milli seconds : " + milli + " ms");
	        System.out.println("Seconds       : " + sec + " sec");

	        System.out.println("\nInsertion Sort for 1 Lac Done!");
	    }
	}

