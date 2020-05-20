package lemon.object

// 需要注意，这里虽然没有定义构造函数，但是可以通过直接传递不同的参数值实例化对象
def person = new Person(name: 'zhansan', age: 23)
def person1 = new Person(name: 'lisi')
println "this name is ${person.name}"
println "this name is ${person1.name}"


// MetaClass 动态的添加类的属性和方法

