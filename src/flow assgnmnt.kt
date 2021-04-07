fun main(){
    number()
    names()

    people(4)
    people(11)
    people(27)

    digits()



}

fun number(){
    for (m in 1..100)
        if (m%2==1){
            println(m)
        }
}
fun names(){
    var people= arrayOf("Ham","Aishabia","Jackline","kori")
    for(names in people){
        if(names.length>5){
            println(names)
        }}}
fun people(age:Int){
    if(age < 6){
        println("milk")}
    else if(age < 15 && age >6){
        println("fanta orange")
    }
    else{
        println("cocacola")
    }


}
fun digits(){
    for(numbers in 1..100){
        if (numbers%3==0){
            println("Fizz") }
        if (numbers%5==0){
            println("Buzz") }
        if (numbers%5==0 && numbers%3==0){
            println("Fizz Buzz") }
        else {println(numbers)
        }


    }}
