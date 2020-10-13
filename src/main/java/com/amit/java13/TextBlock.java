package com.amit.java13;

public class TextBlock {

    public static void main(String[] args) {

        String html = """
                <html>
                Hi
                </html>""";

        String oldHtml = "<html>\nHi\n</html>";
        System.out.println("new html : " + html);
        System.out.println(html == oldHtml);

        html = """
                <html>
                Hi %s
                </html>""";
        html = html.formatted("Amit");
        System.out.println(html);

        System.out.println("Text block strip indent (won't work in text block)******");
        html = """
                  <html>
                   Hi
                    </html>  """;
        System.out.println(html.replace(" ", "*"));
        System.out.println(html.stripIndent().replace(" ", "*"));

        System.out.println("String strip indent  (will work in String)******");
        html = " <html> \n Hi \n </html> ";
        System.out.println(html.replace(" ", "*"));
        System.out.println(html.stripIndent().replace(" ", "*"));

        String str1 = "Hi\t\nHello' \" /u0022 Pankaj\r";
        System.out.println(str1);
        System.out.println(str1.translateEscapes());
    }
}
