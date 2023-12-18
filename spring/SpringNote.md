# Spring

## 注解开发依赖注入

### 自动装配

- 使用@Autowired注解开启自动装配模式（按类型）

  ```java
  @Service
  public class BookServiceImpl implements BookService {
      @Autowired
      private BookDao bookDao;
  
      public void setBookDao(BookDao bookDao) {
          this.bookDao = bookDao;
      }
  
      public void save(){
          System.out.println("book service save");
          bookDao.save();
      }
  
  }
  ```

​        自动装配基于反射设计创建对象并暴力反射对应属性为私有属性初始化数据，因此无需提供setter方法

​        自动装配建议使用无参构造方法创建对象，如果不提供相应构造方法，请提供唯一的构造方法



- 使用@Qualifier注解开启指定名称装配bean

  ```java
  @Service
  public class BookServiceImpl implements BookService {
      @Autowired
      private BookDao bookDao;
  
      public void setBookDao(BookDao bookDao) {
          this.bookDao = bookDao;
      }
  
      public void save(){
          System.out.println("book service save");
          bookDao.save();
      }
  
  }
  ```

  @Qualifier注解无法单独使用，必须配合@Autowired注解使用



- 使用@Value实现简单类型注入

  ```java
  @Repository("bookDao")
  public class BookDaoImpl implements BookService {
      @Value("100")
      private String connectionNum
  
  }
  ```



### 加载properties文件

- 使用@PropertySource注解加载properties文件

  ```java
  @Configuration
  @ComponentScan("com.CliPg")
  @PropertySource("classpath:jdbc.properties")
  public class SpringConfig {
  }
  ```

  路径仅支持单一文件配置，多文件请使用数组格式配置`@PropertySource({"classpath:jdbc.properties",...,...})`

  