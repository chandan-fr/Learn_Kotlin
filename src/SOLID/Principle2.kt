package SOLID

//  O = Open closed Principle i.e. a software component is open for extension but close for modification

interface Customer{
    fun isLoyalCustomer():Boolean
}

class VehicleInsuranceCustomer: Customer{
    override fun isLoyalCustomer(): Boolean = true
}

class HomeInsuranceCustomer: Customer{
    override fun isLoyalCustomer(): Boolean = false
}

class LifeInsuranceCustomer: Customer{
    override fun isLoyalCustomer(): Boolean = true
}

class InsuranceCompany{
    fun discountRate(customer:Customer):Int = if (customer.isLoyalCustomer()) 80 else 30
}

fun main() {
    val insuranceDiscount = InsuranceCompany()
    println(insuranceDiscount.discountRate(LifeInsuranceCustomer()))
    println(insuranceDiscount.discountRate(HomeInsuranceCustomer()))
    println(insuranceDiscount.discountRate(VehicleInsuranceCustomer()))
}