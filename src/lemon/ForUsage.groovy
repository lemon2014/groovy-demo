package lemon


def sum = 0
for (i in 0..9) {
    sum += i
}
println sum

//针对map循环,下面的写法太酸爽了
def res = 0
for(i in ['lili':1, 'zhangsan':2]) {
    res += i.value
}
println res






