import groovy.transform.Canonical

@Canonical
class Person implements Serializable {
    String firstName
    String lastName
    int age

    String getFullName() {
        firstName + " " + lastName
    }

}
