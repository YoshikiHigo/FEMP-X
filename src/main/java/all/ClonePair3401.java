package all;

public class ClonePair3401 {

    boolean method1(int[] date1,int[] date2){
      for (int i=0; i < date1.length; i++) {
        if (date1[i] < date2[i])     return true;
        if (date1[i] > date2[i])     return false;
      }
      return false;
    }

    boolean method2(int[] tuple1,int[] tuple2){
      int arity=tuple1.length;
      for (int i=0; i < arity && tuple1[i] <= tuple2[i]; i++)   if (tuple1[i] < tuple2[i])   return true;
      return false;
    }
}
