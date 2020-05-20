package lemon

// 闭包关键变量， 闭包的委托策略   this  owner  delegate

// 1、通常情况下this, owner, delegate 三个对象是一样的
// 2、当闭包A里面再定义闭包B，this还是指向A, owner,delegate 指向B
// 3、当修改了默认的delegate指向, 默认情况下和owner一致, delegate和owner不一致
// 4、this、owner是不能修改的，delegate是可以随意修改的

def myClouser = {
    println "this:" + this
    println "owner:" + owner
    println "delegate:" + delegate
}
myClouser.call()

println '=================================='

class Person{

}

Person p = new Person()
def outerClouser = {
    def innerClouse = {
        println "this:" + this
        println "owner:" + owner
        println "delegate:" + delegate
    }

    // 这里修改了默认的delegate的值
    innerClouse.delegate = p;
    innerClouse.call()
}
outerClouser.call()


