package all;

public class ClonePair6029 {

    boolean method1(Object[] array1,Object[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Object[] array1,Object[] array2){
      if (array1.length != array2.length)   return false;
      for (int i=0; i < array1.length; i++) {
        Object o1=array1[i];
        Object o2=array2[i];
        boolean eq=(o1 == o2 || (o1 != null && o1.equals(o2)));
        if (!eq)     return false;
      }
      return true;
    }
}
