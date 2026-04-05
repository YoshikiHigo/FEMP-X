package all;

public class ClonePair12064 {

    boolean method1(char letra){
      if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char c){
      if ((Character.toLowerCase(c) == 'a') || (Character.toLowerCase(c) == 'e') || (Character.toLowerCase(c) == 'i')|| (Character.toLowerCase(c) == 'o')|| (Character.toLowerCase(c) == 'u'))   return true;
     else   return false;
    }
}
