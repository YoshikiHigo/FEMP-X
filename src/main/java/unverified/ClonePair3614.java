package unverified;

public class ClonePair3614 {

    boolean method1(int[] a,int[] b){
      boolean result=false;
      if (a.length == b.length) {
        result=true;
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            result=false;
            break;
          }
        }
      }
      return result;
    }

    boolean method2(int[] conf1,int[] conf2){
      if (conf1.length != conf2.length) {
        System.out.println("\nLength of two configurations are not the same, can not be compared!");
        return false;
      }
      boolean output=true;
      for (int i=0; i < conf1.length; i++) {
        if (conf1[i] != conf2[i]) {
          output=false;
          break;
        }
      }
      return (output);
    }
}
