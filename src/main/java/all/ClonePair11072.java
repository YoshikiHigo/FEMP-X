package all;

public class ClonePair11072 {

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

    boolean method2(String[] values,String key){
      if (values == null || key == null)   return false;
      boolean contain=false;
      for (int i=0; i < values.length; i++) {
        if (values[i].equals(key)) {
          contain=true;
          break;
        }
      }
      return contain;
    }
}
