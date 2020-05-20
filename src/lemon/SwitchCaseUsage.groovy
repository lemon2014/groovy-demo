package lemon

//针对swatch做了增强，没有类型限制

def x = 15
def result
switch (x){
    case 'foo':
        result = 'found foo'
        break
    case [4,5,6,'inlist']: //重点是这里，列表的定义，太简洁了
        result = 'list'
        break
    case 12..30: //范围，一种全新的类型
        result = 'range'
        break
    case Integer:
        result = 'integer'
        break
    default:
        result = 'default'
}
println result

//groovy.lang.IntRange
def range = 1..30
println range.class
