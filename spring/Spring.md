# Spring

## 1、Spring Framework 系统架构

![image-20240209203232679](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209203232679.png)

![image-20240209203354995](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209203354995.png)



## 2、核心概念

- 问题

![image-20240209210237736](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209210237736.png)

如上图，再实现了一个接口 BookImpl2,需要修改左侧的对象，导致耦合度偏高



![image-20240209210527824](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209210527824.png)

因此去掉 new……，可以降低耦合度，

但此时还不能运行，因为没有创建对象



**解决方案**：使用对象时，在程序中不要主动使用new产生对象，转换为由**外部**提供对象

即

**IoC** 

![image-20240209211255407](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209211255407.png)



![image-20240209211503726](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209211503726.png)

如果IoC的两个对象存在依赖关系，可以进行绑定



这些的目标都是为了**充分解耦**

![image-20240209211859710](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209211859710.png)



## 2、IoC

![image-20240209213809927](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209213809927.png)



* 先在pom导坐标

  ![image-20240209214155677](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209214155677.png)

  

- 刷新maven，在resource，创建spring配置

- 配置bean

  ![image-20240209214708207](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209214708207.png)

  

  

  

- 程序

  - 获取IoC对象

    ![image-20240209215136728](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209215136728.png)

    （ApplicationContext是一个接口，不能直接创建对象，要创建它的实现类）

    此时创建了一个容器

    还需要把配置文件导入进去

    ![image-20240209215325345](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209215325345.png)

  - 获取bean

    ![image-20240209215415422](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209215415422.png)

    里面的参数是在配置文件中的id

    此时就得到了一个对象

  - 定义对象

    ![image-20240209215653364](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209215653364.png)

小节

![image-20240209215856589](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209215856589.png)

![image-20240209215906776](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209215906776.png)

![image-20240209215920441](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209215920441.png)

![image-20240209215935852](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209215935852.png)





## 3、DI

![image-20240209225824797](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209225824797.png)

- 删除业务层中使用new的方式创建的dao对象

  ![image-20240209230430826](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209230430826.png)

- 提供对应的set方法

  ![image-20240209230513347](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209230513347.png)

  上面是在service中引入dao

  所以

- 配置service与dao的关系

  ![image-20240209230845124](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209230845124.png)

  第一个bookDao是指业务层 即上一张图的 bookDao

  第二个bookDao是指配置文件 即这张图的 id后的bookDao



小节

![image-20240209231719131](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209231719131.png)

![image-20240209231733270](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209231733270.png)

这个set方法是容器执行的

![image-20240209231912773](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209231912773.png)





## 4、bean配置

- bean的基础配置

  ![image-20240209232435345](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209232435345.png)

- 别名

  ![image-20240209232951672](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209232951672.png)

  rt 取了三个别名 相应的要在getbean修改

- bean的作用范围

  spring默认造的bean对象是单例的

  ![image-20240209233455843](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209233455843.png)

  加scope后 可以创多个

![image-20240209233738553](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209233738553.png)



## 5、bean实例化

### （1）构造方法

- spring创建bean的时候，创建的是无参的构造方法

![image-20240209234445859](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209234445859.png)

![image-20240209235430925](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209235430925.png)

### （2）静态工厂

![image-20240209235135815](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209235135815.png)

![image-20240209235359863](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240209235359863.png)

使用静态方法

### （3）实例工厂

![image-20240210085436122](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210085436122.png)

非静态



问题：

![image-20240210085551130](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210085551130.png)



改进：

![image-20240210090239364](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210090239364.png)



## 6、bean生命周期

1、

- bean生命周期：bean从创建到销毁的整体过程
- bean生命周期控制：在bean创建后到销毁前做一些事情

2、**配置法**

（1）暴力关闭

![image-20240210091648836](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210091648836.png)

![image-20240210091628249](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210091628249.png)

![image-20240210091526978](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210091526978.png)

但最终执行了init ，没有执行destroy，因为在执行destroy前，Java虚拟机已经退出了



改进：

![image-20240210094321533](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210094321533.png)

在虚拟机关闭前，关闭容器

（2）关闭钩子

![image-20240210094445406](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210094445406.png)



3、**接口控制法**

![image-20240210095222916](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210095222916.png)



4、bean初始化过程经历的阶段

![image-20240210095853180](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210095853180.png)

![image-20240210095939865](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210095939865.png)



## 7、依赖注入方式

- 普通方法(set方法)

- 构造方法

  

问题：依赖注入描述了在容器中建立bean与bean之间依赖关系的过程，但如果bean运行需要的是数字或字符串？

因此将注入的数据类型分为

- 引用类型
- 简单类型（基本数据类型，string）



