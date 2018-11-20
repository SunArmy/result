main 
     java 
           com.example.result
                            controller  实现添加后缀和通过参数改变返回格式的方式
                            
                                    @PostMapping("/login")
                                        public ResponseResult login(String username,String password){
                                            if ("admin".equals(username) || "123456".equals(password)){
                                                User user = new User();
                                                user.setUsername(username);
                                                user.setPassword(password);
                                                user.setCity("中国");
                                                user.setSex("男");
                                                return new ResponseResult().setData(user);
                                            }else {
                                                return new ResponseResult("000000");
                                            }
                                        }
                            model  实体类
                            
                            Result   返回对象
                            
                            WebMvcConfig   通过代码配置的配置类    根据需要把注释放开即可
                            
                            
      resources 
                application.yml    配置文件