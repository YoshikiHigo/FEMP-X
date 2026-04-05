package unverified;

public class ClonePair3529 {

    boolean method1(int[] orig,int[] dest){
      for (int i=0; i < orig.length; i++)   if (orig[i] != dest[i])   return false;
      return true;
    }

    boolean method2(int[] tuple1,int[] tuple2){
      int arity=tuple1.length;
      for (int i=0; i < arity; i++)   if (tuple1[i] != tuple2[i])   return false;
      return true;
    }
}
