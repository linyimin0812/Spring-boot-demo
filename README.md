## Mybatis generator 生成代码的使用

在文件夹src/main/java/resources下修改mybatisGeneratorinit.properties文件下指定相关配置信息；
默认下generator生成的Mapper类和xml文件在\src\main\java\com\example\demo\dao文件下，实体类在
\src\main\java\com\example\demo\model文件夹下；

注：要是用生成的Mapper类，要先在生成的Mapper类前加上注解@Repository
```java
    @Repository
    public interface MemberMapper {
    }
```

然后在入口类或调用类前添加注解@MapperScan(basePackage="Mapper所在包路径")
```java
    @MapperScan(basePackages ="com.example.demo.dao")
    public class DemoApplication {
    	public static void main(String[] args) {
    		SpringApplication.run(DemoApplication.class, args);
    	}
    }
```



## log4j2的使用
### 配置
log4j2的配置文件为log4j2.xml在文件夹/src/main/resources/下，为某个类配置日志:

1.在\<appenders>\</appenders>标签下添加一下内容
```xml
<appenders>
    <!--日志记录追加器-->
    <RollingFile name="myRollingFile" fileName="./logs/my.log"
        filePattern="logs/$${date:yyyy-MM}/api-%d{yyyy-MM-dd}-%i.log.gz">
        <PatternLayout pattern="[%d{yyyy-MM-dd HH:mm:ss}] %-5level %L %M - %msg%xEx%n"/>
        <Policies>
            <SizeBasedTriggeringPolicy size="500 MB"/>
            <TimeBasedTriggeringPolicy/>
        </Policies>
    </RollingFile>
</appenders>
```
以上的配置表示指定日志追加器myRollingFile，日志的内容记录在logs/my.log文件中，当日志文件的大小超过500MB时以时间归档打包.

2.在\<loggers>\<loggers>标签下添加以下的配置内容
```xml
<loggers>
    <logger name="com.example.demo.DemoApplication" level="debug" additivity="false">
        <appender-ref ref="myRollingFile"/>
    </logger>
</loggers>
```
其中，name的内容指定某个类使用该日志配置，level表示日志的级别(debug info warn error), additivity为true表示日志内容依旧
在concole端显示。ref的内容和第一步中的name名字相同。

3.分页的使用
```java
import com.github.pagehelper.PageHelper;
public class Test{
    public List<Member> Hello(){
        MemberExample example= new MemberExample();
        example.createCriteria().andMemberIdBetween(120L,200L);
        System.out .println(memberMapper.selectByExample(example).size());
        PageHelper.startPage(1,5);
    	List<Member> member = memberMapper.selectByExample(example);
        logger.info("test:info");
        logger.debug("debug");
    	return member;
    }
}
```

4.log4j2的使用
```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoApplication {
    private static final Logger logger = LogManager.getLogger(DemoApplication.class);
    public function test(){
        logger.info(o);
        logger.error(o);
    }
}
```

5.使用swagger
- 在application.properties配置文件中完成相关配置
- swagger相关注解的使用
```java
@RestController
@RequestMapping("/user")
public class UserController {
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParams({
             @ApiImplicitParam(name = "username", value = "User's name", required = true, dataType = "Long", paramType = "path"),
    })
    @ApiResponses(value = {
             @ApiResponse(code = 400, message = "Invalid ID supplied"),
             @ApiResponse(code = 404, message = "Pet not found")
    })
    @RequestMapping(method=RequestMethod.GET, path="/{username}")
    public String Hello( @PathVariable Long username){
        return "Hello World";
    }
}
```
然后访问：http://localhost:8080/swagger-ui.html即可看到对应的API信息


