class Closures {
    static void main(String[] args) {
        Person totoTata = new Person(firstName: "Toto", lastName: "Tata", age: 25)

          Closure totoTataToString =  { Person person -> printf("The string of totoTata  : %s \n", person.toString()) }

          //totoTataToString(totoTata)

         handlePerson(totoTataToString, totoTata)

        Closure totoTataFullName =  { Person person -> printf("The full name of totoTata  : %s \n", person.getFullName()) }

        handlePerson(totoTataFullName, totoTata)
    }

    static void handlePerson(Closure c, Person p){
        if (p == null) {
            throw new RuntimeException("A person instance connont be null")
        }
        c(p)
    }
}
