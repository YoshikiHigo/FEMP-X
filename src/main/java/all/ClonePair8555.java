package all;

public class ClonePair8555 {

    String method1(String base,String what){
      if (base != null && base.endsWith(what)) {
        base=base.substring(0,base.length() - what.length());
      }
      return base;
    }

    String method2(String s,String value){
      if (s != null && s.startsWith(value)) {
        s=s.substring(value.length());
      }
      if (s != null && s.endsWith(value)) {
        s=s.substring(0,s.length() - value.length());
      }
      return s;
    }
}
