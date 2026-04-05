package unverified;

public class ClonePair2309 {

    boolean method1(byte[] array1,byte[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      int len=array1.length;
      for (int i=0; i < len; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] baFirst,byte[] baSecond){
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
}
