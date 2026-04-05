package all;

public class ClonePair9615 {

    int method1(int c){
      if (c >= '0' && c <= '9')   return (c - '0');
     else   if (c >= 'A' && c <= 'F')   return (c - 'A' + 10);
     else   if (c >= 'a' && c <= 'f')   return (c - 'a' + 10);
     else   return -1;
    }

    int method2(int v){
      if (v >= '0' && v <= '9')   return v - '0';
      if (v >= 'A' && v <= 'F')   return v - 'A' + 10;
      if (v >= 'a' && v <= 'f')   return v - 'a' + 10;
      return -1;
    }
}
