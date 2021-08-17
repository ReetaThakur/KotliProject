fun main(){
    var scores= arrayOf(10,30,23,54,23)
    var low=scores[3]
    for (i in scores){
        if (i<low)
            low=i
    }
    println(low)

}