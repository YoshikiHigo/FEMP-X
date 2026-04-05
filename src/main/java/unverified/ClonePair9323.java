package unverified;

public class ClonePair9323 {

    boolean method1(char c){
      if (('0' <= c && '9' >= c) || ('a' <= c && 'f' >= c) || ('A' <= c && 'F' >= c)) {
        return true;
      }
      return false;
    }

    boolean method2(char c){
      if (Character.isDigit(c)) {
        return true;
      }
    switch (c) {
    case 'a':case 'A':case 'b':case 'B':case 'c':case 'C':case 'd':case 'D':case 'e':case 'E':case 'f':case 'F':    return true;
    }
    return false;
    }
}
