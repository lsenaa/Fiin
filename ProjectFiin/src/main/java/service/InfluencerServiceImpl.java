package service;


import dao.InfluencerDao;
import dao.InfluencerDaoImpl;
import dto.Influencer;

public class InfluencerServiceImpl implements InfluencerService {

  private InfluencerDao influencerDao;

  public InfluencerServiceImpl() {
    influencerDao = new InfluencerDaoImpl();
  }

  @Override
  public Influencer register(Influencer inf) throws Exception {

//    Member smember = memberDao.selectMember(member.getId());
//    if(smember!=null) throw new Exception("아이디 중복 오류");
//    memberDao.insertMember(member);

//    Influencer inff = influencerDao.registerInfluencer(inf.);

    influencerDao.registerInfluencer(inf);
    //dao에 데이터를 넣으면 끝 맞는지?
    return inf;

  }
}
