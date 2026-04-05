package unverified;

public class ClonePair8039 {

    int method1(String[] src,String search){
      if (search == null || src == null)   return -1;
      for (int i=0; i < src.length; i++) {
        if (src[i] != null && src[i].compareTo(search) == 0)     return i;
      }
      return -1;
    }

    int method2(String[] leadNames,String leadName){
      if (leadNames != null && leadName != null) {
        String upperCaseLeadName=leadName.toUpperCase();
        for (int i=0; i < leadNames.length; ++i) {
          if (leadNames[i] != null && leadNames[i].toUpperCase().equals(upperCaseLeadName)) {
            return i;
          }
        }
      }
      return -1;
    }
}
