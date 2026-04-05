package all;

public class ClonePair7005 {

    boolean method1(CharSequence charSequence,char character){
      if (charSequence == null)   return false;
      if (charSequence.length() == 0)   return false;
      return charSequence.charAt(charSequence.length() - 1) == character;
    }

    boolean method2(CharSequence charSequence,char character){
      if (charSequence == null)   return false;
      if (charSequence.length() == 0)   return false;
      return charSequence.charAt(0) == character;
    }
}
