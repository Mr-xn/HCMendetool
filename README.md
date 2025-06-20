# HCMendetool
HCM宏景加解密工具
# 编译

```
javac HCMendetool.java
jar cef HCMendetool HCMendetool.jar HCMendetool.class
```

# 使用

```
➜  src java HCMendetoolCli -ec "1'waitfor delay'0:0:5'-- " | xargs java HCMendetoolCli -dc
1'waitfor delay'0:0:5'-- 
➜  src java HCMendetoolCli -e "1'waitfor delay'0:0:5'-- " | xargs java HCMendetoolCli -dc 
SPAATTP2HJFPAATTPJPAATTP2HJFPAATTPHNvno3W9Sm3WBgDEqPAATTP2HJFPAATTPWzCGPAATTP2HJBPAATTPS0TBXpcPpPAATTP2HJFPAATTP79l7h8PAATTP3HJDPAATTP
➜  src java HCMendetoolCli -e "1'waitfor delay'0:0:5'-- " | xargs java HCMendetoolCli -d 
1'waitfor delay'0:0:5'-- 
➜  src java HCMendetoolCli -eec "1'waitfor delay'0:0:5'-- " | xargs java HCMendetoolCli -d
1'waitfor delay'0:0:5'-- 
➜  src java HCMendetoolCli -eec "1'waitfor delay'0:0:5'-- " | xargs java HCMendetoolCli -dc
SPAATTP2HJFPAATTPJPAATTP2HJFPAATTPHNvno3W9Sm3WBgDEqPAATTP2HJFPAATTPWzCGPAATTP2HJBPAATTPS0TBXpcPpPAATTP2HJFPAATTP79l7h8PAATTP3HJDPAATTP
➜  src java HCMendetoolCli -eec "1'waitfor delay'0:0:5'-- " | xargs java HCMendetoolCli -d 
1'waitfor delay'0:0:5'-- 
➜  src java HCMendetoolCli -eec "1'waitfor delay'0:0:5'-- "                               
SPAATTP~32HJFPAATTPJPAATTP~32HJFPAATTPHNvno~33W~39Sm~33WBgDEqPAATTP~32HJFPAATTPWzCGPAATTP~32HJBPAATTPS~30TBXpcPpPAATTP~32HJFPAATTP~37~39l~37h~38PAATTP~33HJDPAATTP
➜  src java HCMendetoolCli -eec "1'waitfor delay'0:0:5'-- "                               
SPAATTP~32HJFPAATTPJPAATTP~32HJFPAATTPHNvno~33W~39Sm~33WBgDEqPAATTP~32HJFPAATTPWzCGPAATTP~32HJBPAATTPS~30TBXpcPpPAATTP~32HJFPAATTP~37~39l~37h~38PAATTP~33HJDPAATTP
➜  src java HCMendetoolCli -ec "1'waitfor delay'0:0:5'-- " 
~31~27waitfor~20delay~27~30~3a~30~3a~35~27~2d~2d~20
➜  src java HCMendetoolCli -e "1'waitfor delay'0:0:5'-- " 
SPAATTP2HJFPAATTPJPAATTP2HJFPAATTPHNvno3W9Sm3WBgDEqPAATTP2HJFPAATTPWzCGPAATTP2HJBPAATTPS0TBXpcPpPAATTP2HJFPAATTP79l7h8PAATTP3HJDPAATTP

```

# 效果
![image](https://github.com/Mr-xn/HCMendetool/assets/18260135/f0362eef-f48f-45c7-8854-84eb63e00397)

![image](https://github.com/Mr-xn/HCMendetool/assets/18260135/e7a7ddcc-b004-4bda-b19b-f68932c96fe7)
