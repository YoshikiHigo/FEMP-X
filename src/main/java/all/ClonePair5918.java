package all;

public class ClonePair5918 {

    boolean method1(String a,String b){
      for (int i=0; i < a.length(); i++) {
        if ((a.charAt(i) != 'X') & (a.charAt(i) != b.charAt(i)))     return false;
      }
      return true;
    }

    boolean method2(String str1,String str2){
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
}
