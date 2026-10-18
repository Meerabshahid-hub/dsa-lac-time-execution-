public class SelectionSort_1Lac_Time {

	    static void SelectionSort(int A[], int N) {
	        int U = 0;
	        while (U < N - 1) {
	            int Temp = A[U];
	            int Loc = U;
	            int I = U + 1;
	            while (I < N) {
	                if (Temp > A[I]) {
	                    Temp = A[I];
	                    Loc = I;
	                }
	                I = I + 1;
	            }
	            int T = A[Loc];
	            A[Loc] = A[U];
	            A[U] = T;
	            U = U + 1;
	        }
	    }

	    public static void main(String[] args) {
	        int N = 100000; // 1 LAC
	        int A[] = new int[N];

	        for (int i = 0; i < N; i++) {
	            A[i] = N - i; // 100000 to 1
	        }

	        System.out.println("Sorting " + N + " elements (1 Lac) with Selection Sort...");

	        long startTime = System.nanoTime();

	        SelectionSort(A, N);

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

	        System.out.println("\nSelection Sort for 1 Lac Done!");
	    }
	}

