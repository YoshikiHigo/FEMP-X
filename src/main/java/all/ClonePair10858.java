package all;

public class ClonePair10858 {

    boolean method1(char c){
      if (('\t' == c) || ('\n' == c) || ('\r' == c)|| (' ' == c))   return true;
      return false;
    }

    boolean method2(char c){
    switch (c) {
    case 0x20:case 0x09:case 0x0a:case 0x0d:    return true;
    default:  return false;
    }
    }
}
