package SOLID

// high level module
class ProductCatalogEx{
    fun showAllProducts(){
        val products = ProductsEx()
        println(products.getAllProducts())
    }
}

// low level module
class ProductsEx{
    fun getAllProducts() = mutableListOf("Apple", "Orange", "Banana")
}

fun main() {
    val abc = ProductCatalogEx()
    abc.showAllProducts()
}