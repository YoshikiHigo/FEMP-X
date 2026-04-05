package all;

public class ClonePair9393 {

    int[] method1(int[] qube,int off,int len){
      int[] result=new int[len];
      for (int i=0; i < len; i++) {
        result[i]=qube[i + off];
      }
      return result;
    }

    int[] method2(int[] source,int pos,int length){
      int dest[]=new int[length];
      for (int i=0; i < length; i++)   dest[i]=source[pos + i];
      return dest;
    }
}
