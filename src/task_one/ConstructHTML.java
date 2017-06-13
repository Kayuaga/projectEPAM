package task_one;

import java.io.File;

/**
 * Created by georgijzyranov on 03.06.17.
 */
public class ConstructHTML {

    private String name;

    public ConstructHTML(String name) {

        this.name = name;

        File file = new File(name+".html");

    }

    public String getName() {
        return name;
    }
}
