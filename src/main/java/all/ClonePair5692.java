package all;

public class ClonePair5692 {

    boolean method1(String stringToSearchIn,String stringToSearchFor,boolean ignoreCase){
      if (ignoreCase) {
        return (stringToSearchIn.toLowerCase().indexOf(stringToSearchFor.toLowerCase()) >= 0);
      }
     else {
        return (stringToSearchIn.indexOf(stringToSearchFor) >= 0);
      }
    }

    boolean method2(String value,String search,boolean matchCase){
      if (matchCase) {
        return value.indexOf(search) != -1;
      }
      return value.toLowerCase().indexOf(search.toLowerCase()) != -1;
    }
}
