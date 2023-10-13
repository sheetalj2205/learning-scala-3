object Functions extends App {
def sum(num1: Int, num2: Int) : Int = num1 + num2;

def light(switchOn: Boolean) : String = if switchOn then "lights are on" else "lights are off";

//challenge
def product(num1: Int, num2: Int) : Int = num1*num2;
def greeting(Name: String = "default hello") : String = s"Hey! $Name";

println(sum(1, 2));
println(light(true));
println(product(2, 3));
println(greeting());
println(greeting("heyyoo"));
}
