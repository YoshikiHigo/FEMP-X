package all;

public class ClonePair10937 {

    boolean method1(char ch1,char ch2,boolean ignoreCase){
      if (ignoreCase)   return Character.toUpperCase(ch1) == Character.toUpperCase(ch2);
     else   return ch1 == ch2;
    }

    boolean method2(char c1,char c2,boolean bCaseSensitive){
      if (bCaseSensitive)   return c1 == c2;
      return Character.toUpperCase(c1) == Character.toUpperCase(c2);
    }
}
