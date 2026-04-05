package unverified;

public class ClonePair11045 {

    boolean method1(String[] strings,String target){
      boolean contains=false;
      if ((strings != null) && (strings.length > 0)) {
        for (int i=0; i < strings.length; i++) {
          if (strings[i] != null) {
            if (strings[i].equals(target)) {
              contains=true;
              break;
            }
          }
     else {
            if (target == null) {
              contains=true;
              break;
            }
          }
        }
      }
      return contains;
    }

    boolean method2(String[] a_tab,String a_value){
      if (a_tab == null) {
        return false;
      }
      int len=a_tab.length;
      if (a_value == null) {
        for (int i=0; i < len; i++) {
          if (a_tab[i] == null) {
            return true;
          }
        }
      }
     else {
        for (int i=0; i < len; i++) {
          if (a_value.equals(a_tab[i])) {
            return true;
          }
        }
      }
      return false;
    }
}
