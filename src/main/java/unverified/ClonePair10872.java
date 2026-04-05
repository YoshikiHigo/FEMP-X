package unverified;

public class ClonePair10872 {

    boolean method1(char c){
    switch (c) {
    case '0':case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':case 'a':case 'A':case 'b':case 'B':case 'c':case 'C':case 'd':case 'D':case 'e':case 'E':case 'f':case 'F':    return true;
    default:  return false;
    }
    }

    boolean method2(char ch){
      if (ch >= '0' && ch <= '9') {
        return true;
      }
     else   if (ch >= 'a' && ch <= 'f') {
        return true;
      }
     else   if (ch >= 'A' && ch <= 'F') {
        return true;
      }
      return false;
    }
}
