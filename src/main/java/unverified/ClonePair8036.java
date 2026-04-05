package unverified;

public class ClonePair8036 {

    int method1(String[] array,String element){
      if (array == null || element == null) {
        return -1;
      }
      for (int i=0; i < array.length; i++) {
        if (element.equals(array[i])) {
          return i;
        }
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
