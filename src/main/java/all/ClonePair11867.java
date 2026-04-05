package all;

public class ClonePair11867 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String string,int n){
      int length=string.length();
      if (length <= n)   return string;
      int startIndex=length - n;
      return string.substring(startIndex);
    }
}
