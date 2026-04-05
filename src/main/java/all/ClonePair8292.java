package all;

public class ClonePair8292 {

    String method1(String string1,String string2){
      StringBuilder match=new StringBuilder();
      for (int i=0; i < string1.length(); i++) {
        if (string1.length() > i && string2.length() > i) {
          if (string1.charAt(i) == string2.charAt(i)) {
            match.append(string1.charAt(i));
          }
     else {
            break;
          }
        }
      }
      return match.toString();
    }

    String method2(String e1,String e2){
      StringBuffer re=new StringBuffer();
      int e1Index=e1.length() - 1;
      int e2Index=e2.length() - 1;
      while (e1Index >= 0 && e2Index >= 0) {
        if (e1.charAt(e1Index) == e2.charAt(e2Index)) {
          re.insert(0,e1.charAt(e1Index));
        }
     else     break;
        e1Index--;
        e2Index--;
      }
      return re.toString();
    }
}
