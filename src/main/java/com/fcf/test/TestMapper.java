/*
 * Delta CONFIDENTIAL
 *
 * (C) Copyright Delta Electronics, Inc. 2016 All Rights Reserved
 *
 * NOTICE:  All information contained herein is, and remains the
 * property of Delta Electronics. The intellectual and technical
 * concepts contained herein are proprietary to Delta Electronics
 * and are protected by trade secret, patent law or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Delta Electronics.
 */

package com.fcf.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import com.taotao.mapper.TScmSmtConfigureMapper;
import com.taotao.pojo.TScmSmtConfigure;
import com.taotao.pojo.TScmSmtConfigureExample;
import com.taotao.pojo.TScmSmtConfigureExample.Criteria;

/**
 * @author V.Caifeng.Fan
 * @param <E>
 *            db entity
 * @param <I>
 *            dao interface
 *
 */
public class TestMapper {

	 private static final String resource = "mybatis_config.xml";
	//private static final String resource = "mybatis_config_druid.xml";


	private SqlSessionFactory sqlSessionFactory;

	public TestMapper() {

		initSqlSessionFactory();
	}


	private void initSqlSessionFactory() {

		InputStream inputStream = null;
		if (sqlSessionFactory == null) {
			synchronized (SqlSessionFactory.class) {
				if (sqlSessionFactory == null) {
					try {
						inputStream = Resources.getResourceAsStream(resource);
					} catch (IOException e) {
						e.printStackTrace();
					}
					sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				}
			}
		}
	}

	@Test
	public void test(){
		initSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		try {
			MapperHelper mapperHelper = new MapperHelper();
			//特殊配置
			//Config config = new Config();
			//具体支持的参数看后面的文档
			//config.setXXX(XXX);
			//设置配置
			//mapperHelper.setConfig(config);
			// 注册自己项目中使用的通用Mapper接口，这里没有默认值，必须手动注册
			mapperHelper.registerMapper(Mapper.class);
			//配置完成后，执行下面的操作
			mapperHelper.processConfiguration(session.getConfiguration());
			TScmSmtConfigureMapper mapper = session.getMapper(TScmSmtConfigureMapper.class);
			
			TScmSmtConfigureExample example = new TScmSmtConfigureExample();
			Criteria createCriteria = example.createCriteria();
			createCriteria.andMachineNameEqualTo("回焊炉_5");
			
	        //分页处理，显示第一页的10条数据
			TScmSmtConfigure scm = new TScmSmtConfigure();
			scm.setId(170);
			scm.setLineType("test");
			scm.setLineNumber("testNum");
			scm.setMachineName("回焊炉_2");
			scm.setLastUpdateDate(new Date());
			//PageHelper.startPage(1, 3).setOrderBy("id");
			//List<TScmSmtConfigure> selectByExample = mapper.selectByExample(example);
			//mapper.updateByPrimaryKeySelective(config);
	       // TScmSmtConfigure list = mapper.selectByPrimaryKey(169);//查询
			mapper.updateByExampleSelective(scm, example);
			
			session.commit();
		} catch (Exception e1) {
			session.rollback();
			e1.printStackTrace();
		} finally {
			session.close();
		}
		
	}

}
