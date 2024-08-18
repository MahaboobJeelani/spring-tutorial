package org.jsp.springormdemo.dao;

import javax.transaction.Transactional;

import org.jsp.springormdemo.dto.Merchant;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class MerchantDao {
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional
	public Merchant saveMerchant(Merchant merchant) {
		template.save(merchant);
		return merchant;
	}

	@Transactional
	public Merchant updateMerchant(Merchant merchant) {
		Merchant m = template.get(Merchant.class, merchant.getId());
		if (m != null) {
			m.setEmail(merchant.getEmail());
			m.setName(merchant.getName());
			m.setGst_number(merchant.getGst_number());
			m.setPhone(merchant.getPhone());
			m.setPassword(merchant.getPassword());
			return m;
		}
		return null;
	}

	public Merchant findbyid(int id) {
		return template.get(Merchant.class, id);
	}

	@Transactional
	public boolean deletebyid(int id) {
		Merchant m = findbyid(id);
		if (m != null) {
			template.delete(m);
			return true;
		}
		return false;
	}
}
