mybatis 三剑客
====

- mybatis-generator

- mybatis-plugin

- mybatis-pagehelper


# 要求
----

Intellij IDEA 2018.1

Gradle

JDK 1.8 

Mybatis Plugin 3.58

# FAQ
---

解决使用 [ideaagent-1.2.jar](https://github.com/mrshawnho/ideaagent) 注册了 Mybatis Plugin 3.58 之后,idea 编辑器不显示跳转图标的问题.

编辑 `idea.vmoptions` 先去掉 `-javaagent:/Users/youliangzhang/Public/工具/ideaagent-1.2.jar`,启动之后提示还有几天到期,然后再将该语句重新写入到配置文件,重启,即可恢复

效果:

![image](https://raw.githubusercontent.com/zhangyouliang/mybatis-plugin/master/docs/step01.png)



![image](https://raw.githubusercontent.com/zhangyouliang/mybatis-plugin/master/docs/step02.png)





 
