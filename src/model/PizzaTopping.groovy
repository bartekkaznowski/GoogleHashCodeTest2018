package model

enum PizzaTopping {
    TOMATO('T' as char), MUSHROOM('M' as char)

    PizzaTopping(char toppingLetter) {
        this.toppingLetter = toppingLetter
    }

    static PizzaTopping getTopping(char toppingLetter) {
        values().find {
            it.toppingLetter == toppingLetter
        }
    }

    char toppingLetter

    String toString() {
        return "${this.toppingLetter}"
    }
}
