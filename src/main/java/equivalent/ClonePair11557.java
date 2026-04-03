package equivalent;

public class ClonePair11557 {
    String method1(String source, String target, String replacement) {
        if (source == null) {
            return source;
        }
        String retvalue = source;
        int index = 0;
        int previousIndex = 0;
        if (source.indexOf(target) > -1) {
            StringBuffer hold = new StringBuffer();
            while (true) {
                index = source.indexOf(target, previousIndex);
                if (index < 0) {
                    hold.append(source.substring(previousIndex));
                    break;
                }
                hold.append(source, previousIndex, index);
                hold.append(replacement);
                previousIndex = index + target.length();
            }
            retvalue = hold.toString();
        }
        return retvalue;
    }

    String method2(String source, String findToken, String replaceToken) {
        if (source == null) {
            return null;
        }
        StringBuilder sb = null;
        int pos;
        do {
            if ((pos = source.indexOf(findToken)) < 0) {
                break;
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            if (pos > 0) {
                sb.append(source, 0, pos);
            }
            sb.append(replaceToken);
            source = source.substring(pos + findToken.length());
        }
        while (source.length() > 0);
        if (sb == null) {
            return source;
        } else {
            sb.append(source);
            return sb.toString();
        }
    }
}
