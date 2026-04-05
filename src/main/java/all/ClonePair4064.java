package all;

public class ClonePair4064 {

    boolean method1(String[] a1,String[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++) {
        if (!a1[i].equals(a2[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String[] array1,String[] array2){
      if (array1.length != array2.length) {
        System.err.println("Not equal lengths: " + array1.length + "/"+ array2.length);
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (!(array1[i].equals(array2[i]))) {
          System.err.println("Not equal: " + array1 + "/"+ array2);
          return false;
        }
      }
      return true;
    }
}
