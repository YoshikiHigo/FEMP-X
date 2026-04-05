package all;

public class ClonePair8327 {

    boolean method1(String full,String part){
      if (part.length() < 1 || full.equals(part)) {
        return true;
      }
      int length=full.indexOf("?");
      if (length == -1) {
        length=full.length();
      }
      for (int i=0; i < length - part.length(); i++) {
        if (full.substring(i,i + part.length()).equals(part)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String str,String op){
      if (str.length() >= op.length()) {
        for (int i=0; i <= str.length() - op.length(); i++) {
          if (i == (str.length() - op.length())) {
            if (str.substring(i).equals(op))         return true;
          }
     else       if (str.substring(i,op.length() + i).equals(op))       return true;
        }
      }
      return false;
    }
}
