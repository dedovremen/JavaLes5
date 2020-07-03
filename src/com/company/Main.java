package com.company;

public class Main {

    public static void main(String[] args) {
        Square squares[] = new Square[5];
        squares[0] = new Square(7);
        squares[1] = new Square(3);
        squares[2] = new Square(9);
        squares[3] = new Square(1);
        squares[4] = new Square(4);

        SquarePrint.squarePrintFigure(squares);

 /*       for (int i = 0; i < squares.length; i++) {
            if (squares[i].calcSquare() < 10) {
                System.out.println("Квадрат" + i + " маленький");
            } else if (squares[i].calcSquare() <= 20) {
                System.out.println("Квадрат" + i + " средний");
            } else {
                System.out.println("Квадрат" + i + " большой");
            }
        }
    }*/

    }

}
