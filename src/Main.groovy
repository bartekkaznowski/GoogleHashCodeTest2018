import io.OutputHandler
import model.Pizza
import model.PizzaSlice
import slicefinder.PizzaSliceFinder
import io.InputHandler

Pizza pizza = InputHandler.handle('example.in')
println pizza
List<PizzaSlice> pizzaSlices = PizzaSliceFinder.findSlices(pizza)
OutputHandler.handle('example.out', pizzaSlices)
println "Finished"