package all;

public class ClonePair5150 {

    boolean method1(double[] vec1,double[] vec2){
      if (vec1.length != vec2.length)   return (false);
      for (int i=0; i < vec1.length; ++i)   if (vec1[i] != vec2[i])   return (false);
      return (true);
    }

    boolean method2(double[] a,double[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
