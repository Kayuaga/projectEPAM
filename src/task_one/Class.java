package task_one;

import java.text.Format;
import java.util.Formatter;

/**
 * Created by georgijzyranov on 13.06.17.
 */
public class Class {

    public String getGradient(String color1, String color2, String numb) {

        String result = String.format("#grad%s {\n" +
                "    background: %s; /* For browsers that do not support gradients */\n" +
                "    background: -webkit-linear-gradient(%s, %s); /* For Safari 5.1 to 6.0 */\n" +
                "    background: -o-linear-gradient(%s, %s); /* For Opera 11.1 to 12.0 */\n" +
                "    background: -moz-linear-gradient(%s, %s); /* For Firefox 3.6 to 15 */\n" +
                "    background: linear-gradient(%s, %s); /* Standard syntax (must be last) */\n" +
                "}\n", numb, color1, color1, color2, color1, color2, color1, color2, color1, color2);

        return result;
    }


    public static void main(String[] args) {
        String html = "<html>\n" +
                "<head>\n" +
                "<style>\n";

        Class test = new Class();

        html = html.concat(test.getGradient("red", "blue", "1"));
        html = html.concat(test.getGradient("yellow", "orange", "2"));
        html = html.concat(test.getGradient("black", "purple", "3"));


        System.out.println(html);
    }


}


