class HelloInfotel {
    static void main(String[] args) {

        Person totoTata = new Person()
        totoTata.setFirstName("Toto")
        totoTata.setLastName("Tata")
        totoTata.setAge(18)

        println totoTata.fullName + " is " + totoTata.age + " years old."
        printf("%s is %s years old. \n", totoTata.getFullName(), totoTata.getAge())

        if (totoTata.getAge() >= 3 && totoTata.getAge() <= 36 ) {
            printf("%s is young. \n", totoTata.getFullName())
        } else {
            printf("%s is %s years old. \n", totoTata.getFullName(), totoTata.getAge())
        }

        def persons = [totoTata, new Person(firstName: "Titi", lastName: "Tyty", age: 42)]

        for(Person person : persons) {
            printf("%s \n", person.getFullName())

            if (person.getAge() >= 3 && person.getAge() <= 36 ) {
                printf("%s is young. \n", person.getFullName())
            } else {
                printf("%s is %s years old. \n", person.getFullName(), person.getAge())
            }
        }


    }
}
