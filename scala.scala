object Main extends App {
    /*FUNKCJE GENERYCZNE*/
    /*
        def nazwa[typA, typB, ..., typN](f1)(f2)...(fk) :  typX => typY  = {...}    
    */

    def intDouble(a : Int) : Double = {
        a + 0.1;  // Int => Double
    }
    def doubleInt(b : Double) : Int = {
        math.ceil(b).toInt;  // Double => Int
    }
    def funkcja[A,B](f: A => B)(g: B => A) : A => A = {
        x : A => g(f(x));
    }
    println("F. generyczna int => int: " + funkcja(intDouble)(doubleInt)(3)); //g(f(3)) => g(3.1) => 4
    println("F. generyczna double => double: " + funkcja(doubleInt)(intDouble)(3.0)); //f(g(3.0)) => g(3.0) => 3.1
    println();

    /*WYRAŻENIA LAMBDA*/
    /*
        val nazwa = (arg1 : typ1) => (arg2 : typ2) => ... => (argN : typ N) = operacja(e)

    */

        val lambda_h = (x : Int) => (y : Int) => x % y;
        //równoważne
        def zwykle_h(x : Int)(y : Int) : Int = {
            x % y;
        }
        println("Wyrażenie lambda wynik: " + lambda_h(3)(4));
        println("Zwykła funkcja wynik: " + zwykle_h(3)(4));
        println();
        val intDbl = (x : Int) => x + 0.1;
        val dblInt = (x : Double) => math.ceil(x).toInt;

        println("F. generyczna od lambda i => i: " + funkcja(intDbl)(dblInt)(3));
        println("F. generyczna od lambda d => d: " + funkcja(dblInt)(intDbl)(3.0));
        println();
}