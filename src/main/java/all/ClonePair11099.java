package all;

public class ClonePair11099 {

    boolean method1(String[] array,String string){
      for (int i=0; array != null && string != null && i < array.length; i++) {
        if (array[i].equals(string)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String[] fileList,String f){
      if (fileList == null)   return false;
      if (f == null)   return false;
      for (int i=0; i < fileList.length; i++) {
        if (fileList[i].equals(f)) {
          return true;
        }
      }
      return false;
    }
}
