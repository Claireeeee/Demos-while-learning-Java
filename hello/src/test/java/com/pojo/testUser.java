package com.pojo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class testUser {
    public static void main(String[] args) {
        //  按ID查询姓名
        String resource="mybatis-config.xml";
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlMapper.openSession();
        User user=session.selectOne("findById",20);
        System.out.println(user.getname());
        session.close();
    }
}