package dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dto.Advertiser;
import util.MybatisSqlSessionFactory;

public class AdvertiserDaoImpl implements AdvertiserDao {
	private SqlSession sqlsession;
	public AdvertiserDaoImpl() {
		sqlsession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
	}
	
	@Override
	public void insertAdvertiser(Advertiser advertiser) throws Exception {
		sqlsession.insert("mapper.advertiser.insertAdvertiser", advertiser);
		sqlsession.commit();
	}

	@Override
	public Advertiser selectAdvertiser(Integer advertiserNum) throws Exception {
		return sqlsession.selectOne("mapper.advertiser.selectAdvertiser", advertiserNum);
	}

	@Override
	public void updateAdvertiser(Advertiser advertiser) throws Exception {
		sqlsession.update("mapper.advertiser.updateAdvertiser", advertiser);
		sqlsession.commit();
	}

	@Override
	public Advertiser selectAdvertiserByEmail(String userEmail) throws Exception {
		return sqlsession.selectOne("mapper.advertiser.selectAdvertiserByEmail", userEmail);
	}

	@Override
	public Advertiser selectAdvertiserForFindEmail(String name, String mobileNumber) throws Exception {
		Map<String, String> param = new HashMap<>();
		param.put("name", name);
		param.put("mobileNumber", mobileNumber);
		return sqlsession.selectOne("mapper.advertiser.selectAdvertiserForFindEmail", param);
	}

	@Override
	public String selectAdvertiserForFindPassword(String userEmail) throws Exception {
		return sqlsession.selectOne("mapper.advertiser.selectAdvertiserForFindPassword", userEmail);
	}

}
