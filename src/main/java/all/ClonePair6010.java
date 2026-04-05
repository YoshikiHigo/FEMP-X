package all;

public class ClonePair6010 {

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

    boolean method2(Object[] o,Object[] p){
      if (o.length != p.length) {
        return false;
      }
      for (int i=0; i < o.length; i++) {
        if (!(o[i].equals(p[i]))) {
          return false;
        }
      }
      return true;
    }
}
