package BinarySearchProblems;

import java.util.*;
public class MatrixSearch{
    // program for the binary search into the matrix/ 2d array 
    // matrix should be sorterd row wise and col wise
    public static void getindex(int[][] mat,int target){
        int r=0;
        int c=mat.length-1;
        while(r<mat.length && c>0){
            if(mat[r][c]==target)
            {
                System.out.println("the index are :- ["+r+","+c+"]");
                return;
            }
            if(mat[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        System.out.println("target not found");
        return;
    }
    public static  void main(String[] args)
    {
        int[][] mat=
        {
        {10,20,30,40},
        {12,25,35,45},
        {28,29,37,49},
        {33,34,38,50}
        } ;
        int target=29;
        getindex(mat,target);
    }
}