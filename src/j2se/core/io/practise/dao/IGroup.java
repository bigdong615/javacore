package j2se.core.io.practise.dao;

import j2se.core.io.practise.entity.Group;

import java.util.List;

public interface IGroup {
	public Group getGroupById (int id);
	public List<Group> getAllGroups();
}
