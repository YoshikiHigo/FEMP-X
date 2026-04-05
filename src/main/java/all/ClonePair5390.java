package all;

public class ClonePair5390 {

    int[] method1(int[] arr,int newSize){
      if (arr.length == newSize)   return arr;
      int[] newArr=new int[newSize];
      System.arraycopy(arr,0,newArr,0,newSize);
      return newArr;
    }

    int[] method2(int[] a,int size){
      if (a.length == size) {
        return a;
      }
     else {
        int[] b=new int[size];
        System.arraycopy(a,0,b,0,size);
        return b;
      }
    }
}
