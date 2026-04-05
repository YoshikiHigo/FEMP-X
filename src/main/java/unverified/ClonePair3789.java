package unverified;

public class ClonePair3789 {

    boolean method1(String prefix,String string){
      int index1=0;
      int index2=0;
      int length1=prefix.length();
      int length2=string.length();
      char ch1=' ';
      char ch2=' ';
      while (index1 < length1 && index2 < length2) {
        while (index1 < length1 && Character.isWhitespace(ch1=prefix.charAt(index1))) {
          index1++;
        }
        while (index2 < length2 && Character.isWhitespace(ch2=string.charAt(index2))) {
          index2++;
        }
        if (index1 == length1 && index2 == length2) {
          return true;
        }
        if (ch1 != ch2) {
          return false;
        }
        index1++;
        index2++;
      }
      if (index1 < length1 && index2 >= length2)   return false;
      return true;
    }

    boolean method2(String a,String b){
      if (a == b) {
        return true;
      }
      if (a.length() != b.length())   return false;
      int n=a.length();
      if (n == b.length()) {
        for (int i=n - 1; i >= 0; i--) {
          if (a.charAt(i) != b.charAt(i)) {
            return false;
          }
        }
      }
      return true;
    }
}
