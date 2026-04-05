package all;

public class ClonePair3724 {

    boolean method1(String name,String end){
      if (name.equalsIgnoreCase(end)) {
        return true;
      }
      int colon=name.lastIndexOf(":");
      if (colon >= 0) {
        String local=name.substring(colon + 1);
        return local.equalsIgnoreCase(end);
      }
      return false;
    }

    boolean method2(String day,String end){
      if (end.equals(""))   return true;
      if (day.compareToIgnoreCase(end) == 0)   return true;
      return false;
    }
}
