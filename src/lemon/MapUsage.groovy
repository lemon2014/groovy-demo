package lemon

//def colors = new HashMap()
// 需要注意，这里的key最好使用不可变的单引号定义，默认不写就是单引号
def colors = [
        red  : 'ff00000',
        green: '00ff00',
        blue : '0000ff']

// 这里直接通过数组下标的方式获取map的值
println colors['red']

// 或者直接通过属性方式调用
println colors.red

// 添加元素
colors.yellow = 'ffff00'
println colors.toMapString()

// map中添加map  groovy里面的map的键值可以是任意类型的
colors.complex = [a: 1, b: 2]
println colors.toMapString()






