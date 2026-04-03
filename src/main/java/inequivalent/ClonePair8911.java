package inequivalent;

import java.util.HashMap;
import java.util.Iterator;

public class ClonePair8911 {

    String method1(String parseTemplate, HashMap glossary) {
        for (Iterator i = glossary.keySet().iterator(); i.hasNext(); ) {
            String tag = (String) i.next();
            String value = glossary.get(tag).toString();
            String tagToSearchFor = "";
            int numTimes = 0;
            boolean gotValue = true;
            if ((value == null) || (value.equals("") || (value.equals("null")))) {
                gotValue = false;
                value = "";
            }
            tag = tag.toUpperCase();
            String parseTemplateUpperCase = parseTemplate.toUpperCase();
            tagToSearchFor = "<!-- " + tag + " -->";
            int firstCommentLoc = parseTemplateUpperCase.indexOf(tagToSearchFor);
            while (firstCommentLoc > -1) {
                int lastCommentLoc = parseTemplateUpperCase.indexOf("<!-- /" + tag + " -->", firstCommentLoc);
                if ((firstCommentLoc > -1) && (lastCommentLoc > -1)) {
                    String newText = parseTemplate.substring(0, firstCommentLoc) +
                            "<!--  " +
                            tag +
                            " -->" +
                            value +
                            parseTemplate.substring(lastCommentLoc);
                    parseTemplate = newText;
                    parseTemplateUpperCase = parseTemplate.toUpperCase();
                }
                firstCommentLoc = parseTemplateUpperCase.indexOf("<!-- " + tag + " -->", lastCommentLoc);
            }
            tagToSearchFor = "`" + tag + "`";
            int firstTickLoc = parseTemplateUpperCase.indexOf(tagToSearchFor);
            while (firstTickLoc > -1) {
                int lastTickLoc = firstTickLoc + tagToSearchFor.length();
                if ((firstTickLoc > -1) && (lastTickLoc > -1)) {
                    String newText = parseTemplate.substring(0, firstTickLoc) +
                            value +
                            parseTemplate.substring(firstTickLoc + tagToSearchFor.length());
                    parseTemplate = newText;
                    parseTemplateUpperCase = parseTemplate.toUpperCase();
                }
                firstTickLoc = parseTemplateUpperCase.indexOf(tagToSearchFor, lastTickLoc);
            }
            tagToSearchFor = "<!-- " + tag + " STRIPLINE=\"TRUE\" -->";
            int firstStripCommentLoc = parseTemplateUpperCase.indexOf(tagToSearchFor);
            while (firstStripCommentLoc > -1) {
                int firstNewLineLoc = parseTemplateUpperCase.lastIndexOf('\n', firstStripCommentLoc);
                int lastCommentLoc = parseTemplateUpperCase.indexOf("<!-- /" + tag + " -->", firstStripCommentLoc);
                int lastNewLineLoc = parseTemplateUpperCase.indexOf('\n', lastCommentLoc);
                if ((firstStripCommentLoc > -1) && (lastCommentLoc > -1) && (firstNewLineLoc > -1) && (lastNewLineLoc > -1)) {
                    StringBuffer newText = new StringBuffer();
                    newText.append(parseTemplate, 0, firstNewLineLoc);
                    if (gotValue) {
                        newText.append(parseTemplate, firstNewLineLoc, firstStripCommentLoc);
                        newText.append("<!-- ");
                        newText.append(tag);
                        newText.append(" stripLine=\"true\"  -->");
                        newText.append(value);
                        newText.append(parseTemplate.substring(lastCommentLoc));
                    } else {
                        newText.append(parseTemplate.substring(lastNewLineLoc));
                    }
                    parseTemplate = newText.toString();
                    parseTemplateUpperCase = parseTemplate.toUpperCase();
                }
                firstStripCommentLoc = parseTemplateUpperCase.indexOf(tagToSearchFor, lastCommentLoc);
            }
            tagToSearchFor = "`" + tag + " STRIPLINE=TRUE`";
            int firstStripTickLoc = parseTemplateUpperCase.indexOf(tagToSearchFor);
            while (firstStripTickLoc > -1) {
                int firstNewLineLoc = parseTemplateUpperCase.lastIndexOf('\n', firstStripTickLoc);
                int lastStripTickLoc = firstStripTickLoc + tagToSearchFor.length();
                int lastNewLineLoc = parseTemplateUpperCase.indexOf('\n', lastStripTickLoc);
                if ((firstStripTickLoc > -1) && (lastStripTickLoc > -1) && (firstNewLineLoc > -1) && (lastNewLineLoc > -1)) {
                    StringBuffer newText = new StringBuffer();
                    newText.append(parseTemplate, 0, firstNewLineLoc);
                    if (gotValue) {
                        newText.append(parseTemplate, firstNewLineLoc, firstStripTickLoc);
                        newText.append(value);
                        newText.append(parseTemplate.substring(lastStripTickLoc));
                    } else {
                        newText.append(parseTemplate.substring(lastNewLineLoc));
                    }
                    parseTemplate = newText.toString();
                    parseTemplateUpperCase = parseTemplate.toUpperCase();
                }
                firstStripTickLoc = parseTemplateUpperCase.indexOf(tagToSearchFor, lastStripTickLoc);
            }
        }
        return parseTemplate;
    }

