package unverified;

public class ClonePair11115 {

    String method1(String str,String oldVal,String newVal){
      String res=str;
      if (str.length() > 0) {
        int pos=str.indexOf(oldVal);
        if (pos >= 0) {
          res=str.substring(0,pos);
          res=res.concat(newVal);
          res=res.concat(str.substring(pos + oldVal.length()));
          return res;
        }
      }
      return res;
    }

    String method2(String str,String regex,String replacement){
      int found=0;
      int start=0;
      int len=regex.length();
      if (str == "")   return "";
      while ((found=str.indexOf(regex,found)) != -1) {
        if (found + len >= str.length()) {
          return str.substring(0,found) + replacement;
        }
     else {
          str=str.substring(0,found) + replacement + str.substring(found + len);
        }
        found+=len;
      }
      return str;
    }
}
