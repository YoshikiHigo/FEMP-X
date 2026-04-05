package all;

public class ClonePair12128 {

    boolean method1(char c){
      if ((c == 'a') || (c == 'e') || (c == 'i')|| (c == 'o')|| (c == 'u')) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char c){
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�' || c == '�')   return true;
      return false;
    }
}
