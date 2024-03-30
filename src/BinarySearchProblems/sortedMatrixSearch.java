package BinarySearchProblems;

import java.util.*;

public class sortedMatrixSearch {
    // program to find the target element in complete sorted matrix
    //using the row reduce strategies
    public static void searchIndex(int [][] mat,int target){
      int r=mat.length-1;
      int c=mat[0].length-1;//matrix might be empty
      if(r==1){
        //return the search in single row 
     binarySearch(mat,0,0,0,target);
      }

      //here we start our binary search in the row wise manner
      int rstart=0;
      int rend=r-1;
      int cmid=c/2;
      // now runing the loop till two rows are remaining
      while(rstart<(rend-1)){  // this condition will give  us last two rows
         int mid=rstart-(rend-rstart)/2;
         if(mat[mid][cmid]==target){
            System.out.println("the index are "+mid +","+cmid);
            return;
         }
         if(mat[mid][cmid]<target){
          rstart=mid;
         }
         else{
          rend=mid;
         }
      }
      //now we have two rows 
      // check whether the target is in these column of 2 rows
      if(mat[rstart][cmid]==target){
        System.out.println("the index are "+ rstart +","+cmid);
        return;
      }
      if(mat[rstart+1][cmid]==target){
        System.out.println(" the index are "+rstart+1 +","+cmid);
        return;
      }

      // otherwise search in first half if target is less than the rstart
      if(target<=mat[rstart][cmid-1]){
         binarySearch(mat, rstart, 0, cmid-1, target);
      }
      // second half if target is less than rstart
      if(target>=mat[rstart][cmid+1] && target<=mat[rstart][c-1]){
        binarySearch(mat, rstart, cmid+1, c-1, target);
      } 
      // third half if target is greater than cmid +1
     
      if(target<=mat[rstart+1][cmid-1]){
        binarySearch(mat, rstart+1, 0, cmid-1, target);
      }
      // fourth halft if target is greater than cmid+1
      else{
        binarySearch(mat, rstart+1, cmid+1, c-1, target);
      }
    }

    static void binarySearch(int[][] mat,int row,int start,int end,int target){
      
      while(start<=end){
        int mid=start+(end-start)/2;
        if(mat[row][mid]==target)
        {
            System.out.println("the index are"+ row +","+mid);
            return;
        }
        else if(mat[row][mid]<target){
           start=mid+1;
        }
        else{
          end=mid-1;
        }
       }
       System.out.println("index not found");
    }
    public static void main(String[] args) {
        int mat[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target=8;
        searchIndex(mat,target);
    }
  }
//     public static void main(String[] args) {
//       int[][] arr = {
//               {1, 2, 3},
//               {4, 5, 6},
//               {7, 8, 9}
//       };
//       System.out.println(Arrays.toString(search(arr, 3)));
//   }

//   // search in the row provided between the cols provided
//   static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
//       while (cStart <= cEnd) {
//           int mid = cStart + (cEnd - cStart) / 2;
//           if (matrix[row][mid] == target) {
//               return new int[]{row, mid};
//           }
//           if (matrix[row][mid] < target) {
//               cStart = mid + 1;
//           } else {
//               cEnd = mid - 1;
//           }
//       }
//       return new int[]{-1, -1};
//   }

//   static int[] search(int[][] matrix, int target) {
//       int rows = matrix.length;
//       int cols = matrix[0].length; // be cautious, matrix may be empty
//       if (cols == 0){
//           return new int[] {-1,-1};
//       }
//       if (rows == 1) {
//           return binarySearch(matrix,0, 0, cols-1, target);
//       }

//       int rStart = 0;
//       int rEnd = rows - 1;
//       int cMid = cols / 2;

//       // run the loop till 2 rows are remaining
//       while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
//           int mid = rStart + (rEnd - rStart) / 2;
//           if (matrix[mid][cMid] == target) {
//               return new int[]{mid, cMid};
//           }
//           if (matrix[mid][cMid] < target) {
//               rStart = mid;
//           } else {
//               rEnd = mid;
//           }
//       }

//       // now we have two rows
//       // check whether the target is in the col of 2 rows
//       if (matrix[rStart][cMid] == target) {
//           return new int[]{rStart, cMid};
//       }
//       if (matrix[rStart + 1][cMid] == target) {
//           return new int[]{rStart + 1, cMid};
//       }

//       // search in 1st half
//       if (target <= matrix[rStart][cMid - 1]) {
//           return binarySearch(matrix, rStart, 0, cMid-1, target);
//       }
//       // search in 2nd half
//       if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
//           return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
//       }
//       // search in 3rd half
//       if (target <= matrix[rStart + 1][cMid - 1]) {
//           return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
//       } else {
//           return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
//       }
//   }
// }
