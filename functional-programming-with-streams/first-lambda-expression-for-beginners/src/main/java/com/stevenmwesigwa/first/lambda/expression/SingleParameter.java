package com.stevenmwesigwa.first.lambda.expression;

import java.util.function.Consumer;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class SingleParameter {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Consumer<String> consumer = e -> System.out.printf("%s : %d \n", e, e.length());

        String[] names = {"Steven", "Wesley", "Dimitri", "Denzel", "Mwesigwa"};
        for (String name : names) {
            consumer.accept(name);
        }
    }
}
