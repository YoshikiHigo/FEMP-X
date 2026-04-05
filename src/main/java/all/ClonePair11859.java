package all;

public class ClonePair11859 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String str,int maxChars){
      int len=str.length();
      if (len > maxChars) {
        return str.substring(len - maxChars,len);
      }
     else {
        return str;
      }
    }
}
