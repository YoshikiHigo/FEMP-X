package unverified;

public class ClonePair11873 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String originStr,int length){
      String resultStr="";
      if (!originStr.equals("") && originStr.length() > length) {
        resultStr=originStr.substring(0,length);
      }
     else {
        resultStr=originStr;
      }
      return resultStr;
    }
}
