package SOLID

class VehicleInsuranceCustomerEx {
    fun isLoyalCustomer(): Boolean = true
}

class HomeInsuranceCustomerEx {
    fun isLoyalCustomer(): Boolean = false
}

class LifeInsuranceCustomerEx {
    fun isLoyalCustomer(): Boolean = true
}

class InsuranceCompanyEx {
    fun discountRate(customer: LifeInsuranceCustomerEx): Int = if (customer.isLoyalCustomer()) 80 else 30
    fun discountRate(customer: HomeInsuranceCustomerEx): Int = if (customer.isLoyalCustomer()) 80 else 30
    fun discountRate(customer: VehicleInsuranceCustomerEx): Int = if (customer.isLoyalCustomer()) 80 else 30
}

fun main() {

}