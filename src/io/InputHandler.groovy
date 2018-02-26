package io

import model.Pizza
import model.PizzaTopping

class InputHandler {
    static Pizza handle(String fileName) {
        File inputFile = new File(fileName)
        Pizza pizza = new Pizza()

        List<String> lines = inputFile.readLines()
        String config = lines.first()
        pizza.numberOfRows = Integer.parseInt(config.split(' ')[0])
        pizza.numberOfColumns = Integer.parseInt(config.split(' ')[1])
        pizza.minIngredientsPerSlice = Integer.parseInt(config.split(' ')[2])
        pizza.maxCellsPerSlice = Integer.parseInt(config.split(' ')[3])
        lines.remove(0)
        pizza.cells = new PizzaTopping[pizza.numberOfRows][pizza.numberOfColumns]
        println "PIZZA CONFIG: rows=$pizza.numberOfRows columns=$pizza.numberOfColumns minIngredients=$pizza.minIngredientsPerSlice maxSlice=$pizza.maxCellsPerSlice"

        (0..pizza.numberOfRows-1).each { rowNumber ->
            (0..pizza.numberOfColumns-1).each { columnNumber ->
                println "Reading rowNumber=$rowNumber and columnNumber=$columnNumber"
                pizza.cells[rowNumber][columnNumber] = PizzaTopping.getTopping(lines.get(rowNumber).charAt(columnNumber) as char)
            }
        }

        print pizza
        return pizza
    }
}
