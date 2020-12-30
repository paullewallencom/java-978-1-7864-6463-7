package example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatcherAppendExample {
    public static void main(String[] args) {
        final String input =
                "<n1=v1 n2=v2 zz n3=v3> n1=v1 n2=v2 abc=123 <v=pq id=abc> v=pq";
        final Pattern pairPatter = Pattern.compile("(\\w+)=(\\w+)");
        Matcher enclosedPairs = Pattern.compile("<[^>]+>").matcher(input);
        StringBuilder buffer = new StringBuilder();
        while (enclosedPairs.find()) {
            Matcher pairs = pairPatter.matcher(enclosedPairs.group());
            enclosedPairs.appendReplacement(buffer,
                    pairs.replaceAll("$2=$1"));
        }
        enclosedPairs.appendTail(buffer);
        System.out.println(buffer);
    }
}
