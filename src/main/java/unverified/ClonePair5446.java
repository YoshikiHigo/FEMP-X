package unverified;

public class ClonePair5446 {

    int[] method1(int[] targ,int size){
      int[] na;
      int i;
      na=new int[size];
      for (i=0; i < targ.length; i++)   na[i]=targ[i];
      while (i < na.length) {
        na[i]=targ[targ.length - 1];
        i++;
      }
      return na;
    }

    int[] method2(int[] array,int size){
      int[] temp=new int[size];
      System.arraycopy(array,0,temp,0,array.length);
      for (int j=array.length; j < size; j++)   temp[j]=0;
      return temp;
    }
}
