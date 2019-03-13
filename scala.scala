object Main extends App {
    /*FUNKCJE GENERYCZNE*/
    /*
    def nazwa[typA, typB, ..., typN](f1)(f2)...(fk) :  typX => typY  = {...}    
    */

    def f(a : Int) : Double = {
        a + 0.1;  // f : Int => Int
    }
    def g(b : Double) = {
        math.ceil(b).toInt;  // g : Double => Int
    }
    def funkcja[A,B](f: A => B)(g: B => A) : A => A = {
        x : A => g(f(x));   // funkcja: Int => Int
    }                       // A - Int, B - Double
    println(funkcja(f)(g)(3)); //g(f(3)) => g(3.1) => 4
    
    /*FUNKCJE LAMBDA*/
    /*
        
    */
}