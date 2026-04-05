package unverified;

public class ClonePair11872 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String str,int n){
      if (str.length() < n)   return str;
     else   return str.substring(0,n);
    }
}
