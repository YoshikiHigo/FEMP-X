package all;

import java.util.*;

public class ClonePair7442 {

    String method1(String csIn,int nRequiredLength,char cFill){
      String csOut=new String();
      int nLgStringIn=csIn.length();
      int nNbcharToPad=nRequiredLength - nLgStringIn;
      if (nNbcharToPad > 0) {
        csOut=csIn;
        for (int n=0; n < nNbcharToPad; n++) {
          csOut=csOut + cFill;
        }
      }
     else {
        csOut=csIn.substring(0,nRequiredLength);
      }
      return csOut;
    }

    String method2(String _s,int _size,char _character){
      if (_s.length() == _size)   return _s;
      if (_s.length() > _size)   return _s.substring(_s.length() - _size);
      char[] spaces=new char[_size - _s.length()];
      Arrays.fill(spaces,_character);
      return new String(spaces).concat(_s);
    }
}
