package all;

public class ClonePair6804 {

    boolean method1(int[] v1,int[] v2,int len){
      for (int i=0; i < len; i++)   if (v1[i] != v2[i])   return false;
      return true;
    }

    boolean method2(int[] data,int[] data2,int len){
      for (int i=0; i < len; i++) {
        if (data[i] != data2[i]) {
          return false;
        }
      }
      return true;
    }
}
