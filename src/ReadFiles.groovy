class ReadFiles {

    static void main(String[] args) {
        Person totoTata = new Person()

        File file = new File("resources/toto-tata.txt")
        printf("Read the file toto-tata : \n%s\n", file.getText('UTF-8'))

        file.eachLine {String line, Integer no ->
            if(no == 1) {
                totoTata.setFirstName(line)
            } else if(no == 2) {
                totoTata.setLastName(line)
            } else if(no == 3) {
                totoTata.setAge(line.toInteger())
            } else {
                throw new RuntimeException("Aperson text file should only have 3 lines")
            }
        }

        printf("totoTata = %s \n", totoTata)

    }
}
