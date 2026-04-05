package all;

public class ClonePair13611 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
      if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
      if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      return 0;
    }

    int method2(char b){
      if ((b >= '0') && (b <= '9'))   return (b - '0');
      if ((b >= 'a') && (b <= 'f'))   return (b - 'a' + 10);
      if ((b >= 'A') && (b <= 'F'))   return (b - 'A' + 10);
      return 0;
    }
}
