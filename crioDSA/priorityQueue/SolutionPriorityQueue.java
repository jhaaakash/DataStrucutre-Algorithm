package crioDSA.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

public class SolutionPriorityQueue {
    // Define max-heap as a class variable
    private PriorityQueue<Integer> maxHeap;

    // Constructor to initialize the max-heap
    public SolutionPriorityQueue() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    // Insert element into the max-heap
    public void insert(int element) {
        maxHeap.add(element);
    }

    // Get the maximum element from the max-heap and remove it
    public int getMax() {
        return maxHeap.poll();
    }

    // Main function to handle input and output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        SolutionPriorityQueue solution = new SolutionPriorityQueue();

        for (int i = 0; i < Q; i++) {
            int queryType = sc.nextInt();
            if (queryType == 1) {
                int element = sc.nextInt();
                solution.insert(element);
            } else if (queryType == 2) {
                System.out.println(solution.getMax());
            }
        }
        sc.close();
    }
}



/*
 * Sample Input 1
5

1 3

1 2

2

1 1

2

Sample Output 1
3

2
 */
