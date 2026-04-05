package unverified;

public class ClonePair9425 {

    int method1(int[] values){
      int result=values[0];
      for (  int i : values)   if (i > result)   result=i;
      return result;
    }

    int method2(int[] a){
      int res=a[0];
      int buff;
      for (int i=1; i < a.length; i++) {
        buff=a[i];
        if (buff > res) {
          res=buff;
        }
      }
      return res;
    }
}
