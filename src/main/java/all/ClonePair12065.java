package all;

public class ClonePair12065 {

    boolean method1(char letra){
      if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char x){
      if ((x == 'a') || (x == 'e') || (x == 'i')|| (x == 'o')|| (x == 'u')) {
        return (true);
      }
     else   if ((x == 'A') || (x == 'E') || (x == 'I')|| (x == 'O')|| (x == 'U')) {
        return (true);
      }
     else {
        return (false);
      }
    }
}
