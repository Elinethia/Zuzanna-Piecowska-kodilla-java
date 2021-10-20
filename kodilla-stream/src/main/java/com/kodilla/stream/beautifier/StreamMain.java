package com.kodilla.stream.beautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String poem1 = poemBeautifier.beautify("Lithuania, my country", (poem -> poem.toUpperCase()));
        System.out.println(poem1);

        String poem2 = poemBeautifier.beautify("Lithuania, my country", (poem -> "ABC" + " " + poem + " " + "ABC"));
        System.out.println(poem2);

        String poem3 = poemBeautifier.beautify("Lithuania, my country", (poem -> poem.toLowerCase()));
        System.out.println(poem3);

        String poem4 = poemBeautifier.beautify("Lithuania, my country", (poem -> "***" + " " + poem + " " + "***"));
        System.out.println(poem4);

        String poem5 = poemBeautifier.beautify("Lithuania, my country", (poem -> poem.replace("a", "A")));
        System.out.println(poem5);
    }
}
