package task_one;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Wrapper {

    public static void main(String[] args) throws IOException{

        ConstructHTML constructHTML = new ConstructHTML("kek");

        BufferedWriter writer = new BufferedWriter(new FileWriter(constructHTML.toString()));

        System.out.println(constructHTML.getName());
    }
}
