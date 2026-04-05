package unverified;

public class ClonePair12139 {

    boolean method1(char c){
      if ((Character.toLowerCase(c) == 'a') || (Character.toLowerCase(c) == 'e') || (Character.toLowerCase(c) == 'i')|| (Character.toLowerCase(c) == 'o')|| (Character.toLowerCase(c) == 'u'))   return true;
     else   return false;
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
