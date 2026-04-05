package unverified;

public class ClonePair11076 {

    boolean method1(String[] values,String key){
      if (values == null || key == null) {
        return false;
      }
      boolean contain=false;
      for (int i=0; i < values.length; i++) {
        if (values[i].equals(key)) {
          contain=true;
          break;
        }
      }
      return contain;
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
