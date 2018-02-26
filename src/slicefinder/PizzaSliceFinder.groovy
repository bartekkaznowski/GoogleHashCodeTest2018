package slicefinder

import model.Pizza
import model.PizzaSlice

class PizzaSliceFinder {

    static List<PizzaSlice> findSlices(Pizza pizza) {
        return [new PizzaSlice(topLeftX: 0, topLeftY: 0, bottomRightX: 1, bottomRightY: 1)]
    }

    static String generateOutput(List<PizzaSlice> pizzaSlices) {
        String output = "${pizzaSlices.size()}\n"
        pizzaSlices.each {
            output = "${output}${it.topLeftX} ${it.topLeftY} ${it.bottomRightX} ${it.bottomRightY}\n"
        }
        return output
    }
}
