package me.jcala.xmarket.server.repository;


/**
 * 通过MongoTemplate实现MongoRepository难以实现的操作
 */
public interface CustomRepository {
    void updateUserSchool(String id, String school);//通过username更新所在学校的信息
    void updateUserPassword(String id,String password);//修改用户密码
    void updateUserAvatar(String id,String avatar_url);
}