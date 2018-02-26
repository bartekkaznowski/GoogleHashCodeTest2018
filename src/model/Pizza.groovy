package model

class Pizza {
    int maxCellsPerSlice
    int minIngredientsPerSlice
    int numberOfRows
    int numberOfColumns
    PizzaTopping[][] cells

    String toString() {
        String output = "PIZZA CONFIG: rows=$numberOfRows columns=$numberOfColumns minIngredients=$minIngredientsPerSlice maxSlice=$maxCellsPerSlice\n"
        cells.each {
            output = "${output}${it}\n"
        }
        return output
    }
}
