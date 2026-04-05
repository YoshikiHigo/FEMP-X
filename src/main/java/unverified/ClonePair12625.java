package unverified;

public class ClonePair12625 {

    String method1(String s1,String s2){
      int i, l1, l2;
      l1=s1.length();
      l2=s2.length();
      for (i=0; i < l1 && i < l2; i++) {
        if (s1.charAt(i) != s2.charAt(i))     break;
      }
      return (s1.substring(0,i));
    }

    String method2(String str1,String str2){
      int min=Math.min(str1.length(),str2.length());
      for (int i=0; i < min; i++) {
        if (str1.charAt(i) != str2.charAt(i)) {
          return str1.substring(0,i);
        }
      }
      return (str1.length() < str2.length()) ? str1 : str2;
    }
}
