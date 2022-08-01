class UseAnnotation {
    static void main(String[] args) {
        Person totoTata = new Person(firstName: "Toto", lastName: "Tata", age: 25)
        assert totoTata.toString() == "Person(Toto, Tata, 25, Toto Tata)"
        assert totoTata.equals(totoTata)
        assert  !totoTata.equals(new Person(firstName: "Titi", lastName: "Tyty", age: 35))
        assert new Person(firstName: "Titi", lastName: "Tyty", age: 35).toString() == "Person(Titi, Tyty, 35, Titi Tyty)"
    }
}
