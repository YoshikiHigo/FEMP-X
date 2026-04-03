package equivalent;

public class ClonePair8859 {
    String method1(String name, String in) {
        if (in.indexOf("\\") != -1) {
            StringBuffer out = new StringBuffer();
            out.append("'");
            boolean needLike = false;
            boolean needEscape = false;
            boolean lastWasEscape = false;
            for (int i = 0; i < in.length(); i++) {
                char c = in.charAt(i);
                if (!lastWasEscape && c == '\\') {
                    lastWasEscape = true;
                } else {
                    char nextChar = '!';
                    boolean useNextChar = false;
                    if (!lastWasEscape) {
                        if (c == '?') {
                            out.append('_');
                            needLike = true;
                        } else if (c == '*') {
                            out.append('%');
                            needLike = true;
                        } else {
                            nextChar = c;
                            useNextChar = true;
                        }
                    } else {
                        nextChar = c;
                        useNextChar = true;
                    }
                    if (useNextChar) {
                        if (nextChar == '\"') {
                            out.append("\\\"");
                            needEscape = true;
                        } else if (nextChar == '\'') {
                            out.append("\\'");
                            needEscape = true;
                        } else if (nextChar == '%') {
                            out.append("\\%");
                            needEscape = true;
                        } else if (nextChar == '_') {
                            out.append("\\_");
                            needEscape = true;
                        } else {
                            out.append(nextChar);
                        }
                    }
                    lastWasEscape = false;
                }
            }
            out.append("'");
            if (needLike) {
                out.insert(0, " LIKE ");
            } else {
                out.insert(0, " = ");
            }
            out.insert(0, name);
            if (needEscape) {
                out.insert(0, ' ');
            }
            return out.toString();
        } else {
            StringBuffer out = new StringBuffer();
            out.append("'");
            boolean needLike = false;
            boolean needEscape = false;
            for (int i = 0; i < in.length(); i++) {
                char c = in.charAt(i);
                if (c == '?') {
                    out.append('_');
                    needLike = true;
                } else if (c == '*') {
                    out.append('%');
                    needLike = true;
                } else if (c == '\"') {
                    out.append("\\\"");
                    needEscape = true;
                } else if (c == '\'') {
                    out.append("\\'");
                    needEscape = true;
                } else if (c == '%') {
                    out.append("\\%");
                    needEscape = true;
                } else if (c == '_') {
                    out.append("\\_");
                    needEscape = true;
                } else {
                    out.append(c);
                }
            }
            out.append("'");
            if (needLike) {
                out.insert(0, " LIKE ");
            } else {
                out.insert(0, " = ");
            }
            out.insert(0, name);
            if (needEscape) {
                out.insert(0, ' ');
            }
            return out.toString();
        }
    }

    String method2(String name, String in) {
        if (in.indexOf("\\") != -1) {
            StringBuffer out = new StringBuffer();
            out.append("'");
            boolean needLike = false;
            boolean needEscape = false;
            boolean lastWasEscape = false;
            for (int i = 0; i < in.length(); i++) {
                char c = in.charAt(i);
                if ((!lastWasEscape) && (c == '\\')) {
                    lastWasEscape = true;
                } else {
                    char nextChar = '!';
                    boolean useNextChar = false;
                    if (!lastWasEscape) {
                        if (c == '?') {
                            out.append('_');
                            needLike = true;
                        } else if (c == '*') {
                            out.append('%');
                            needLike = true;
                        } else {
                            nextChar = c;
                            useNextChar = true;
                        }
                    } else {
                        nextChar = c;
                        useNextChar = true;
                    }
                    if (useNextChar) {
                        if (nextChar == '\"') {
                            out.append("\\\"");
                            needEscape = true;
                        } else if (nextChar == '\'') {
                            out.append("\\'");
                            needEscape = true;
                        } else if (nextChar == '%') {
                            out.append("\\%");
                            needEscape = true;
                        } else if (nextChar == '_') {
                            out.append("\\_");
                            needEscape = true;
                        } else {
                            out.append(nextChar);
                        }
                    }
                    lastWasEscape = false;
                }
            }
            out.append("'");
            if (needLike) {
                out.insert(0, " LIKE ");
            } else {
                out.insert(0, " = ");
            }
            out.insert(0, name);
            if (needEscape) {
                out.insert(0, ' ');
            }
            return out.toString();
        } else {
            StringBuffer out = new StringBuffer();
            out.append("'");
            boolean needLike = false;
            boolean needEscape = false;
            for (int i = 0; i < in.length(); i++) {
                char c = in.charAt(i);
                if (c == '?') {
                    out.append('_');
                    needLike = true;
                } else if (c == '*') {
                    out.append('%');
                    needLike = true;
                } else if (c == '\"') {
                    out.append("\\\"");
                    needEscape = true;
                } else if (c == '\'') {
                    out.append("\\'");
                    needEscape = true;
                } else if (c == '%') {
                    out.append("\\%");
                    needEscape = true;
                } else if (c == '_') {
                    out.append("\\_");
                    needEscape = true;
                } else {
                    out.append(c);
                }
            }
            out.append("'");
            if (needLike) {
                out.insert(0, " LIKE ");
            } else {
                out.insert(0, " = ");
            }
            out.insert(0, name);
            if (needEscape) {
                out.insert(0, ' ');
            }
            return out.toString();
        }
    }
}
