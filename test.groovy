
def x = 42
println x.getClass()
x = "World"
println "Hello, ${x[0]} $x"
println x.getClass()

//https://www.timroes.de/2015/06/28/groovy-tutorial-for-java-developers-part2-closures/
msg = """

this is the time for
all good men
to go for the aid of the country

"""

println msg

println 22/7


def pattern = /^(a|A)pple/
println pattern.getClass()

def matcher = "Apple trees are great ones nature has given to us!" =~ pattern

if (matcher) {
   println ("Found 'apple' ")
}

def greet = {
  println "greetings"
}

greet()

def power = { int a, int b ->
   return Math.pow(a,b)

}


println power(10,3)


def speak = { what ->
      println what
}

speak "nice"


def echo = { println it }
echo "I am a parrot!"


def square = { it * it }
println square(99)


// passing closures

def transform = { str, transformation ->
  transformation(str)
}

println transform("Mohandas Gandhi", { it.toUpperCase() })


///-------Closing of variables


def createGreeter = { name ->
  return {
    def day = new Date().getDay()
    if (day == 0 || day == 1) {
      println "Nice Weekend, $name"
    } else {
      println "Hello, $name"
    }
  }
}
def greetWorld = createGreeter("World")
greetWorld()


///----- Lists

def list = [1,1,2,3,5]

print list

println list[0] // will print 1
println list[-1] // negative indexes for access from the end of the list, will print out 5



list.each {
  println it
}

def even = list.findAll { it % 2 == 0 }


println even


def squaredList = list.collect { it * it }

println squaredList


def upper = ["Hello", "World"]*.toUpperCase()

println upper


// Maps

def key = 'Key3'
def aMap = [
  'Key1': 'Value 1', // Put key1 -> Value 1 to the map
  Key2: 'Value 2', // You can also skip the quotes, the key will automatically be a String
  (key): 'Another value' // If you want the key to be the value of a variable, you need to put it in parantheses
]

println aMap['Key3']
println aMap.Key1
