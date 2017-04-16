package edu.southeastmn.gagerhyner.grhyner3a;

import java.text.DecimalFormat;

/**
 * Created by Gage on 4/14/2017.
 */

public class Loops {
    private int max;

    public Loops(int max) {
        this.max = max;
    }

    public String whileLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        String output = "While Loop\nCount\tSum\n=====\t=====\n";
        int i = 1, total = 0;
        while (i <= max) {
            total += i;
            output += fmt.format(i) + '\t' + fmt.format(total) + '\n';
            i++;
        }
        return output;
    }

    public String doWhileLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        String output = "Do While Loop\nCount\tSum\n=====\t=====\n";
        int i = 1, total = 0;
        do {
            total += i;
            output += fmt.format(i) + '\t' + fmt.format(total) + '\n';
            i++;
        } while (i <= max);

        return output;
    }

    public String forLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        String output = " For Loop\nCount\tSum\n=====\t=====\n";
        int i, total;
        for (i = 1, total = 0; i <= max; i++) {
            total += i;
            output += fmt.format(i) + '\t' + fmt.format(total) + '\n';

        }

        return output;
    }
}
