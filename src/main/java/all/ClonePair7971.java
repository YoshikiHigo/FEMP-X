package all;

public class ClonePair7971 {

    boolean method1(String extName,String extString){
      if (extName == null || extString == null) {
        return (false);
      }
      if ((extString.indexOf(extName + " ") >= 0) || extString.endsWith(extName) || extString.equals(extName)) {
        return true;
      }
      return false;
    }

    boolean method2(String cadena,String b){
      if (cadena == null || b == null) {
        return false;
      }
      cadena=new String(cadena.toUpperCase());
      b=new String(b.toUpperCase());
      if (cadena.length() <= b.length()) {
        for (int i=0; i <= b.length() - cadena.length(); i++) {
          if (cadena.equals(b.substring(i,i + cadena.length()))) {
            return true;
          }
        }
      }
      return false;
    }
}
