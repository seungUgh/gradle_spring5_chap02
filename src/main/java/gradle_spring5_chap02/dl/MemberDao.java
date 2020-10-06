package gradle_spring5_chap02.dl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	
	private static int nextId = 0;
	
	private Map<String, Member> map = new HashMap<>();
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
	
	public Collection<Member> selectAll(){
		return map.values();
	}
	
}
