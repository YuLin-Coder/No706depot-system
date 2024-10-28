package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.dto.DepotcardManagerData;
import com.depot.ex.admin.entity.Depotcard;

/** * 
@author  作者 E-mail: * 
@date 创建时间：2017年11月27日 下午2:15:09 * 
@version 1.0 * 
@parameter  * 
@since  * 
@return  */
public interface DepotcardService {

	List<DepotcardManagerData> findAllDepotcard(String cardnum,int page,int size);

	Depotcard save(DepotcardManagerData depotcardManagerData);

	Depotcard findByCardid(int cardid);

	Depotcard findByCardnum(String cardnum);

	void updateDepotcardBycardnum(Depotcard depotcard);

	void deleteDepotCard(String cardnum);

	void addMoney(String cardnum, double money);

	int findAllDepotcardCount(String cardnum);

	List<DepotcardManagerData> findByCardId(int cardid);

	void updateCardnum(String cardnum, String cardnumNew);



}
