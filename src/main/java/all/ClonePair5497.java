package all;

public class ClonePair5497 {

    int[] method1(int[] data,int length){
      int[] ans=new int[length];
      int debut;
      if (length - data.length < 0)   debut=data.length - length;
     else   debut=0;
      System.arraycopy(data,0,ans,0,data.length - debut);
      return (ans);
    }

    int[] method2(int[] i,int size){
      int[] j=new int[size];
      if (size > i.length)   size=i.length;
      System.arraycopy(i,0,j,0,size);
      return j;
    }
}
