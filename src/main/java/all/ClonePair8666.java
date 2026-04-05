package all;

public class ClonePair8666 {

    boolean method1(char ch){
      if ('a' <= ch && 'z' >= ch)   return true;
     else   if ('A' <= ch && 'Z' >= ch)   return true;
     else   if (':' == ch || '_' == ch)   return true;
     else   if (0xC0 <= ch && 0xD6 >= ch)   return true;
     else   if (0xD8 <= ch && 0xF6 >= ch)   return true;
     else   if (0xF8 <= ch && 0x2FF >= ch)   return true;
     else   if (0x370 <= ch && 0x37D >= ch)   return true;
     else   if (0x37F <= ch && 0x1FFF >= ch)   return true;
     else   if (0x200C <= ch && 0x200D >= ch)   return true;
     else   if (0x2070 <= ch && 0x218F >= ch)   return true;
     else   if (0x2C00 <= ch && 0x2FEF >= ch)   return true;
     else   if (0x3001 <= ch && 0xD7FF >= ch)   return true;
     else   if (0xF900 <= ch && 0xFDCF >= ch)   return true;
     else   if (0xFDF0 <= ch && 0xFFFD >= ch)   return true;
     else   if (0x10000 <= ch && 0xEFFFF >= ch)   return true;
     else   return false;
    }

    boolean method2(char x){
      boolean b=true;
    switch (x) {
    case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':case '0':    b=false;
      break;
    default:b=true;
    }
    return b;
    }
}
