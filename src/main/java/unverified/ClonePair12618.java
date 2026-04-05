package unverified;

public class ClonePair12618 {

    String method1(String text,int width){
      if (text.length() == width) {
        return text;
      }
     else   if (text.length() > width) {
        return text.substring(0,width);
      }
     else {
        StringBuffer padded=new StringBuffer(text);
        while (padded.length() < width) {
          padded.append(' ');
        }
        return padded.toString();
      }
    }

    String method2(String string_to_shorten,int number_characters){
      String copy=new String(string_to_shorten);
      if (string_to_shorten.length() < number_characters) {
        int difference=number_characters - string_to_shorten.length();
        for (int i=0; i < difference; i++)     copy+=" ";
        return copy;
      }
     else   if (string_to_shorten.length() > number_characters)   return string_to_shorten.substring(0,number_characters);
     else   return copy;
    }
}
