package all;

public class ClonePair5507 {

    int[] method1(int[] array,int size){
      int[] temp=new int[size];
      System.arraycopy(array,0,temp,0,array.length);
      for (int j=array.length; j < size; j++)   temp[j]=0;
      return temp;
    }

    int[] method2(int[] x,int n){
      int[] S=new int[n];
      for (int i=0; i < x.length; i++) {
        int s=1;
        while ((s <= i) && (x[i - s] <= x[i])) {
          s=s + 1;
        }
        S[i]=s;
      }
      return S;
    }
}
