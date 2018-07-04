package com.jason.mybatis;

import com.jason.mybatis.entity.MemoGroup;
import com.jason.mybatis.mapper.MemoGroupMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;


public class MybatisApplication {

    private static SqlSessionFactory sqlSessionFactory;

    public static void buildSqlSessionFactoryWithXml() {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(
                            // 使用MyBatis包含的一个工具类，获得classpath来加载"mybatis-config.xml"
                            Resources.getResourceAsReader("mybatis-config.xml")
                    );
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sqlSessionFactory);
    }


    public static void main(String[] args) {
        buildSqlSessionFactoryWithXml();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //MemoGroup memoGroup = new MemoGroup();
        //memoGroup.setName("Mybatis2");
        //memoGroup.setCreatedTime(new Date());


        MemoGroupMapper memoGroupMapper = sqlSession.getMapper(MemoGroupMapper.class);

        //int effect = memoGroupMapper.insertMemoGroup(memoGroup);
        //System.out.println(effect);
        MemoGroup memoGroup1 = memoGroupMapper.selectMemoGroup(2);
        System.out.println(memoGroup1);

        sqlSession.close();

    }
}
