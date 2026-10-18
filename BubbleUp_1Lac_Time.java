public class BubbleUp_1Lac_Time {

	    static void BUBBLE(int DATA[], int N) {
	        for (int K = 1; K <= N - 1; K++) {
	            int PTR = 0;
	            while (PTR <= N - K - 1) {
	                if (DATA[PTR] > DATA[PTR + 1]) {
	                    int TEMP = DATA[PTR];
	                    DATA[PTR] = DATA[PTR + 1];
	                    DATA[PTR + 1] = TEMP;
	                }
	                PTR = PTR + 1;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int N = 100000; // 1 LAC
	        int DATA[] = new int[N];

	        for (int i = 0; i < N; i++) {
	            DATA[i] = N - i; // 100000 to 1 - worst case
	        }

	        System.out.println("Sorting " + N + " elements (1 Lac) with Bubble Up...");

	        long startTime = System.nanoTime();

	        BUBBLE(DATA, N);

	        long endTime = System.nanoTime();

	        long nano = endTime - startTime;
	        double milli = nano / 1_000_000.0;
	        double sec = nano / 1_000_000_000.0;

	        System.out.print("\nFirst 20 sorted: ");
	        for (int i = 0; i < 20; i++) System.out.print(DATA[i] + " ");

	        System.out.println("\n\n--- EXECUTION TIME FOR 1 LAC ---");
	        System.out.println("Nano seconds  : " + nano + " ns");
	        System.out.println("Milli seconds : " + milli + " ms");
	        System.out.println("Seconds       : " + sec + " sec");

	        System.out.println("\nBubble Up for 1 Lac Done!");
	    }
	}

