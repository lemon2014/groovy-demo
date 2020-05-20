package lemon

/**
 * 闭包的委托策略
 */
class Student {
    String name;
    def pertty = { "my name is ${name}" }

    String toString() {
        pertty.call()
    }
}

class Teacher {
    String name
}

def stu = new Student(name: 'zhangsan')
def tea = new Teacher(name: 'lisi')
println stu.toString()

//修改委托策略, 这里估计要分析源码了,
stu.pertty.delegate = tea
stu.pertty.resolveStrategy = Closure.DELEGATE_FIRST
println stu.toString()
