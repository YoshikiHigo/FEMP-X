package all;

public class ClonePair11392 {

    boolean method1(char character){
      boolean check=false;
      if (character >= 'A' && character <= 'Z')   check=true;
     else   if (character >= 'a' && character <= 'z')   check=true;
      return check;
    }

    boolean method2(char letra){
      if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z')) {
        return true;
      }
     else {
        return false;
      }
    }
}
