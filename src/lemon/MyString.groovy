package lemon


/**
 * 字符串
 *
 * groovy里面有两种String类型，一种是原生的String类型，一种是GString
 *
 * groovy会自动进行String和GString两个类型之间转化，可以把他们当成一个类型看待
 *
 */
//单引号定义
def name = 'android'

//三个单引号定义, 这种方式可以跨行显示，原始的java需要使用手动添加换行符
def sayHello = '''
    one line
    two line 
    three line
'''
println sayHello

//双引号的定义，可以当做变量给其他地方使用
def sayHello2 = "hello ${name}"
println sayHello2

//org.codehaus.groovy.runtime.GStringImpl
println sayHello2.class

def a = "hello"
//java.lang.String
println a.class


def sum = "the sum of 2 and 3 equals ${2 + 3}"
println sum