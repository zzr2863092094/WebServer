此版本开始完成响应客户端一个页面的操作
通过这个版本我们要了解两个知识点：
1：页面的构成，HTML基础语法
2：HTTP响应内容

首先创建一个页面
实现
1：在项目目录下新建一个目录webapps
   这个目录用于存放当前服务端所有部署网络应用，每个网络应用一个子目录放在
   webapps下，并且子目录的名字就是该网络的名字.(tomcat也是这样管理的)
2：在webapps下新建一个目录：myweb，作为我们第一个网络应用（网站内容）
3：在myweb下新建首页：index.html


在ClientHandler中将一个页面以标准的HTTP响应格式发送给浏览器
实现：
在ClientHandler第三步响应客户端循环，先将固定的一个页面webapps/myweb/index.html发送给浏览器
去显示。
