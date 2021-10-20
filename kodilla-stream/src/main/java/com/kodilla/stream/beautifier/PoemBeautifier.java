package com.kodilla.stream.beautifier;

public class PoemBeautifier {

     String beautify(String poem, PoemDecorator poemDecorator) {
         return poemDecorator.decorate(poem);
     }

}
