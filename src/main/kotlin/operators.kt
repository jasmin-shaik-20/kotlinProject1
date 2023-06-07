
    fun main(args : Array<String>){
        //Assignment Operators
        var a = 10
        var b = 5
        a+=b
        println(a)
        a-=b
        println(a)
        a*=b
        println(a)
        a/=b
        println(a)
        a%=b
        println(a)
       //logical Operators
        var x = 100
        var y = 25
        var z = 10
        if(x > y && x > z)
            println(x)
        if(x < y || x > z)
            println(y)

        //unary operator
        var e=10
        println(++e)
        println(--e)
        println(e++)
        println(e--)

        //Relational operators
        var c=40
        var d=50
        println(c>d)
        println(c==d)
        println(c<d)

    }