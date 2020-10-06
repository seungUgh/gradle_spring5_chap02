package gradle_spring5_chap02.dl.assembler;

import gradle_spring5_chap02.dl.ChangePasswordService;
import gradle_spring5_chap02.dl.MemberDao;
import gradle_spring5_chap02.dl.MemberRegisterService;

public class Assembler {
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	//으지ㅗㄴ 객체를 변경하려면 조립기의 코드만 수정하면 됨
	public Assembler() {
		memberDao = new MemberDao();
		regSvc = new MemberRegisterService(memberDao);
		pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);
	}


	public MemberDao getMemberDao() {
		return memberDao;
	}


	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}


	public ChangePasswordService getChangePasswordSerivce() {
		return pwdSvc;
	}
	
	
}
