package all;

public class ClonePair9582 {

    boolean method1(char[] str1,char[] str2){
      if (str1 == str2)   return true;
      if (str1.length != str2.length)   return false;
      for (int i=0; i < str1.length; ++i)   if (str1[i] != str2[i])   return false;
      return true;
    }

    boolean method2(char[] p1,char[] p2){
      boolean bMatch=true;
      if (p1.length == p2.length) {
        for (int i=0; i < p1.length; i++) {
          if (p1[i] != p2[i]) {
            bMatch=false;
            break;
          }
        }
      }
     else {
        bMatch=false;
      }
      return bMatch;
    }
}
