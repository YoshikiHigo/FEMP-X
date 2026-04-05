package all;

public class ClonePair10968 {

    byte method1(char value){
      if (value >= 'a') {
        return (byte)(value - 'a' + 10);
      }
     else   if (value > '9') {
        return (byte)(value - 'A' + 10);
      }
     else {
        return (byte)(value - '0');
      }
    }

    byte method2(char value){
      if (value >= 'a')   return (byte)(value - 'a' + 10);
     else   if (value > '9')   return (byte)(value - 'A' + 10);
     else   return (byte)(value - '0');
    }
}
