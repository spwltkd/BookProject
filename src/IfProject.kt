fun main() {
    println("IfTest1")
    IfTest1()
    println("\nIfTest2")
    IfTest2()
    println("\nIfTest3")
    IfTest3()
    println("\nIfTest4")
    IfTest4()
    println("\nIfTest5")
    IfTest5()
    println("\nIfTest6")
    IfTest6()

}

fun IfTest1() {
    //기본 if-else
    var y:String = "기본 if-else"
    var x: Int
    if (10 > 20) {
        x = 5
    } else {
        x = 10
    }
    println("$x")
    println("$x")
}

fun IfTest2() {
    //코틀린 다운 if-else문
    var x: Int = if (10 > 20) 5 else 10
    println("$x")
}

fun IfTest3() {
    //if-else문을 사용한 반환값 사용
    var x: Int
    x = if (10 > 20) {
        doSomething()
        25
    } else if (12 > 13) {
        26
    } else {
        27
    }
    println("$x")
}

fun doSomething() {
    val a = 6
    println("$a")
}

fun IfTest4() {
    //중첩 if문 사용 -> 반환값
    var x: Int
    x = if (10 < 20) {
        if (4 == 3) {
            56
        } else {
            96
        }
    } else if (12 > 13) {
        26
    } else {
        27
    }
    println("$x")
}

fun IfTest5(){
    var x:Int
    x = if(10 <20){
        if(4==3){
            56
        }else{
            96
        }
        565
    }else if(12>13){
        26
    }else{
        27
    }
    println("$x")
}

fun IfTest6(){
    var x:Int
    x = if(10<20){
        10
    }else{
        20
    }
    println("x값은 $x")
}

