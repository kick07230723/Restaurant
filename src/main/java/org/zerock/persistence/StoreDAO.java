package org.zerock.persistence;


import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.StoreVO;



public interface StoreDAO {

	public void create(StoreVO vo);
	public StoreVO read(Integer sno);
	public void update(StoreVO vo);
	public void delete(Integer sno);
	
	public String getTime();
	
	public List<StoreVO> list(Criteria cri);
	
	
}
