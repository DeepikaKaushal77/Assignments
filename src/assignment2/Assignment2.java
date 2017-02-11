/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author user
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrayRev=new int[]{10,2,3,11,7,-10};
        ReverseArray(arrayRev);
        int x=FindMinSum(arrayRev);
        System.out.println(x);
    }
    public static void ReverseArray(int[] arrayRev){
        int length=arrayRev.length;
        int[] result=new int[length];
        int j=0;
        for(int i=0;i<arrayRev.length;i++){
            result[i]=arrayRev[length-1];
            length--;
            
        }
        for(int i=0;i<arrayRev.length;i++){
            System.out.println(result[i]);
        }
        
    }
    public static int FindMinSum(int[] arrayRev){
        int min1=arrayRev[0];
        int min2=arrayRev[1];
        int minSum=min1+min2;
        for(int i=0;i<arrayRev.length-1;i++){
            for(int j=i+1;j<arrayRev.length;j++){
                int check=arrayRev[i]+arrayRev[j];
                if(check<0)
                    check=-(check);
                if(check<minSum){
                    minSum=check;
                    min1=arrayRev[i];
                    min2=arrayRev[j];
                }
                    
            }
        }
        System.out.println(min1);
        System.out.println(min2);
        return minSum;
    }
}
