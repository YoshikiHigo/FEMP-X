package all;

public class ClonePair3313 {

    boolean method1(int[] a,int[] b){
      if (a.length != b.length)   return false;
      for (int i=0, bound=a.length; i < bound; i++)   if (a[i] != b[i])   return false;
      return true;
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
