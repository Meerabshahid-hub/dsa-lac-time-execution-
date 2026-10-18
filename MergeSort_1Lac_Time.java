public class MergeSort_1Lac_Time {
	    
	    public static void merge_sort(int AB[], int N) {
	        if (N <= 1) return;

	        int Mid = (N + 1) / 2;
	        int R = Mid;
	        int S = N - Mid;

	        int A[] = new int[R];
	        int B[] = new int[S];

	        for (int I = 0; I < Mid; I++) A[I] = AB[I];
	        for (int I = Mid; I < N; I++) B[I - Mid] = AB[I];

	        merge_sort(A, R);
	        merge_sort(B, S);

	        int L1 = 0, L2 = 0, L = 0;

	        while (L1 < R && L2 < S) {
	            if (A[L1] < B[L2]) {
	                AB[L] = A[L1]; L++; L1++;
	            } else {
	                AB[L] = B[L2]; L++; L2++;
	            }
	        }

	        if (L1 >= R) {
	            for (int I = 0; I < S - L2; I++) AB[L + I] = B[L2 + I];
	        } else {
	            for (int I = 0; I < R - L1; I++) AB[L + I] = A[L1 + I];
	        }
	    }

	    public static void main(String[] args) {
	        int N = 100000; // <-- 1 LAC
	        int AB[] = new int[N];

	        for (int i = 0; i < N; i++) {
	            AB[i] = N - i; // 100000 to 1 - worst case
	        }

	        System.out.println("Sorting " + N + " elements (1 Lac) with Merge Sort...");

	        // START TIME
	        long startTime = System.nanoTime();

	        merge_sort(AB, N);

	        // END TIME
	        long endTime = System.nanoTime();

	        long nano = endTime - startTime;
	        double milli = nano / 1_000_000.0;
	        double sec = nano / 1_000_000_000.0;

	        System.out.print("\n sorted: ");
	        for (int i = 0; i < 100000; i++) System.out.print(AB[i] + " ");

	        System.out.println("\n\n--- EXECUTION TIME FOR 1 LAC ---");
	        System.out.println("Nano seconds  : " + nano + " ns");
	        System.out.println("Milli seconds : " + milli + " ms");
	        System.out.println("Seconds       : " + sec + " sec");

	        System.out.println("\nMerge Sort for 1 Lac Done!");
	    }
	}

