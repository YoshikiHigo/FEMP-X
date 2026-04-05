package all;

public class ClonePair8570 {

    String method1(String base,String what){
      if (base != null && base.endsWith(what)) {
        base=base.substring(0,base.length() - what.length());
      }
      return base;
    }

    String method2(String base,String what){
      if (base != null && base.startsWith(what)) {
        base=base.substring(what.length());
      }
      return base;
    }
}
