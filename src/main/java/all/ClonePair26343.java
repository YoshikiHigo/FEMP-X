package all;

public class ClonePair26343 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char a){
      if ((a >= '0') && (a <= '9'))   return ((int)a) - ((int)('0'));
     else   if ((a >= 'A') && (a <= 'F'))   return ((int)a) - ((int)('A')) + 10;
     else   if ((a >= 'a') && (a <= 'f'))   return ((int)a) - ((int)('a')) + 10;
     else   return -1;
    }
}
