package all;

public class ClonePair38324 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char c){
      int result=-1;
      if ((c >= '0') && (c <= '9'))   result=(c - '0');
     else {
        if ((c >= 'a') && (c <= 'f'))     result=(c - 'a') + 10;
     else {
          if ((c >= 'A') && (c <= 'F'))       result=(c - 'A') + 10;
        }
      }
      return result;
    }
}
