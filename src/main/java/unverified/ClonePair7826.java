package unverified;

public class ClonePair7826 {

    boolean method1(String a,String b){
      a=a.toLowerCase();
      b=b.toLowerCase();
      if (a.equals(b))   return true;
      if (a.length() == 0 && b.length() > 0)   return false;
      if (b.length() == 0)   return true;
      return (!(a.charAt(0) == '.') && b.charAt(0) == '.' && a.endsWith(b));
    }

    boolean method2(String str,String suffix){
      if (str.length() < suffix.length())   return false;
      String end=str.substring(str.length() - suffix.length(),str.length());
      return end.equalsIgnoreCase(suffix);
    }
}
