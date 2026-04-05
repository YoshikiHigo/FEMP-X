package unverified;

public class ClonePair11862 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String string,int length){
      if (string.length() > length)   return string.substring(0,length);
     else   return string;
    }
}
