import java.util.Arrays;
import java.util.Scanner;

class Job {
    int id;
    int deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {
    public static void scheduleJobs(Job[] jobs) {
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int n = jobs.length;
        boolean[] slots = new boolean[n]; 
        int[] result = new int[n]; 
        int totalProfit = 0; 

        
        for (Job job : jobs) {
            for (int j = job.deadline - 1; j >= 0; j--) {
                if (!slots[j]) { 
                    slots[j] = true;
                    result[j] = job.id;
                    totalProfit += job.profit; 
                    break;
                }
            }
        }

        System.out.print("Selected Jobs: ");
        for (int job : result) {
            if (job != 0) {
                System.out.print(job + " ");
            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of jobs: ");
        int n = sc.nextInt();
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter job " + (i + 1) + " ID:");
            int id = sc.nextInt();
            System.out.println("Enter job " + (i + 1) + " Deadline:");
            int d = sc.nextInt();
            System.out.println("Enter job " + (i + 1) + " Profit:");
            int p = sc.nextInt();
            jobs[i] = new Job(id, d, p);
        }
        
        
        scheduleJobs(jobs);
    }
}
