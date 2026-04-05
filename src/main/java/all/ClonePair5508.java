package all;

public class ClonePair5508 {

    int[] method1(int[] array,int size){
      int[] temp=new int[size];
      System.arraycopy(array,0,temp,0,array.length);
      for (int j=array.length; j < size; j++)   temp[j]=0;
      return temp;
    }

    int[] method2(int[] i,int m){
      int[] in=new int[m];
      for (int j=0; j < i.length; j++)   in[j]=i[j];
      return in;
    }
}
