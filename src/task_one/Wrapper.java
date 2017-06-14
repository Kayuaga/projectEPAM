package task_one;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Wrapper {
// Почему ты впихнул main метод в класс обертки? Ты должен тут сделать класс который будет вовращать тебе потоки 
    public static void main(String[] args) throws IOException{

        ConstructHTML constructHTML = new ConstructHTML("kek");
// Доставать переменные методом toString нельзя. Для этого используются get методы , которые тебе возвращают поле класса
        BufferedWriter writer = new BufferedWriter(new FileWriter(constructHTML.toString()));

        System.out.println(constructHTML.getName());
    }
}
