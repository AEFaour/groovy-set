class ProceesingFiles {

    private static List<Integer> readAllNumbers() {
        File fileFromDir = new File("resources")
        List<Integer> numbers = []

        fileFromDir.eachFile {File file ->
            file.eachLine {
                line ->
                    if(line.isNumber()){
                        numbers << line.toInteger()
                    }
            }
        }

        return numbers
    }
    static void main(String[] args) {

        List<Integer> numbers = readAllNumbers()
        println numbers
        Integer max  = numbers.max()
        assert max == 52
        println max
        Integer sum = numbers.sum()
        println sum
    }
}
