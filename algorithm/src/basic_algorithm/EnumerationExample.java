package basic_algorithm;

enum FoodClassification {
    /**
     * Vegetables
     */
    Vegetables,
    /**
     * Fruits
     */
    Fruits,
    /**
     * Meat
     */
    Meat;
    private String name;

    public String getName() {
        return name;
    }

    public Enum setName(String name) {
        this.name = name;
        return this;
    }
}

/**
 * The J2SE version 5.0 of the Java programming language added enumerated types whose declaration syntax is similar to that of C:
 * <p>
 * The Java type system, however, treats enumerations as a type separate from integers, and intermixing of enum and integer values is not allowed. In fact, an enum type in Java is actually a special compiler-generated class rather than an arithmetic type, and enum values behave as global pre-generated instances of that class. Enum types can have instance methods and a constructor (the arguments of which can be specified separately for each enum value). All enum types implicitly extend the Enum abstract class. An enum type cannot be instantiated directly.[6]
 * <p>
 * Internally, each enum value contains an integer, corresponding to the order in which they are declared in the source code, starting from 0. The programmer cannot set a custom integer for an enum value directly, but one can define overloaded constructors that can then assign arbitrary values to self-defined members of the enum class. Defining getters allows then access to those self-defined members. The internal integer can be obtained from an enum value using the ordinal() method, and the list of enum values of an enumeration type can be obtained in order using the values() method. It is generally discouraged for programmers to convert enums to integers and vice versa.[7] Enumerated types are Comparable, using the internal integer; as a result, they can be sorted.
 * <p>
 * The Java standard library provides utility classes to use with enumerations. The EnumSet class implements a Set of enum values; it is implemented as a bit array, which makes it very compact and as efficient as explicit bit manipulation, but safer. The EnumMap class implements a Map of enum values to object. It is implemented as an array, with the integer value of the enum value serving as the index.
 */
public class EnumerationExample {
    public static void main(String[] args) {
        FoodClassification classification = FoodClassification.Fruits;
        classification.setName("apple");
        System.out.println(classification.getName());

        /*枚举与String类型之间的转换*/

        //枚举 -> String : toString() 方法
        String s = classification.toString();
        System.out.println(s);

        //String -> 枚举 : Enum的valueOf
        FoodClassification foodClassification = Enum.valueOf(FoodClassification.class, "Meat");
        System.out.println(foodClassification);

        //枚举在自定义类中的使用
        Eatables eatables = new Eatables("banana", FoodClassification.Fruits);
        System.out.println(eatables.getName());
    }
}

class Eatables {
    private String name;
    private FoodClassification food;

    public Eatables(String name, FoodClassification food) {
        super();
        this.name = name;
        this.food = food;
    }

    public Eatables() {
        super();
    }

    public String getName() {
        return name;
    }

    public Eatables setName(String name) {
        this.name = name;
        return this;
    }

    public FoodClassification getFood() {
        return food;
    }

    public Eatables setFood(FoodClassification food) {
        this.food = food;
        return this;
    }
}
