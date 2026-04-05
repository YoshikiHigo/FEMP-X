package unverified;

public class ClonePair8820 {

    boolean method1(String str,String op){
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

    boolean method2(String str,String suffix){
      if (str.length() < suffix.length())   return false;
      String end=str.substring(str.length() - suffix.length(),str.length());
      return end.equalsIgnoreCase(suffix);
    }
}
