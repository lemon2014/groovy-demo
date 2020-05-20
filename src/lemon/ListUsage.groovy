package lemon

// java的定义方式
def list = new ArrayList()

// groovy的定义方式
def list1 = [1, 2, 3, 4, 5]
println list1.class
println list1.size()

// 数组的定义方式 两种
// 原始类型的定义
int[] array = [1,2,3]

// 使用as进行转化
def array3 = [1,2,3] as int[]




