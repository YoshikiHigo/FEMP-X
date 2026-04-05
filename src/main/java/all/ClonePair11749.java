package all;

public class ClonePair11749 {

    boolean method1(char character){
      boolean check=false;
      if (character >= '0' && character <= '9')   check=true;
     else   if (character >= 'A' && character <= 'Z')   check=true;
     else   if (character >= 'a' && character <= 'z')   check=true;
      return check;
    }

    boolean method2(char b){
      if ((b >= 'a') && (b <= 'z'))   return true;
      if ((b >= 'A') && (b <= 'Z'))   return true;
      if ((b >= '0') && (b <= '9'))   return true;
      return false;
    }
}
