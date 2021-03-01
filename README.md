## jingqiduizhang-springcloud
微服务demo

### 注册中心+服务注册
eureka-center-one 注册中心服务端
eureka-server-one 一个服务 注册到注册中心上

### 注册中心高可用
eureka-center-some-one  注册中心高可用
eureka-center-some-two  注册中心高可用

### ribbon 客户端负载均衡器
eureka-center-one          注册中心
eureka-ribbon-service-one  需要调用的服务
eureka-ribbon-service-two  需要调用的服务
eureka-ribbon-client-one ribbon在此文件中配置
