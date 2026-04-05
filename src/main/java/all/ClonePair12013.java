package all;

public class ClonePair12013 {

    boolean method1(char c){
    switch (c) {
    case 0x20:case 0x09:case 0x0a:case 0x0d:    return true;
    default:  return false;
    }
    }

    boolean method2(char c){
      if (c == ' ' || c == '	' || c == '\r' || c == '\n')   return true;
     else   return false;
    }
}
