package unverified;

public class ClonePair3371 {

    boolean method1(int[] pattern1,int[] pattern2){
      int len=pattern1.length;
      for (int i=0; i < len; i++) {
        if (pattern1[i] != pattern2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] tuple1,int[] tuple2){
      int arity=tuple1.length;
      for (int i=0; i < arity; i++)   if (tuple1[i] != tuple2[i])   return false;
      return true;
    }
}
