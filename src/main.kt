//create a class Car with the following attributes:make,model,color,capacity
//It has this functions:
//carry(people:Int):prints out"carrying $people passengers"if the number of people is within its capacity else it prints out
//"Over capacity by $x people"where x is the number of people exceeding its capacity.
fun main(){
    var car=Car("Tesla","v8qsg","blue",40)
    car.carry( 45)
    println(car.capacity)
    car.identity()
    var z=car.calculateParkingFees(12)
    println(z)

    oddNumber()
    var x=nameArray(arrayOf("Timo","Catherine","Benja","Faithmtua"))
    println(x)



}
class  Car(var make:String,var model:String,var color:String,var  capacity:Int){
    fun carry(people:Int){
        if (people==capacity){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity by $people")
    }
        }
    //prints out the color,make and model in the following format e.g "I am a white Subaru legacy"
    fun identity(){
        println("I am a $color ,$make and $model")
    }
    //calculates parkingFees(hours:Int):calculates and returns the parking fees by multiplying the hours by 20.
    fun calculateParkingFees(hours:Int):Int{
        var parkingfees=hours*20
        return parkingfees
    }

}

//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumber() {
    for (num in 1..100) {
        if (num % 2 != 0) {
            println(num)
        }
    }

}

//Create a function that takes in an array of names and returns the number of
//names longer than  5 characters
fun nameArray(names: Array<String>): Int {
    var x = 0
    names.forEach { name ->
        if (name.length > 5) {
            x++
        }
    }
    return x
}