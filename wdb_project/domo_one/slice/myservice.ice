[["java:package:com.dy.test"]]
module demo{   //module demo模块名,module和Java的Package是对应的,当前默认package是demo
                //如果需要生成和Java对应的package的话,在module上面新增[["java:package:com.my.demo"]]即可,包名为com.my.demo.demo
    interface MyService{
        string hello();
    };
};