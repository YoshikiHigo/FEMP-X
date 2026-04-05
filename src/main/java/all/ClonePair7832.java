package all;

public class ClonePair7832 {

    boolean method1(String a,String b){
      a=a.toLowerCase();
      b=b.toLowerCase();
      if (a.equals(b))   return true;
      if (a.length() == 0 && b.length() > 0)   return false;
      if (b.length() == 0)   return true;
      return (!(a.charAt(0) == '.') && b.charAt(0) == '.' && a.endsWith(b));
    }

    boolean method2(String name,String ext){
      if (name.length() < ext.length())   return false;
      String actual=name.substring(name.length() - ext.length());
      return actual.equals(ext) || actual.equals(ext.toUpperCase());
    }
}
