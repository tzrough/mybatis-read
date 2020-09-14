package com.focus.service;

import com.focus.entity.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class PersonService {

    private static SqlSessionFactory sqlSessionFactory;

    public static void main(String[] args) {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();

            List<Person> persons = sqlSession.selectList("selectAll");
            for (int i = 0; i < persons.size(); i++) {
                System.out.println(persons.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
