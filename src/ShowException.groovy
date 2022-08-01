class ShowException {

    static void main(String[] args) {
        Person totoTata = new Person(firstName: "Toto", lastName: "Tata", age: 25)


        try {
            totoTata.getFirstName().toLong()
        } catch(NumberFormatException nfEx) {
            assert nfEx instanceof NumberFormatException
            printf("The raison of this excetion : %s. \n", nfEx.getMessage())

        }
    }
}
