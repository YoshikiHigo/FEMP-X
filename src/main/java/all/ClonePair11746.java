package all;

public class ClonePair11746 {

    boolean method1(char character){
      boolean check=false;
      if (character >= '0' && character <= '9')   check=true;
     else   if (character >= 'A' && character <= 'Z')   check=true;
     else   if (character >= 'a' && character <= 'z')   check=true;
      return check;
    }

    boolean method2(char ch){
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
        return true;
      }
      return false;
    }
}
