package unverified;

public class ClonePair11742 {

    boolean method1(char character){
      boolean check=false;
      if (character >= '0' && character <= '9')   check=true;
     else   if (character >= 'A' && character <= 'Z')   check=true;
     else   if (character >= 'a' && character <= 'z')   check=true;
      return check;
    }

    boolean method2(char aChar){
      if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z')) && ((aChar < '0') || (aChar > '9'))) {
        return false;
      }
      return true;
    }
}
