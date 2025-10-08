package functionproject.src.humanresource;

public class Salary {
    // FUNCTION: METHOD
    // a method is a block of codes chreated for a specific task
    /*
     * to create a method:
     * access_modifier return_type method_name(parameters){
     * }
     * access modifier: public,private,protected,default
     * 
     * public: a method will be visible any where in a project
     * private: will be only accessible by the methods inside the same class
     * default: will be accessed by other classes in the same package/ can not be accessed inside sub package
     * protected: will be accessed by classes in the same package and sub packages of the same package
     * 
     * -----------------------------------------------------------------
     * return type: void or any other type
     *  * a method starts with a lower case. if a name composed more than one words use camelCase 
     */
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
