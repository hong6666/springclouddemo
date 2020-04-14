# springclouddemo
springcloulddemo

学习连接 
[http://blog.didispace.com/spring-cloud-starter-dalston-1](http://blog.didispace.com/spring-cloud-starter-dalston-1/)

##spring cloud consul
由于Spring Cloud在服务发现这一层做了非常好的抽象，所以，对于上面的程序，我们可以无缝的从eureka的服务治理体系切换到consul的服务治理体系中区。
以之前实现的基于Eureka的示例（eureka-client）为基础，我们如何将之前实现的服务提供者注册到Consul上呢？方法非常简单，我们只需要在pom.xml中将eureka的依赖修改为如下依赖

```
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-consul-discovery</artifactId>
</dependency>
```
接下来再修改一下application.properites，将consul需要的配置信息加入即可，比如：（下面配置是默认值）
```
spring.cloud.consul.host=localhost
spring.cloud.consul.port=8500
```
可以不启用SpringcloulddemoApplication
先下载consul,windows64,配置一下环境，启动consul开发模式，
```
consul agent -dev
```
然后启动服务提供者，也就是我们修改之后的eureka client
访问localhost:8500
就会显示ui界面