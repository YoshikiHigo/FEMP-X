package all;

public class ClonePair6835 {

    boolean method1(String pattern,String key){
      if (key.length() < pattern.length())   return false;
      for (int i=0; i < pattern.length(); i++) {
        char format=pattern.charAt(i);
        char ch=key.charAt(i);
        if (!((format == '#' && Character.isDigit(ch)) || (format == ch))) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String arg,String p){
      if (p.endsWith(" "))   return arg.equals(p.substring(0,p.length() - 1)) || arg.startsWith(p);
      if (p.endsWith("$"))   return arg.equals(p.substring(0,p.length() - 1));
      return arg.startsWith(p);
    }
}
