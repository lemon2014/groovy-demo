package lemon.object

/**
 * groovy中默认都是public
 */
class Person {
    String name
    Integer age

    def increaseAge(Integer years) {
        this.name += years
    }
}
