package all;

public class ClonePair10679 {

    int method1(String str1,String str2){
      int i;
      for (i=0; i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i); ++i) {
      }
      return i;
    }

    int method2(String str1,String str2){
      int i;
      for (i=0; i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i); i++)   ;
      return i;
    }
}
