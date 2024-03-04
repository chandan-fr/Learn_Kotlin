package SOLID

/*
  D = Dependency Inversion principle i.e. upper module not depend on the lower module;
  both depend on the abstraction
*/

// high level module
class ProductCatalog{
    fun showAllProducts(){
        val products: Products = VeggieProducts()
        products.getAllProducts().forEach {
            println(it)
        }
    }
}

interface Products {
    fun getAllProducts(): MutableList<String>
}

// low level module
class FruitProducts: Products{
    override fun getAllProducts() = mutableListOf("Apple", "Orange", "Banana")
}

class VeggieProducts: Products{
    override fun getAllProducts() = mutableListOf("Tomato", "Ginger", "Spinach")
}

fun main() {
    val abc = ProductCatalog()
    abc.showAllProducts()
}