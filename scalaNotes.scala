// BigInt class for big integers
// Big Decimal same as above but decimals
// var randInt = 100000, then if you go into scala console "randInt" and press tab. shows you commands
// There is no ++ or --, but you can do += 1, -= 1 
// import scala.math._  "_" imports all math functions 
// ceil, round, floor, exp, pow, sqrt, hypot, log10, log, min, max, random, toRadian
// conditionals : ==, !=, >, <. >=, <=
// Logical operators : &&, ||, !=

//ITERATIONS
// object ScalaTutorial {
//   def main(args: Array[String]) {
//     var i = 0

//     // while(i <= 10) {
//     //   println(i)
//     //   i += 1
//     // }

//     // do {
//     //  println(i)
//     //  i += 1
//     // }while ( i <= 20)

//     for (i <- 1 to 10) {
//       println(i)
//     }

//     var randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

//     for(j <- 0 until randLetters.length) {
//       println(randLetters(j))
//     }

//   } //main end
// }



// object ScalaTutorial {
//   def main(args: Array[String]) {
  
//   val aList = List(1, 2, 3, 4, 5)
//   for (i <- aList) {
//     println("List items " + i )
//   }

//   var evenList = for { i <- 1 to 20
//     if (i % 2) == 0
//     } yield i

//   for (i <- evenList) println(i)

  
//   // nested for loop
//   for ( i <- 1 to 5; j <- 6 to 10) {
//     println("i : " + i )
//     println("j : " + j )
//   }

//   def printPrimes(){
//     val primeList = List(1, 2, 3, 5, 7, 11)
//     for(i <- primeList) {
//       if (i == 11) {
//         return //this is how you break out of the loop
//       }

//       if(i != 1) {
//         println(i)
//       }
//     }
//   }

//   printPrimes

//   }
// }


import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
//print to file
import java.io.PrintWriter
//read from file
import scala.io.Source

//Console get and ready
// object ScalaTutorial {
//   def main(args: Array[String]) {
//     // var numberGuess = 0
//     // do {
//     //   print("Guess a number ")
//     //   numberGuess = readLine.toInt
//     // } while(numberGuess != 15)

//     // printf("You guessed the secret number %d\n", 15)
  

//     var name = "Derek"
//     val age = 39
//     val weight = 175.5

//     println(s"Hello $name")
//     println(f"I am ${age + 1} and weigh $weight%.2f")
    
//     // %c for characters, %d for integers, %f for floats, %s for strings

//     printf("'%5d'\n", 5) // right justify
//     printf("'%-5d'\n", 5) // left justify
//     printf("'%05d'\n", 5) // left justify with 0 fill

//     // \n is new line, \b backspace, \\ for backslask, \a for alert sound

//   } //main end
// }

// STRINGS

// object ScalaTutorial {
//   def main(args: Array[String]) {
//     var randSent = "I saw a dragon fly by"
//     println("3rd index: " + randSent(3))
//     println("String length: " + randSent.length)
//     println(randSent.concat(" and explode"))
//     println("Are strings equal " + "I saw a dragon".equals(randSent))
//     println("Are strings equal " + randSent.equals(randSent))
//     println("dragon starts at index " + randSent.indexOf("dragon"))

//     val randSentArray = randSent.toArray

//     for(v <- randSentArray){
//       println(v)
//     }
//   }
// }


//FUNCTIONS

object ScalaTutorial {
  def main(args: Array[String]) {

  }
}