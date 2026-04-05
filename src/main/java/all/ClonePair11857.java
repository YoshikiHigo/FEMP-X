package all;

public class ClonePair11857 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String cad,int length){
      if (cad != null & cad.length() <= length) {
        return cad.substring(0,cad.length());
      }
     else   if (cad != null) {
        return cad.substring(0,length);
      }
     else {
        return "";
      }
    }
}
