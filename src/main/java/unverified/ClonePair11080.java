package unverified;

public class ClonePair11080 {

    boolean method1(String[] tokens,String target){
      if (tokens != null) {
        for (int i=0; i < tokens.length; i++) {
          if (tokens[i] == null) {
            if (target == null) {
              return true;
            }
          }
     else {
            if (tokens[i].equals(target)) {
              return true;
            }
          }
        }
      }
      return false;
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
