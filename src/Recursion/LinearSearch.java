package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    // code to implement linear search in recursion

    static int search(int[] arr,int target,int index)
    {
        if(index==arr.length-1 && arr[index]!=target)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return search(arr,target,index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,3,5,5,5,2,7,8,74,34,23,121};
        int k=5;
        System.out.println(search(arr,k,0));
        ArrayList<Integer> list=new ArrayList<>();
        checkmultiple(arr,k,0,list);
        System.out.println(list.toString());
        System.out.println(getList(arr,k,0).toString());
    }

    //method to get the multiple occurance

    static ArrayList<Integer> checkmultiple(int[] arr,int target,int index,ArrayList<Integer>list)
    {
        if(index==arr.length-1)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return checkmultiple(arr,target,index+1,list);
    }

    // method to return the arraylist without using it in argument and declaring it outside of the method
    static ArrayList<Integer> getList(int[] arr , int target , int index)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        if(index==arr.length-1)
        {
            return list1;
        }
        if(arr[index]==target)
        {
            list1.add(index);
        }
        ArrayList<Integer> ans=getList(arr,target,index+1);
        list1.addAll(ans);
        return list1;
    }
}
