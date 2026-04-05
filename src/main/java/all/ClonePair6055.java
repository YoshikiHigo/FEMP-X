package all;

public class ClonePair6055 {

    boolean method1(Object[] array1,Object[] array2){
      if (array1.length != array2.length)   return false;
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i])     return false;
      }
      return true;
    }

    boolean method2(Object[] template,Object[] test){
      if (template.length != test.length) {
        return false;
      }
      for (int i=0; i < test.length; i++) {
        if ((template[i] != null) && (!template[i].equals(test[i]))) {
          return false;
        }
      }
      return true;
    }
}
