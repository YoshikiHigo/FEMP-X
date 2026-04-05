package unverified;

public class ClonePair8158 {

    boolean method1(String str1,String str2){
      boolean ret=false;
      for (int i=0; i < str1.length(); i++) {
        if (str1.charAt(i) == str2.charAt(0)) {
          if (i + str2.length() <= str1.length()) {
            if (str2.equals(str1.substring(i,i + str2.length()))) {
              ret=true;
              break;
            }
          }
        }
      }
      return ret;
    }

    boolean method2(String o,String e){
      for (int i=0; i < o.length(); i++)   if ((o.charAt(i) != e.charAt(i)) && (e.charAt(i) != 'X'))   return false;
      return true;
    }
}