===>

![image-20240210114701197](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210114701197.png)



**（1）setter注入   引用类型**

![image-20240210115054551](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210115054551.png)

**(2) setter注入  简单类型**

![image-20240210115747851](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210115747851.png)

**(3)构造器注入  引用类型**

![image-20240210171912972](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210171912972.png)

![image-20240210171833895](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210171833895.png)



这张图中的 name 的bookDao指的是上张图中构造方法中的形参

**（4）构造器注入  简单类型**

- 根据name

![image-20240210172224023](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210172224023.png)

![image-20240210172304687](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210172304687.png)

但用这种方法，要求形参的名和配置文件中的name一样，耦合度高

- 根据类型

用下面方法

![image-20240210172515886](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210172515886.png)



- 根据索引

  ![image-20240210172709889](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210172709889.png)

  

![image-20240210172946801](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210172946801.png)



## 8、依赖自动装配

**含义**

- IoC容器根据bean所依赖的资源在容器中自动查找并注入到bean中的过程



**方式**

- 按类型
- 名称
- 构造方法
- 不启用自动装配



**byType**

![image-20240210175805283](D:\cs学习\JAVA\spring\image-20240210175805283.png)

![image-20240210175903255](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210175903255.png)



**byName**

![image-20240210180724134](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210180724134.png)

![image-20240210180744722](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210180744722.png)

byName 通过的是上张图的set后面的内容，首字母大写（按照规范写法，即BookDao 后的bookDao）



![image-20240210181113313](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210181113313.png)



## 9、集合注入

**（1）数组**

![image-20240210204724078](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210204724078.png)

**（2）List**

![image-20240210204807738](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210204807738.png)

**（3）Set**

![image-20240210204845646](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210204845646.png)

**（4）Map**

![image-20240210204924656](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210204924656.png)

**（5）Properties**

![image-20240210204954763](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210204954763.png)





## 10、数据源对象管理

![image-20240210234519339](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210234519339.png)

![image-20240210234858434](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210234858434.png)

![image-20240210235101897](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240210235101897.png)

但一般会另外写一个properties文件，来保存url，username，所以





## 11、加载properties

- 开启context命名空间

![image-20240211094029290](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211094029290.png)

- 加载properties文件

  ![image-20240211094403306](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211094403306.png)

- 使用属性占位符读取properties文件中的属性

  ![image-20240211094623884](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211094623884.png)



但如果是这样

![image-20240211101417539](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211101417539.png)

会优先加载系统变量的username

![image-20240211101827199](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211101827199.png)、

加个never就可以避免了





![image-20240211101923786](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211101923786.png)

可以加载多个properties文件



但最好的方式是星号

![image-20240211102024664](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211102024664.png)



**规范格式**

![image-20240211102129636](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211102129636.png)



## 12、容器

- 创建容器的两种方法：

  - 加载类路径
  - 加载绝对路径

  ![image-20240211103133707](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211103133707.png)

![image-20240211103345497](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211103345497.png)



- 获取bean的方式

  ![image-20240211103453711](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211103453711.png)

  

![image-20240211104156870](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211104156870.png)



![image-20240211104742028](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211104742028.png)

lazy-init 控制bean延迟加载





## 13、注解开发

- 使用@Component定义bean，在右侧加括号可以写id，不加括号getbean的时候要按类型

![image-20240211124548995](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211124548995.png)

在相应的类写注解，可以替代配置文件中相应的bean

![image-20240211124629568](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211124629568.png)

（就不用再写bean了）

但是要补充下面的

![image-20240211124853195](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211124853195.png)

![image-20240211125150183](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211125150183.png)



![image-20240211125311170](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211125311170.png)





## 14、纯注解开发

- 建一个配置类

![image-20240211201740616](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211201740616.png)

![image-20240211201938705](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211201938705.png)

![image-20240211202109926](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211202109926.png)

纯注解不需要加载配置文件，而是加载配置类



## 15、注解开发-bean管理

- bean的作用范围

![image-20240211212748399](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211212748399.png)

将scope的singleton改为prototype 将单例改为多例



- bean的生命周期

![image-20240211213018609](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211213018609.png)



## 16、注解开发-依赖注入

- 自动装配

**（1）引用类型**

![image-20240211213943322](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211213943322.png)

默认是按类型装配



此时如果由两个类型相同的类，就会报错



因此按名称装配

![image-20240211214715324](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211214715324.png)

![image-20240211214726506](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211214726506.png)

![image-20240211215001504](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211215001504.png)

会注入和这张图中BookDao后面变量名相同的类

或者



![image-20240211215119550](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211215119550.png)

