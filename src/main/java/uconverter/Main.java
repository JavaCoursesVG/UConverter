package uconverter;

import asg.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by JavaCourses on 19.04.2017..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ShellFactory
                .createConsoleShell("1-C 2-F 3-K 4-M 5-K", "This is Universal Converter.", new UniversalConverter())
                .commandLoop();
    }
}
