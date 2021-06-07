//Soal nomer 1 
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        new A();
        new B();
    }

    static class A {
        int i = 7;

        public A() {
            setI(20);
            System.out.println("i from A is " + i);
        }

        public void setI(int i) {
            this.i = 2 * i;
        }
    }

    static class B extends A {
        public B() {
            System.out.println("i from B is " + i);
        }

        public void setI(int i) {
            this.i = 3 * i;
        }

    }
}

//Soal nomer 2
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Person().printPerson();
        new Student().printPerson();

    }
    static class Student extends Person {
        @Override
        public String getInfo() {
            return "Student";
        }
    }
    static class Person {
        public String getInfo() {
            return "Person";
        }
        public void printPerson() {
            System.out.println(getInfo());
        }
    }
}

//Soal nomer 3

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Person().printPerson();
        new Student().printPerson();
    }
}

class Student extends Person {
    private String getInfo() {
        return "Student";
    }
}

class Person {
    private String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}
