package com.test.action.index;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Arrange;
import com.test.bean.Matter;
import com.test.service.ArrangeService;
import com.test.service.MatterService;

public class IndexAction extends ActionSupport {
	private Arrange arrange;
	private Matter matter;
	

	private ArrangeService arrangeService;
	private MatterService matterService;

	public MatterService getMatterService() {
		return matterService;
	}

	public void setMatterService(MatterService matterService) {
		this.matterService = matterService;
	}

	public Matter getMatter() {
		return matter;
	}

	public void setMatter(Matter matter) {
		this.matter = matter;
	}

	public Arrange getArrange() {
		return arrange;
	}

	public void setArrange(Arrange arrange) {
		this.arrange = arrange;
	}

	public ArrangeService getArrangeService() {
		return arrangeService;
	}

	public void setArrangeService(ArrangeService arrangeService) {
		this.arrangeService = arrangeService;
	}

	@Override
	public String execute() throws Exception {
		this.arrange = this.arrangeService.findNewArrange();
		Map request = (Map) ActionContext.getContext().get("request");
		System.out.println(this.getMatterService().findAll());
		for (Arrange a : this.getArrangeService().findAll()) {
			System.out.println(a.getFromtime() + a.getBaoxiao());
		}
		request.put("list", this.getMatterService().findAll());

		return SUCCESS;
	}

}
