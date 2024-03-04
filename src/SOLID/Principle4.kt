package SOLID

/*
  I = Interface segregation principle i.e. instead of creating one big interface breakdown into smaller
  interfaces
*/

interface Print {
    fun print()
    fun printSpoonDetails()
}
interface Scan {
    fun scan()
    fun scanPhoto()
}
interface Fax {
    fun fax()
    fun faxInternet()
}

class CanonMFP:Print, Scan{
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printSpoonDetails() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }
}

class Panasonic: Fax{
    override fun fax() {
        TODO("Not yet implemented")
    }

    override fun faxInternet() {
        TODO("Not yet implemented")
    }
}