package all;

public class ClonePair10921 {

    boolean method1(char c){
      if ((c == 0x09) || (c == 0x0a) || (c == 0x0d)|| (c == 0x22)|| (c == 0x27)|| (c == 0x5c)|| (c == 0x03)|| (c < 0x20)|| ((c > 0xd7ff) && (c < 0xe000))|| (c > 0xfffd)|| (c > 0xff)) {
        return (false);
      }
      return (true);
    }

    boolean method2(char c){
      if ('0' <= c && c <= '9') {
        return true;
      }
     else   if ('A' <= c && c <= 'Z') {
        return true;
      }
     else   if ('a' <= c && c <= 'z') {
        return true;
      }
     else   if (192 <= c && c <= 255) {
        return true;
      }
     else   if (c == '.' || c == '-' || c == '_' || c == ' ') {
        return true;
      }
      return false;
    }
}
