# JNA 教程 part 2

## 使用 jnaerator 自动生成JNA代码

虽然使用 JNA 在一定程度上简化了 native 接口的转接代码的编写, 但遇到一些及其复杂的函数, 或者说非常复杂的库时, 工作量往往还是很大. 

于是就出现了一个  [JNAerator](https://github.com/nativelibs4java/JNAerator)
的项目, 它会帮助我们 **自动生成 JNA 代码** , 减少我们的工作量

### 下载与运行

直接下载  [jnaerator-0.12-shaded.jar](https://open-chen.oss-cn-hangzhou.aliyuncs.com/open/2020/08/06/jnaerator-0.12-shaded.jar)

备用链接: https://repo1.maven.org/maven2/com/nativelibs4java/jnaerator/0.12/jnaerator-0.12-shaded.jar

```
// 运行 jar, 会打开一个图形化的界面
java -jar jnaerator-0.12-shaded.jar
```

![](https://open-chen.oss-cn-hangzhou.aliyuncs.com/open/2020/08/06/jnaerator.jpg)

### clion 中 debug

Run -> Attach to Process...

![](https://open-chen.oss-cn-hangzhou.aliyuncs.com/open/2020/08/06/attach_to_process.jpg)


## 问题

### Error looking up function 'max': 找不到指定的程序。

1. 我遇到这个错误的原因是, 我在编译 dll 时, 没有在 header 文件中导出函数 `extern "C" LIBRARY_API `
2. 没有实现 header 文件中的 函数

### DLL 的名称问题

只要 jna 中 `Native.loadLibrary( library_name, xx.class)` 的库名称 和 dll 的名称对应上, 想怎么改名就怎么改名.

###


## 参考

1. jna 中使用指针导致的 memory leak
    - https://stackoverflow.com/questions/9569530/jna-memory-leak
2.



