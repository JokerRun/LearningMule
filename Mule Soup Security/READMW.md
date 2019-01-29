本文主要梳理Soap Web Service Security. 

多数内容参考[WSS4J官方文档](http://ws.apache.org/wss4j/) 、[Ussing-WSS4J](http://ws.apache.org/wss4j/using.html) 、[CXF-WS-Secutity](http://cxf.apache.org/docs/ws-security.html)、[Mule-Security-Example](https://docs.mulesoft.com/mule-runtime/3.5/soap-web-service-security-example)。















## Tip1 How to set Dynamic Password

思路： 在CallbackHandler中维护一个Map属性。 每次调用CXF生成安全的Soap报文前，往这个Map中写入username跟password。

> 参考：
>
> [Using Apache WSS4J™ ----Sample Outbound UsernameToken configuration-- ](http://ws.apache.org/wss4j/using.html)
>
> [org.apache.cxf.systest.ws.common.UTPasswordCallback](https://gitbox.apache.org/repos/asf?p=cxf.git;a=blob_plain;f=systests/ws-security/src/test/java/org/apache/cxf/systest/ws/common/UTPasswordCallback.java;hb=HEAD)
>
> 




## 参考

http://cxf.apache.org/docs/ws-security.html

https://docs.mulesoft.com/mule-runtime/3.5/mule-examples

《Mule In Action》
