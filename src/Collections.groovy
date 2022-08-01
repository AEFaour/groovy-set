class Collections {
    static void main(String[] args) {
        Person totoTata = new Person(firstName: "Toto", lastName: "Tata", age: 20)
        Person titiTyty = new Person(firstName: "Titi", lastName: "Tyty", age: 30)
        Person teteTutu = new Person(firstName: "Tete", lastName: "Tutu", age: 25)

        def allTttt = [totoTata, titiTyty, teteTutu]
        assert allTttt instanceof  List<Person>
        assert allTttt.size() == 3
        assert allTttt[1] == titiTyty

        allTttt.each {
            printf("%s \n ", it)
        }

        allTttt.eachWithIndex{ Person entry, int i ->
            printf("%s : %s \n", i + 1, entry)
        }

        allTttt.find {it.lastName == 'Tutu'} == teteTutu

        allTttt.collect {it.age <= 29} == [true, true, false]

        allTttt.sort {it.age} == [totoTata, teteTutu, titiTyty]

    }
}
