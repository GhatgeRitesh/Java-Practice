package MultidimensionArrays;

public class Leetcode1701AverageWaitingtime {

    public static void main(String[] args) {
        int[][] customers={{5,2},{5,4},{10,3},{20,1}};

        System.out.println(customers[0][1]);
        int n = customers.length;
        double time_waiting = customers[0][1];
        int finished_prev = customers[0][0] + customers[0][1];

        for (int customer_ind = 1; customer_ind < n; ++customer_ind) {
            int[] times = customers[customer_ind];
            int arrive = times[0];

            int start_cook = Math.max(arrive, finished_prev);
            int end_time = start_cook + times[1];
            finished_prev = end_time;
            time_waiting += end_time - arrive;
        }

        System.out.println(time_waiting / n);

    }
}
