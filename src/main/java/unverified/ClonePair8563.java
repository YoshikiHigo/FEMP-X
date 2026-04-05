package unverified;

public class ClonePair8563 {

    String method1(String base,String what){
      if (base != null && base.endsWith(what)) {
        base=base.substring(0,base.length() - what.length());
      }
      return base;
    }

    String method2(String s,String tail){
      if (s != null && s.endsWith(tail)) {
        return s.substring(0,s.length() - tail.length());
      }
     else {
        return s;
      }
    }
}
