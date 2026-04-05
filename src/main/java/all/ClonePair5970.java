package all;

public class ClonePair5970 {

    boolean method1(String i1,String i2){
      if (i1.length() != 0 && !i1.equals("none") && !i1.equals(i2))   return false;
      return true;
    }

    boolean method2(String arg,String p){
      if (p.endsWith(" "))   return arg.equals(p.substring(0,p.length() - 1)) || arg.startsWith(p);
      if (p.endsWith("$"))   return arg.equals(p.substring(0,p.length() - 1));
      return arg.startsWith(p);
    }
}
