import java.util.Collections;
import java.util.LinkedList;
public class Problem1 {
    // program to insert the Node IN First Place Of the List

    public static void main(String[] args) {

        long startTime=System.nanoTime();
        
        LinkedList<Integer> list=new LinkedList<Integer>();

        for(int i=0;i<5;i++)
        {
           list.add(i);
        }
        list.add(0,1);
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.toString());
    
        System.out.println(list.size());

        System.out.println(list.isEmpty());

        
        System.out.println(list.reversed().toString());

        long endTime=System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("StartTime "+startTime/1000000 + " Nano Sec");
        System.out.println("End Time "+endTime/1000000);
        System.out.println("Execution time in nanoseconds: " + executionTime);
        System.out.println("Execution time in milliseconds: " + (executionTime / 1000000)+" mili Sec"); // Convert nanoseconds to milliseconds
    
    }
}
