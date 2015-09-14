package org.bildit.hms.utility;

import java.util.List;

import org.bildit.hms.beans.User;

/**
 * @author Ognjen Mi�i� - user-related methods for implementation
 *
 */
public interface UserDao {
	List<User> getUsers();

	void addUserToDatabase(User u);

	void updateUser(User u);

	void removeUser(String username);
}
