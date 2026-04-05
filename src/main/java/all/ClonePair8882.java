package all;

public class ClonePair8882 {

    boolean method1(char c){
    switch (c) {
    case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }

    boolean method2(char ch){
      if (ch >= 0x20)   return false;
      return ch == 0x9 || ch == 0xA || ch == 0xD;
    }
}
