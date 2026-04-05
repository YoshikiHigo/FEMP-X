package all;

public class ClonePair10284 {

    boolean method1(char c){
      if ((c >= 'A') && (c <= 'Z')) {
        return true;
      }
      if ((c >= 'a') && (c <= 'z')) {
        return true;
      }
      if ((c == '_') || (c == ':')) {
        return true;
      }
      if ((c >= 0x00C0) && (c <= 0x00D6)) {
        return true;
      }
      if ((c >= 0x00D8) && (c <= 0x00F6)) {
        return true;
      }
      if ((c >= 0x00F8) && (c <= 0x02FF)) {
        return true;
      }
      if ((c >= 0x0370) && (c <= 0x037D)) {
        return true;
      }
      if ((c >= 0x037F) && (c <= 0x1FFF)) {
        return true;
      }
      if ((c >= 0x200C) && (c <= 0x200D)) {
        return true;
      }
      if ((c >= 0x2070) && (c <= 0x218F)) {
        return true;
      }
      if ((c >= 0x2C00) && (c <= 0x2FEF)) {
        return true;
      }
      if ((c >= 0x3001) && (c <= 0xD7FF)) {
        return true;
      }
      if ((c >= 0xF900) && (c <= 0xFDCF)) {
        return true;
      }
      if ((c >= 0xFDF0) && (c <= 0xFFFD)) {
        return true;
      }
      if ((c >= 0x10000) && (c <= 0xEFFFF)) {
        return true;
      }
      return false;
    }

    boolean method2(char x){
      boolean b=true;
    switch (x) {
    case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':case '0':    b=false;
      break;
    default:b=true;
    }
    return b;
    }
}
