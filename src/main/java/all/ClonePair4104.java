package all;

public class ClonePair4104 {

    boolean method1(String[] array1,String[] array2){
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

    boolean method2(String[] r,String[] s){
      int l=r.length;
      if (l == s.length) {
        if (l != 0) {
          for (int i=0; i < l; i++) {
            if (!r[i].equals(s[i])) {
              return false;
            }
          }
        }
        return true;
      }
      return false;
    }
}
