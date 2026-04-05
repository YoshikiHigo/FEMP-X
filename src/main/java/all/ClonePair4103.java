package all;

public class ClonePair4103 {

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

    boolean method2(String[] strings1,String[] strings2){
      if (strings1.length != strings2.length)   return false;
      for (int i=0; i < strings1.length; ++i)   if (!strings1[i].equals(strings2[i]))   return false;
      return true;
    }
}
