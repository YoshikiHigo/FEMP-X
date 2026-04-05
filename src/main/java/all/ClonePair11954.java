package all;

public class ClonePair11954 {

    boolean method1(char ch){
      if (ch > 0x20)   return false;
      return ch == 0x9 || ch == 0xA || ch == 0xD || ch == 0x20;
    }

    boolean method2(char c){
    switch (c) {
    case (' '):case ('\n'):case ('\t'):case ('\r'):    return true;
    default:  return false;
    }
    }
}
