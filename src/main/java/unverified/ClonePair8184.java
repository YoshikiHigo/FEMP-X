package unverified;

public class ClonePair8184 {

    boolean method1(String i1,String i2){
      if (i1.length() != 0 && !i1.equals("none") && !i1.equals(i2)) {
        return false;
      }
      return true;
    }

    boolean method2(String sub,String sup){
      int i=0;
      while (i + sub.length() - 1 < sup.length()) {
        int j;
        for (j=0; j < sub.length(); j++) {
          if (sub.charAt(j) != sup.charAt(i + j)) {
            break;
          }
        }
        if (j == sub.length()) {
          if ((i + j) < sup.length()) {
            if (sup.charAt(i + j) == ' ') {
              return true;
            }
     else {
              return false;
            }
          }
     else {
            return true;
          }
        }
        do {
          i++;
        }
     while ((i < sup.length()) && (sup.charAt(i) != ' '));
        i++;
      }
      return false;
    }
}
