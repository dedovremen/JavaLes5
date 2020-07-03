package com.company;

import java.sql.Array;

public class SquarePrint {
    private final static String NAME = "Квадрат";
    private final static String SIZE_ONE = "маленький";
    private final static String SIZE_TWO = "средний";
    private final static String SIZE_THREE = "большой";

    public static void squarePrintFigure (Square[] fig) {
        for (int i = 0; i < fig.length; i++) {
            if (fig[i].calcSquare() < 10) {
                System.out.println(NAME + i + " площадью " + fig[i].calcSquare() + " " + SIZE_ONE);
            } else if (fig[i].calcSquare() <= 20) {
                System.out.println(NAME + i + " площадью " + fig[i].calcSquare() + " " + SIZE_TWO);
            } else {
                System.out.println(NAME + i + " площадью " + fig[i].calcSquare() + " " + SIZE_THREE);
            }
        }

    }
}
