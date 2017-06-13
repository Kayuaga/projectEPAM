package task_one;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by georgijzyranov on 02.06.17.
 */
public class Task_one {

/*ну что ты умеешь копировать верстку из интернета я понял
* а теперь разнеси все по классам. Сделай класс конструктор которого принимает на вход
* имя файла и создает файл
* Второй класс должен хранить в себе HTML код , но его надо сделать красивым посмотри чего общего в HTML коде каждого
* градиента и подумай как можно уменьшить колличество текста ,
* вынеся его части в массив и сконкотенировать с другим текстом , чтобы результатом
* был код представленный ниже
* Третий класс оболочка(wrapper) должен внутри себя генерировать потоки записи и в нем должен быть метод ,
* который принимает на вход файл из первого класса и HTML из второго и записывает его в файл
* Если все это будет сделано , то тогда решишь задачу как программист.
* Будут вопросы задавай.
*
* */

    public static void main(String[] args) {

        File table = new File("table.html");

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(table));

            bw.write("<html>\n" +
                    "<head>\n" +
                    "<style>\n" +
                    "#grad1 {\n" +
                    "    background: red; /* For browsers that do not support gradients */\n" +
                    "    background: -webkit-linear-gradient(red, yellow); /* For Safari 5.1 to 6.0 */\n" +
                    "    background: -o-linear-gradient(red, yellow); /* For Opera 11.1 to 12.0 */\n" +
                    "    background: -moz-linear-gradient(red, yellow); /* For Firefox 3.6 to 15 */\n" +
                    "    background: linear-gradient(red, yellow); /* Standard syntax (must be last) */\n" +
                    "}\n" +
                    "#grad2 {\n" +
                    "    background: green; /* For browsers that do not support gradients */\n" +
                    "    background: -webkit-linear-gradient(green, blue); /* For Safari 5.1 to 6.0 */\n" +
                    "    background: -o-linear-gradient(green, blue); /* For Opera 11.1 to 12.0 */\n" +
                    "    background: -moz-linear-gradient(green, blue); /* For Firefox 3.6 to 15 */\n" +
                    "    background: linear-gradient(green, blue); /* Standard syntax (must be last) */\n" +
                    "}\n" +
                    "#grad3 {\n" +
                    "    background: black; /* For browsers that do not support gradients */\n" +
                    "    background: -webkit-linear-gradient(black, red); /* For Safari 5.1 to 6.0 */\n" +
                    "    background: -o-linear-gradient(black, red); /* For Opera 11.1 to 12.0 */\n" +
                    "    background: -moz-linear-gradient(black, red); /* For Firefox 3.6 to 15 */\n" +
                    "    background: linear-gradient(black, red); /* Standard syntax (must be last) */\n" +
                    "}\n" +
                    "#grad4 {\n" +
                    "    background: violet; /* For browsers that do not support gradients */\n" +
                    "    background: -webkit-linear-gradient(violet, blue); /* For Safari 5.1 to 6.0 */\n" +
                    "    background: -o-linear-gradient(violet, blue); /* For Opera 11.1 to 12.0 */\n" +
                    "    background: -moz-linear-gradient(violet, blue); /* For Firefox 3.6 to 15 */\n" +
                    "    background: linear-gradient(violet, blue); /* Standard syntax (must be last) */\n" +
                    "}\n" +
                    "</style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "  \n" +
                    "  <table style=\"height: 95px;\" width =\"212\">\n" +
                    "  <tbody>\n" +
                    "    <tr>\n" +
                    "      <td id=\"grad3\"></td>\n" +
                    "      <td id=\"grad1\"></td>\n" +
                    "      <td id=\"grad2\"></td>\n" +
                    "      <td id=\"grad4\"></td>\n" +
                    "      </tr>\n" +
                    "    <tr>\n" +
                    "      <td id=\"grad1\"></td>\n" +
                    "      <td id=\"grad4\"></td>\n" +
                    "      <td id=\"grad3\"></td>\n" +
                    "      <td id=\"grad2\"></td>\n" +
                    "    </tr>\n" +
                    "  </table>\n" +
                    "  \n" +
                    "  \n" +
                    "<h3>Made for PES by PES</h3>\n" +
                    "\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>\n");
            bw.close();

        } catch (IOException e) {
            System.err.print(e);
        }
    }
}
