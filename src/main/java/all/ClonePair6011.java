package all;

public class ClonePair6011 {

    boolean method1(Object[] array1,Object[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      for (int index=0; index < array1.length; index++) {
        if (!array1[index].equals(array2[index])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Object[] orig,Object[] rev){
      if (orig.length != rev.length) {
        return false;
      }
     else {
        for (int i=0; i < orig.length; i++) {
          if (!orig[i].equals(rev[i])) {
            return false;
          }
        }
        return true;
      }
    }
}
