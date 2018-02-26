package io

import model.PizzaSlice
import slicefinder.PizzaSliceFinder

class OutputHandler {
    static void handle(String fileName, List<PizzaSlice> pizzaSlices) {
        File outputFile = new File(fileName)
        outputFile.write(PizzaSliceFinder.generateOutput(pizzaSlices))
    }
}
