package all;

public class ClonePair9580 {

    boolean method1(char[] str1,char[] str2){
      if (str1 == str2)   return true;
      if (str1.length != str2.length)   return false;
      for (int i=0; i < str1.length; ++i)   if (str1[i] != str2[i])   return false;
      return true;
    }

    boolean method2(char[] a,char[] b){
      int l_a=a.length;
      int l_b=b.length;
      if (l_a != l_b) {
        return false;
      }
      for (int i=0; i < l_a; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
