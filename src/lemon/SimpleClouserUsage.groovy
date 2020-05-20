package lemon

// 简单的闭包的使用
def clouser = {println "hello ${it}"}
clouser('groovy')

// 主要是和上面对比，it是隐式参数，当只有一个参数时，可以直接使用it代替，也可以使用下面的方式，自己定义，这样就会屏蔽掉默认的it
def clouser1 = {s -> println "hello ${s}"}
clouser('groovy')

// 不同的调用方式
println '-------------------'
clouser.call('groovy')

// 闭包的不同写法
def str = 'hello java'

//可以将闭包的包体写到括号里面
str.each({s -> print s})

println '-------------------'
// 也可以忽略括号直接写在外面
str.each{s -> print s}


println '-------------------'

// 多个参数的情况,多个参数时，一般会把闭包的参数放到最后面, 同样可以把包体放里面, 也可以把包体放外面
int x = fab(5)
println x

int fab(int number){
    int result = 1
//    1.upto(number, {num -> result *= num})
    1.upto(number){num -> result *= num}
    return result
}

// 常用api  感觉lambda完全和这个一样
def result = str.any{ s -> s.isNumber()}
println result

def list2 = str.collect {it.toUpperCase()}
println list2.toListString()




