package all;

public class ClonePair8665 {

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

    boolean method2(char c){
      if ((c >= 'A') && (c <= 'Z')) {
        return true;
      }
      if ((c >= 'a') && (c <= 'z')) {
        return true;
      }
      if ((c == '_') || (c == ':')) {
        return true;
      }
      if ((c >= 0x00C0) && (c <= 0x00D6)) {
        return true;
      }
      if ((c >= 0x00D8) && (c <= 0x00F6)) {
        return true;
      }
      if ((c >= 0x00F8) && (c <= 0x02FF)) {
        return true;
      }
      if ((c >= 0x0370) && (c <= 0x037D)) {
        return true;
      }
      if ((c >= 0x037F) && (c <= 0x1FFF)) {
        return true;
      }
      if ((c >= 0x200C) && (c <= 0x200D)) {
        return true;
      }
      if ((c >= 0x2070) && (c <= 0x218F)) {
        return true;
      }
      if ((c >= 0x2C00) && (c <= 0x2FEF)) {
        return true;
      }
      if ((c >= 0x3001) && (c <= 0xD7FF)) {
        return true;
      }
      if ((c >= 0xF900) && (c <= 0xFDCF)) {
        return true;
      }
      if ((c >= 0xFDF0) && (c <= 0xFFFD)) {
        return true;
      }
      if ((c >= 0x10000) && (c <= 0xEFFFF)) {
        return true;
      }
      return false;
    }
}
