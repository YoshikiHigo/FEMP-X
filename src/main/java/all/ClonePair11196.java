package all;

public class ClonePair11196 {

    boolean method1(char c){
      if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char character){
      boolean check=false;
      if (character >= '0' && character <= '9')   check=true;
     else   if (character >= 'A' && character <= 'Z')   check=true;
     else   if (character >= 'a' && character <= 'z')   check=true;
      return check;
    }
}
