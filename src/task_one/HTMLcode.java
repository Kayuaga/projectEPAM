package task_one;

/**
 * Created by georgijzyranov on 03.06.17.
 */
public class HTMLcode {


    public String begin() {
        String begin = "<html> \n <head> \n </head> \n <body>";
        return begin;
    }

    // after "grad" goes number of style chosen

    int id;
    String color1;
    String color2;


    public String gradient(int id, String color1, String color2){

        this.id = id;
        this.color1 = color1;
        this.color2 = color2;

        String gradient = "#grad"+ id +"{\n" +
                "    background:"+ color1 +";\n" + /// * For browsers that do not support gradients */
                "    background: -webkit-linear-gradient("+color1+", "+color2+");\n" + ///* For Safari 5.1 to 6.0 */
                "    background: -o-linear-gradient("+color1+", "+color2+");\n" + ///* For Opera 11.1 to 12.0 */
                "    background: -moz-linear-gradient("+color1+", "+color2+");\n" + ///* For Firefox 3.6 to 15 */
                "    background: linear-gradient("+color1+", "+color2+");/\n" +  ///* Standard syntax (must be last) *
                "}\n";

        return gradient;
    }



    public void style(String color1, String color2){
        String styleBegin = "<style>";
        String styleEnd = "</style>";
    }


    public String tableCreator() {

        String table =  "  <table style=\"height: 95px;\" width =\"212\">\n" +
                "  <tbody>\n" +
                "    <tr>\n" +
                "      <td id=\"grad1\"></td>\n" +
                "      <td id=\"grad2\"></td>\n" +
                "      <td id=\"grad3\"></td>\n" +
                "      <td id=\"grad4\"></td>\n" +
                "      </tr>\n" +
                "    <tr>\n" +
                "      <td id=\"grad2\"></td>\n" +
                "      <td id=\"grad4\"></td>\n" +
                "      <td id=\"grad1\"></td>\n" +
                "      <td id=\"grad3\"></td>\n" +
                "    </tr>\n" +
                "  </table>\n";


        return table;
    }

    public String end() {
        String end = " </body> \n </html> \n";
        return end;
    }




}
