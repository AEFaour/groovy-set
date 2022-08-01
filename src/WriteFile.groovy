class WriteFile {
    static void main(String[] args) {

        File file = new File("resources/titi-tyty.txt")

        file.withWriter("UTF-8") {writer ->
            writer.writeLine("Titi")
            writer.writeLine("Tyty")
            writer.writeLine("52")
        }

        file.append("#")

        file << "#"

        Person teteTutu = new Person(firstName: "Tete", lastName: "Tutu", age: 60)
        File teteFile = new File("resources/tete-tutu.bin")
        teteFile.withObjectOutputStream {out -> out.writeObject(teteTutu)}

    }
}
