class DropMethod {
    static void main(String[] args) {
        Person totoTata = new Person(firstName: "Toto", lastName: "Tata", age: 25)

        printf("drop 2 letters - left : %s \n", totoTata.getFirstName().drop(2))
        printf("drop 2 letters - right : %s \n", totoTata.getFirstName().dropRight(2))


    }
}
