package all;

public class ClonePair2893 {

    boolean method1(byte[] baFirst,byte[] baSecond){
      if (baFirst.length == baSecond.length) {
        for (int i=0; i < baFirst.length; i++) {
          if (baFirst[i] != baSecond[i]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    boolean method2(byte[] array1,byte[] array2){
      boolean same=true;
      int len1=array1.length;
      if (len1 == array2.length) {
        int i=0;
        while (i < len1 && same) {
          same=(array1[i] == array2[i]);
          i++;
        }
      }
     else {
        same=false;
      }
      return same;
    }
}