    String method2(String parseTemplate, HashMap glossary) {
        boolean gotValue = true;
        int numTimes = 0;
        int firstCommentLoc = 0;
        int lastCommentLoc = 0;
        int firstTickLoc = 0;
        int lastTickLoc = 0;
        int firstStripCommentLoc = 0;
        int firstNewLineLoc = 0;
        int lastNewLineLoc = 0;
        int firstStripTickLoc = 0;
        int lastStripTickLoc = 0;
        String tag;
        String value;
        String tagToSearchFor = "";
        StringBuffer newText = new StringBuffer();
        for (Iterator i = glossary.keySet().iterator(); i.hasNext(); ) {
            tag = (String) i.next();
            value = glossary.get(tag).toString();
            tagToSearchFor = "";
            numTimes = 0;
            gotValue = true;
            if ((value == null) || (value.equals("") || (value.equals("null")))) {
                gotValue = false;
                value = "";
            }
            tagToSearchFor = "<!-- " + tag + " -->";
            firstCommentLoc = parseTemplate.indexOf(tagToSearchFor);
            while (firstCommentLoc > -1) {
                lastCommentLoc = parseTemplate.indexOf("<!-- /" + tag + " -->", firstCommentLoc);
                if ((firstCommentLoc > -1) && (lastCommentLoc > -1)) {
                    newText.setLength(0);
                    newText.append(parseTemplate, 0, firstCommentLoc);
                    newText.append("<!--  ");
                    newText.append(tag);
                    newText.append(" -->");
                    newText.append(value);
                    newText.append(parseTemplate.substring(lastCommentLoc));
                    parseTemplate = newText.toString();
                } else if (lastCommentLoc == -1) {
                    lastCommentLoc = firstCommentLoc + 1;
                }
                firstCommentLoc = parseTemplate.indexOf("<!-- " + tag + " -->", lastCommentLoc);
            }
            tagToSearchFor = "`" + tag + "`";
            firstTickLoc = parseTemplate.indexOf(tagToSearchFor);
            while (firstTickLoc > -1) {
                lastTickLoc = firstTickLoc + tagToSearchFor.length();
                if ((firstTickLoc > -1) && (lastTickLoc > -1)) {
                    newText.setLength(0);
                    newText.append(parseTemplate, 0, firstTickLoc);
                    newText.append(value);
                    newText.append(parseTemplate.substring(firstTickLoc + tagToSearchFor.length()));
                    parseTemplate = newText.toString();
                } else if (lastTickLoc == -1) {
                    lastTickLoc = firstTickLoc + 1;
                }
                firstTickLoc = parseTemplate.indexOf(tagToSearchFor, lastTickLoc);
            }
            tagToSearchFor = "<!-- " + tag + " stripLine=\"true\" -->";
            firstStripCommentLoc = parseTemplate.indexOf(tagToSearchFor);
            while (firstStripCommentLoc > -1) {
                firstNewLineLoc = parseTemplate.lastIndexOf('\n', firstStripCommentLoc);
                lastCommentLoc = parseTemplate.indexOf("<!-- /" + tag + " -->", firstStripCommentLoc);
                lastNewLineLoc = parseTemplate.indexOf('\n', lastCommentLoc);
                if ((firstStripCommentLoc > -1) && (lastCommentLoc > -1) && (firstNewLineLoc > -1) && (lastNewLineLoc > -1)) {
                    newText.setLength(0);
                    newText.append(parseTemplate, 0, firstNewLineLoc);
                    if (gotValue) {
                        newText.append(parseTemplate, firstNewLineLoc, firstStripCommentLoc);
                        newText.append("<!-- ");
                        newText.append(tag);
                        newText.append(" stripLine=\"true\"  -->");
                        newText.append(value);
                        newText.append(parseTemplate.substring(lastCommentLoc));
                    } else {
                        newText.append(parseTemplate.substring(lastNewLineLoc));
                    }
                    parseTemplate = newText.toString();
                } else if (lastCommentLoc == -1) {
                    lastCommentLoc = firstStripCommentLoc + 1;
                }
                firstStripCommentLoc = parseTemplate.indexOf(tagToSearchFor, lastCommentLoc);
            }
            tagToSearchFor = "`" + tag + " stripLine=true`";
            firstStripTickLoc = parseTemplate.indexOf(tagToSearchFor);
            while (firstStripTickLoc > -1) {
                firstNewLineLoc = parseTemplate.lastIndexOf('\n', firstStripTickLoc);
                lastStripTickLoc = firstStripTickLoc + tagToSearchFor.length();
                lastNewLineLoc = parseTemplate.indexOf('\n', lastStripTickLoc);
                if ((firstStripTickLoc > -1) && (lastStripTickLoc > -1) && (firstNewLineLoc > -1) && (lastNewLineLoc > -1)) {
                    newText.setLength(0);
                    newText.append(parseTemplate, 0, firstNewLineLoc);
                    if (gotValue) {
                        newText.append(parseTemplate, firstNewLineLoc, firstStripTickLoc);
                        newText.append(value);
                        newText.append(parseTemplate.substring(lastStripTickLoc));
                    } else {
                        newText.append(parseTemplate.substring(lastNewLineLoc));
                    }
                    parseTemplate = newText.toString();
                } else if (lastStripTickLoc == -1) {
                    lastStripTickLoc = firstStripTickLoc + 1;
                }
                firstStripTickLoc = parseTemplate.indexOf(tagToSearchFor, lastStripTickLoc);
            }
        }
        return parseTemplate;
    }
}
