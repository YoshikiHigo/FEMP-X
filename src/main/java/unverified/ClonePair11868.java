package unverified;

public class ClonePair11868 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String str,int len){
      if (len > str.length()) {
        len=str.length();
      }
      return str.substring(0,len);
    }
}