用@Q来决定注入的类





![image-20240211215237993](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211215237993.png)





**（2）简单类型**

- 

![image-20240211215425250](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211215425250.png)



- 加载配置文件的方法

![image-20240211215629019](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211215629019.png)

![image-20240211215655292](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211215655292.png)

![image-20240211215711810](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211215711810.png)



如果要加载多个数据源，要用数组形式

![image-20240211215833036](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211215833036.png)

但不支持使用通配符*





## 17、第三方bean管理

- 创建第三方bean

![image-20240211220351344](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211220351344.png)

![image-20240211220416151](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211220416151.png)



但是一般用专门的类来管理配置类

所以新建一个jdbcconfig

![image-20240211220912953](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211220912953.png)

（想import多个，用数组）

![image-20240211221154487](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211221154487.png)



简单类型注入

![image-20240211221649872](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211221649872.png)



引用类型

![image-20240211222143713](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211222143713.png)



小结

![image-20240211222455467](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240211222455467.png)





## 18、Spring整合MyBatis

 ![image-20240212101216267](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212101216267.png)

**核心对象是sqlsessionfactory**



![image-20240212101500536](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212101500536.png)





- pom文件

  ![image-20240212101840126](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212101840126.png)

  

![image-20240212102031633](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212102031633.png)

 

- 配置类

![image-20240212102649160](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212102649160.png)

![image-20240212111310191](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212111310191.png)

![image-20240212111411902](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212111411902.png)



- MybatisConfig

  ![image-20240212111740920](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212111740920.png)

  ![image-20240212112328932](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212112328932.png)

  在sqlmapconfig找配置



![image-20240212112614446](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212112614446.png)



完成这些后，sqlMapConfig文件就可以删了





## 19、Spring整合JUnit

- 导依赖

  ![image-20240212113246994](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212113246994.png)

  

- 设置类运行器

  ![image-20240212114325390](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212114325390.png)





junit就是测试





## 20、AOP

![image-20240212142132970](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212142132970.png)



- 切入点可以增加追加功能

![image-20240212143037973](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212143037973.png)



![image-20240212143159927](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212143159927.png)





- 导坐标

  ![image-20240212160659356](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212160659356.png)

- ![image-20240212160903117](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212160903117.png)

- 方法

  ![image-20240212161007606](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212161007606.png)

- 定义切入点

  ![image-20240212161151218](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212161151218.png)

- 绑定关系

  ![image-20240212163120135](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163120135.png)

- ![image-20240212163304386](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163304386.png)

- ![image-20240212163427077](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163427077.png)





小结

![image-20240212163635420](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163635420.png)

![image-20240212163648530](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163648530.png)

![image-20240212163657317](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163657317.png)

![image-20240212163707629](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163707629.png)

![image-20240212163749740](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163749740.png)

![image-20240212163804776](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163804776.png)

![image-20240212163813331](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212163813331.png)





## 21、AOP工作流程

![image-20240212172836489](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212172836489.png)

上图中只有第二个切入点读取

![image-20240212173207926](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212173207926.png)



![image-20240212173445222](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212173445222.png)



## 22、AOP切入点表达式

![image-20240212182827732](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212182827732.png)



![image-20240212194247779](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212194247779.png)

![image-20240212194409429](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212194409429.png)

![image-20240212195457255](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212195457255.png)

eg.![image-20240212195828858](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212195828858.png)





## 23、AOP通知类型

![image-20240212202748952](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212202748952.png)

![image-20240212203159642](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212203159642.png)



- around

  - void

    ![image-20240212211036092](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212211036092.png)

  ![image-20240212210731119](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212210731119.png)

  - 非void（通式）

    ![image-20240212211114549](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212211114549.png)

  

- afterreturning

![image-20240212211238538](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212211238538.png)

如果原操作抛异常，这个方法就不能正常运行，但是after可以

- afterthrowing

  ![image-20240212211657632](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212211657632.png)

  抛异常才运行



![image-20240212211819005](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212211819005.png)





案例

![image-20240212221822345](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212221822345.png)

![image-20240212221842877](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212221842877.png)

![image-20240212221857310](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212221857310.png)

 ![image-20240212221950183](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212221950183.png)

![image-20240212222006878](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212222006878.png)

![image-20240212222021658](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212222021658.png)

![image-20240212222035929](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212222035929.png)

![image-20240212222101353](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212222101353.png)

![image-20240212222548233](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212222548233.png)

 

改良：

![image-20240212223117228](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212223117228.png)





## 24、AOP通知获取数据

![image-20240212223357965](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212223357965.png)

![image-20240212223602556](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212223602556.png)



![image-20240212224227519](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212224227519.png)

