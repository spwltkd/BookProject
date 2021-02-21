fun main() {
    //When 구문 테스트용 main 함수
    whenCording1(13)
    whenCording2(11)
    whenCording3(3)
    whenCording4(5)
    println("\nwhenCording5 3가지 테스트")
    println("사용자 정의 오브젝트와 반복문 사용")
    whenCording5(ob(2,true,500))
    whenCording5(ob(12,false,800))
    whenCording5(ob(2,false,500))
    println("try-catch 기본 사용")

}

fun whenCording1(x: Int) {
    println("kotlin 기본 when 사용")
    when (x) {
        12 -> {
            println("x is equal to 12")
        }
        4 -> {
            println("x is equal to 4")
        }
        else -> {
            println("no conditions match!!")
        }
    }
}

fun whenCording2(x: Int) {
    println("\nkotlin에서 if문을 대신해 when 사용")
    when (x) {
        in (1..10) -> {
            println("x lies between 1 to 10")
        }
        !in (1..10) -> {
            println("x does not lie between 1 to 10")
        }
    }
}

fun whenCording3(x: Int) {
    println("\nwhen 안에 조건 타입이 다른 경우")
    when (x) {
        magicNum(x) -> {
            println("x is a magic number")
        }
        in (1..10) -> {
            println("lies between 1 to 10, value = ${if (x < 20) x else 0}")
        }
        20, 21 -> {
            println("$x is special and has direct exit access")
        }
        //20,21 은 출력안됨 -> magic number 로 처리
        else -> {
            println("$x needs to be executed")
        }
    }
}

fun magicNum(a: Int): Int {
    return if (a in (15..25)) a else 0
}

data class ob(val value: Int,val valid:Boolean, val max:Int)

fun whenCording4(x: Int){
    println("\nwhen과 객체를 함께 사용하는 방법")
    val y = ob(x,true,500)
    when(y.value){
        magicNum(y.value)->{
            println("$y is a magic number and ${if(y.valid)
            "valid" else "invalid"}")
        }
        in(1..10)->{
            println("lies between 1 to 10, value : ${if (y.value < y.max) y.value else y.max}")
        }
        20,21 ->{
            println("$y is special and has direct exit access")
        }
        else -> {
            println("$y needs to be executed")
        }
    }
}

fun whenCording5(x:ob){
    when(x){
        ob(2,true,500)->{
            println("equals correct object")
        }
        ob(12,false,800)->{
            println("equals wrong object")
        }
        else->{
            println("do not match any object")
        }
    }
}



