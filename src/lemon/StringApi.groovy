package lemon

def str = 'groovy'

//填充
str = str.padLeft(10, 'a')
println str

//比较,可以直接使用操作符进行字符串的比较 > <
def a = 'groovy'
def b = 'gro'
println a > b

//索引 直接根据索引获取字符串的第一个
println a[0]

//字符串相减
println a - b

println '----------------'

//使用闭包
def aa = 'the 2 and 3 is 5'
aa.each {
    s -> print s + 2
}

println '----------------'

//查找所有的数字，并且返回集合
def list = aa.findAll{
    s -> s.isNumber()
}
println list.toListString()