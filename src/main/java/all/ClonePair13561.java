package all;

public class ClonePair13561 {

    int method1(char c){
      if (c >= 'A' && c <= 'Z') {
        return c - 65;
      }
      if (c >= 'a' && c <= 'z') {
        return (c - 97) + 26;
      }
      if (c >= '0' && c <= '9') {
        return (c - 48) + 52;
      }
      if (c == '+') {
        return 62;
      }
      if (c == '/') {
        return 63;
      }
      return c != '=' ? -1 : 0;
    }

    int method2(char c){
      if ((c >= 'A') && (c <= 'Z')) {
        return c - 'A';
      }
      if ((c >= 'a') && (c <= 'z')) {
        return c - 'a' + 26;
      }
      if ((c >= '0') && (c <= '9')) {
        return c - '0' + 52;
      }
      if (c == '+') {
        return 62;
      }
      if (c == '/') {
        return 63;
      }
      if (c == '=') {
        return 0;
      }
      return -1;
    }
}
