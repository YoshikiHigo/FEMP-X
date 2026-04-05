package all;

public class ClonePair8560 {

    String method1(String base,String what){
      if (base != null && base.endsWith(what)) {
        base=base.substring(0,base.length() - what.length());
      }
      return base;
    }

    String method2(String str,String trimStr){
      if (str == null || str.length() == 0)   return str;
      for (str=str.trim(); str.startsWith(trimStr); str=str.substring(trimStr.length()).trim())   ;
      for (; str.endsWith(trimStr); str=str.substring(0,str.length() - trimStr.length()).trim())   ;
      return str;
    }
}
