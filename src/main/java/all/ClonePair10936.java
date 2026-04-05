package all;

public class ClonePair10936 {

    boolean method1(char c1,char c2,boolean ignCase){
      if (ignCase)   return Character.toLowerCase(c1) == Character.toLowerCase(c2);
      return c1 == c2;
    }

    boolean method2(char c1,char c2,boolean bCaseSensitive){
      if (bCaseSensitive)   return c1 == c2;
      return Character.toUpperCase(c1) == Character.toUpperCase(c2);
    }
}
