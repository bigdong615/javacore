package j2se.core.io.practise.handle;

import java.util.List;

import j2se.core.io.practise.Impl.GroupService;
import j2se.core.io.practise.dao.IGroup;
import j2se.core.io.practise.entity.Group;

public class GroupManager {
	private IGroup dao = null;

	public GroupManager() {

		dao = new GroupService();
	}

	public Group getGroupById(int id) {
		// TODO Auto-generated method stub
		return dao.getGroupById(id);
	}

	public List<Group> getAllGroups() {
		// TODO Auto-generated method stub
		return dao.getAllGroups();
	}
}
