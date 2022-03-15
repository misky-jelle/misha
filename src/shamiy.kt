fun main() {
    printName(arrayOf("Misky","Anita","Anota","Sharon"))
    printCities(arrayOf("mumbai","nairobi","harare","jakarta"))
    printNames(arrayOf("hilda","mosses","moraa","jelle"))
    printNumbers(arrayOf(13,3,6,1345,78,12,158,153,17,18,19))
    names(arrayOf("Nadine","Sangwa","Charity"))







}
fun printName(names:Array<String>){
    var x=names
    println(names.contentToString())

}
fun printCities(cities:Array<String>){
    for (d in cities){
        println(d.capitalize())
    }

}
fun printNames(names:Array<String>){
    for (w in names)
        println(w.capitalize())
}
fun printNumbers(numbers:Array<Int>){
    var sum=numbers[2] + numbers[5]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
    println(numbers.sortedArrayDescending().contentToString())

}
fun names(name:Array<String>){
    var n=name
    println(name.contentToString())
}
