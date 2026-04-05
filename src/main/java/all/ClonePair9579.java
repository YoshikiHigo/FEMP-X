package all;

public class ClonePair9579 {

    boolean method1(char[] str1,char[] str2){
      if (str1 == str2)   return true;
      if (str1.length != str2.length)   return false;
      for (int i=0; i < str1.length; ++i)   if (str1[i] != str2[i])   return false;
      return true;
    }

    boolean method2(char[] src,char[] des){
      if (src.length != des.length)   return false;
      for (int i=src.length - 1; i >= 0; i--) {
        if (src[i] != des[i])     return false;
      }
      return true;
    }
}
