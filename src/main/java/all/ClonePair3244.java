package all;

public class ClonePair3244 {

    boolean method1(int[] data1,int[] data2){
      if (data1.length != data2.length)   return false;
      for (int ctr=0; ctr < data1.length; ctr++) {
        if (data1[ctr] != data2[ctr])     return false;
      }
      return true;
    }

    boolean method2(int[] a,int[] b){
      if (a.length != b.length)   return false;
      for (int i=0, bound=a.length; i < bound; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
