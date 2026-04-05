package all;

public class ClonePair8943 {

    boolean method1(char c){
      int type;
      boolean retv;
      retv=false;
      type=Character.getType(c);
    switch (type) {
    case Character.COMBINING_SPACING_MARK:case Character.CONNECTOR_PUNCTUATION:case Character.CURRENCY_SYMBOL:case Character.DASH_PUNCTUATION:case Character.DECIMAL_DIGIT_NUMBER:case Character.ENCLOSING_MARK:case Character.END_PUNCTUATION:case Character.LOWERCASE_LETTER:case Character.MATH_SYMBOL:case Character.MODIFIER_SYMBOL:case Character.NON_SPACING_MARK:case Character.OTHER_LETTER:case Character.OTHER_PUNCTUATION:case Character.OTHER_SYMBOL:case Character.SPACE_SEPARATOR:case Character.START_PUNCTUATION:case Character.TITLECASE_LETTER:case Character.UPPERCASE_LETTER:    retv=true;
    }
    return retv;
    }

    boolean method2(char c){
    switch (Character.getType(c)) {
    case Character.LOWERCASE_LETTER:case Character.UPPERCASE_LETTER:case Character.DECIMAL_DIGIT_NUMBER:case Character.SPACE_SEPARATOR:case Character.CONNECTOR_PUNCTUATION:case Character.DASH_PUNCTUATION:case Character.START_PUNCTUATION:case Character.END_PUNCTUATION:case Character.OTHER_PUNCTUATION:case Character.MATH_SYMBOL:case Character.CURRENCY_SYMBOL:case Character.MODIFIER_SYMBOL:case Character.OTHER_SYMBOL:case Character.OTHER_LETTER:case Character.TITLECASE_LETTER:case Character.NON_SPACING_MARK:case Character.COMBINING_SPACING_MARK:case Character.ENCLOSING_MARK:    return true;
    default:  return false;
    }
    }
}
