package unverified;

public class ClonePair4089 {

    boolean method1(String[] s1,String[] s2){
      if (s1.length != s2.length) {
        return false;
      }
     else {
        for (int i=0; i < s1.length; i++) {
          if (!(s1[i].equalsIgnoreCase(s2[i]))) {
            return false;
          }
        }
      }
      return true;
    }

    boolean method2(String[] termos1,String[] termos2){
      if (termos1.length != termos2.length) {
        return false;
      }
      for (int i=0; i < termos1.length; i++) {
        if (!termos1[i].equals(termos2[i])) {
          return false;
        }
      }
      return true;
    }
}