args[0]是自己加的，下一行proceed会对修改后的args进行操作





![image-20240212224813002](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212224813002.png)





![image-20240212224943139](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212224943139.png)

![image-20240212224957280](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212224957280.png)

![image-20240212225015816](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212225015816.png)





案例

![image-20240212231557746](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212231557746.png)





## 25、Spring事务

![image-20240212231840997](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212231840997.png)



![image-20240212231938667](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212231938667.png)

![image-20240212232302036](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212232302036.png)



![image-20240212232715785](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212232715785.png)

![image-20240212232809153](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212232809153.png)

![image-20240212232856364](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212232856364.png)





## 26、事务角色

![image-20240212233227517](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212233227517.png)





## 27、事务相关配置

![image-20240212234214208](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212234214208.png)



![image-20240212235417827](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212235417827.png)

![image-20240212235628913](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212235628913.png)

![image-20240212235644173](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240212235644173.png)





# SpringMVC

## 1、简介

![image-20240214194034457](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240214194034457.png)





![image-20240214194054879](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240214194054879.png)





![image-20240214194232294](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240214194232294.png)



![image-20240214194436799](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240214194436799.png)





## 2、入门案例

![image-20240214194527169](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240214194527169.png)

![image-20240214194552199](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240214194552199.png)

![image-20240214194703900](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240214194703900.png)

![image-20240214194741251](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240214194741251.png)





![image-20240214205836014](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240214205836014.png)





![image-20240215091313569](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240215091313569.png)





## 3、bean加载控制

![image-20240215091741425](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240215091741425.png)





1、过滤

![image-20240215105222661](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240215105222661.png)

或

![image-20240215105145368](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240215105145368.png)





2、

![image-20240215105856999](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240215105856999.png)

修改webapplicationcontext

让springmvc和spring各自加载各自的配置文件







![image-20240215110940042](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240215110940042.png)

或

![image-20240215111211624](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240215111211624.png)





## 4、PostMan



## 5、请求与响应

### （1）请求映射路径

![image-20240216112541193](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240216112541193.png)

![image-20240216112556579](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240216112556579.png)

![image-20240216112608809](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240216112608809.png)







法二：

![image-20240216112731914](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240216112731914.png)





## （2）请求方式

- Get请求
  - 一个参数

![image-20240216174701734](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240216174701734.png)

   多个参数

![image-20240216174959061](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240216174959061.png)



- Post请求

![image-20240216175223146](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240216175223146.png)

处理中文乱码

![image-20240216181915017](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240216181915017.png)





## 6、请求参数

- 普通参数

  ![image-20240218092653971](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218092653971.png)

  ![image-20240218093023054](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218093023054.png)

- 数组参数

  ![image-20240218103934404](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218103934404.png)

- pojo

  ![image-20240218104910442](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218104910442.png)

- 嵌套pojo

  ![image-20240218104927885](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218104927885.png)

- 集合参数

  ![image-20240218104956478](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218104956478.png)



- 传递json数据

  ![image-20240218154056227](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218154056227.png)

  

![image-20240218154712646](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218154712646.png)



```java
    //集合参数:json格式
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("list common(json)参数传递：" + likes);
        return  "{'module':'list common for json param'}";
    }

    //POJO参数:json格式
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo(json)参数传递：" + user);
        return  "{'module':'pojo for json param'}";
    }

    //集合pojo参数:json格式
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("pojo(json)参数传递：" + list);
        return  "{'module':'list pojo for json param'}";
    }
```

![image-20240218184651333](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218184651333.png)





![image-20240218184755180](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218184755180.png)





- 日期类型参数传递

  ![image-20240218191346464](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218191346464.png)

  ![image-20240218191634897](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218191634897.png)

  

## 7、响应

![image-20240218212916944](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240218212916944.png)



## 8、REST风格

![image-20240220105807568](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220105807568.png)

![image-20240220105912203](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220105912203.png)





![image-20240220124719295](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220124719295.png)

![image-20240220124806938](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220124806938.png)





![image-20240220143039218](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220143039218.png)

![image-20240220143057682](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220143057682.png)

![image-20240220143131104](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220143131104.png)

![image-20240220143215788](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220143215788.png)



- 快速开发

  ![image-20240220145531912](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220145531912.png)

  ![image-20240220145624708](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220145624708.png)

  

![image-20240220145846144](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220145846144.png)





![image-20240220145927798](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240220145927798.png)





![image-20240222004916295](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240222004916295.png)

![image-20240222004950624](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240222004950624.png)

![image-20240222005029965](C:\Users\77507\AppData\Roaming\Typora\typora-user-images\image-20240222005029965.png)

