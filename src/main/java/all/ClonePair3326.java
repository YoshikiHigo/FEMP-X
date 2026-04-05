package all;

public class ClonePair3326 {

    boolean method1(int[] o1,int[] o2){
      if (o1.length != o2.length) {
        return false;
      }
     else {
        for (int i=0; i < o1.length; i++) {
          if (o1[i] != o2[i]) {
            return false;
          }
        }
        return true;
      }
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
