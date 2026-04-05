package all;

public class ClonePair11964 {

    boolean method1(char c){
      if (!Character.isLetter(c))   return false;
      return ((c == 'e') || (c == 'y') || (c == 'u')|| (c == 'i')|| (c == 'o')|| (c == 'a')|| (c == '�')|| (c == '�')|| (c == '�'));
    }

    boolean method2(char input){
      if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'y') {
        return true;
      }
      return false;
    }
}
