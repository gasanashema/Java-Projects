package functionproject.src.Hr;

public class Salary {
    // Object:
    // object is anything in the reael world
    // an object can be defined by its state and behavior
    // when describing an object we get attributes or property
    // an object is an instance of a class
    // when you create a class, a constructor is also created by jdk.
    // a constructor is used to initialize an object
    // a constructor has the same name as a class name but it has no return type
    // constructors also can be overloaded

        public static void main(String[] args) {
        //jdk only knows main. if something is declared outside main can not be executed
        // calling a method is to invocation
        // a non static method can not be clled inside a static method

        addThreeNumbers();
        // displayAddress();
        System.out.println(displayAddress());
        
    }
    private static int addTwoNumbers(){
        return 1+2;
    }
    private static String displayAddress(){
        return "Kigali";
    }
    public static void addThreeNumbers(){
        int a = 8;
        int b = 7;
        int c = 3;
        System.out.println(a+b+c);
    }
    //method oveloading
    // if you have more than one mehtods with the same name but diffent number of paramert, under the same class those method are called overloading
    //if you call addNumber with one two parameters the jdk will know which method to invoke]
    public void addNumber(){

    }
    public void addNumber(int a,int b){

    }
    private void addNumber(int a,int b,int c){

    }

}
