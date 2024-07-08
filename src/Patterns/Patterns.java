package Patterns;

import java.util.*;

public class Patterns{
 
     public static void main(String[] args){
   
     // pattern 1 Striver [Equal Square]

     System.out.println("Pattern 1 Strivers");

     int a=5;
    
     for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
          System.out.print(" * ");
       }  
      System.out.println(" ");
    }

    System.out.println("Pattern 2");
    int b=5; 
    for(int i=0;i<b;i++){
      for(int j=0;j<i;j++){
        System.out.print(" * ");
      }
     System.out.println(" ");
    }

    
    System.out.println("Pattern 3");
    int c=5; 
    for(int i=0;i<c;i++){
      for(int j=0;j<i;j++){
        System.out.print(" "+i);
      }
     System.out.println(" ");
    }

    System.out.println("Pattern 4");
    int d=5; 
    int e=1;
    for(int i=0;i<d;i++){
      for(int j=0;j<i;j++){
        System.out.print(" "+e);
      }
     e++;
     System.out.println(" ");
    }

    System.out.println("Pattern 5");
    int f=5; 
    for(int i=f;i>0;i--){
      for(int j=0;j<i;j++){
        System.out.print(" * ");
      }
     System.out.println(" ");
    }

    System.out.println("Pattern 6");
    int g=5; 
    for(int i=g;i>0;i--){
      for(int j=0;j<i;j++){
        System.out.print(" "+j);
      }
     System.out.println(" ");
    }
    System.out.println("\n below is the pattern for number of stars");
//         *
//
//       * * *
//
//     * * * * *
//
//   * * * * * * *
   System.out.println("Pattern 7 : Start Pyramid");
   int h=7;
   int z=0;
   for(int i=h;i>=0;i--){
    for(int j=0;j<=i;j++){
      System.out.print(" ");
    }
    if(i%2!=0){
    for(int k=0;k<=z;k++){
        System.out.print("* ");
      }
    }
   z++;
   System.out.println("");
   }
//                *
//             *  *  *
//          *  *  *  *  *
//       *  *  *  *  *  *  *
//    *  *  *  *  *  *  *  *  *

         System.out.println("Below is the pattern for levels of pyramid: pattern 7");
         int i1=6;
         int aa=0;
         for(int zz=i1;zz>0;zz--){
             for(int xx=1;xx<=zz;xx++){
                 System.out.print("   ");
             }
             for(int jj=0;jj<=aa;jj++) {
                 System.out.print(" * ");
             }
             aa+=2;
             System.out.println(" ");
         }

         System.out.println("Pattern 8 :");
         int i2=6;
         int ab=(i2*2)-2;
         for(int zz=0;zz<=i2;zz++){
             for(int xx=0;xx<=zz;xx++){
                 System.out.print("   ");
             }
             for(int jj=ab;jj>=0;jj--) {
                 System.out.print(" * ");
             }
             ab=ab-2;
             System.out.println(" ");
         }

         System.out.println("Pattern 9: combine both the above :");
         System.out.println("\n Pattern 10 :");

         int ac=5;
         for(int i=0;i<ac;i++){
             for(int j=0;j<i;j++){
                 System.out.print(" * ");
             }
             System.out.println(" ");
         }
         for(int i=ac;i>=0;i--){
             for(int j=0;j<i;j++){
                 System.out.print(" * ");
             }
             System.out.println(" ");
         }

         System.out.println("Pattern 11:");
         int ad=6;
         for(int i=0;i<ad;i++){
             int star=0;
             if(i%2==0) star=1;
             else star=0;
             for(int j=0;j<=i;j++){
                 System.out.print(star);
                 star=1-star;
             }
             System.out.println(" ");
         }

         System.out.println("pattern 12:");
         int ae=5;
         int spaces=2*(ae-1);
         for(int i=1; i<=ae;i++){
             for(int j=1;j<=i;j++) {
                 System.out.print(j);
                 }
             for(int x=1;x<=spaces;x++){ //ae-2*i+1
                 System.out.print(" ");
             }
             for(int j=i;j>=1;j--){
                 System.out.print(j);
             }
             System.out.println(" ");
             spaces-=2;
         }

         System.out.println("pattern 13:");
         int af=5;
         int count=1;
         for(int i=1;i<=af;i++){
             for(int j=0;j<i;j++){
                 System.out.print(count+" ");
                 count++;
             }
             System.out.println(" ");
         }
         System.out.println("Pattern 14:");
         int ag=5;
         int ch=65;
         for(int i=0;i<ag;i++){
             for(int j=0;j<=i;j++){
                 System.out.print(Character.toChars(ch+j));
             }
             System.out.println(" ");
         }

         System.out.println("Pattern 15:");
         int ba=5;
         char chh=65;
         for(int i=ba;i>=0;i--)
         {
             for(int j=0;j<i;j++){
                 System.out.print(Character.toString(chh+j)+" ");
             }
             System.out.println(" ");
         }

         System.out.println("Pattern 16:");
         int bb=5;
         char chhh=65;
         for(int i=0;i<bb;i++){
             for(int j=0;j<=i;j++){
                 System.out.print(chhh);
             }
             System.out.println(" ");
             chhh+=1;
         }

         int number=6;
         int co=2*number+1;
         for(int i=0;i<=number;i++)
         {
                 System.out.print(co+":"+co/2+" ");
                 co-=2;
         }
  }
}