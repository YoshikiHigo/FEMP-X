package unverified;

public class ClonePair11945 {

    boolean method1(char ch){
      if (ch > 0x20)   return false;
      return ch == 0x9 || ch == 0xA || ch == 0xD || ch == 0x20;
    }

    boolean method2(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }
}
