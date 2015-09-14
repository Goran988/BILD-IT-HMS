package org.bildit.hms.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bildit.hms.beans.User;
import org.bildit.hms.utility.MyConnection;
import org.bildit.hms.utility.UserDao;

/**
 * @author Ognjen Mišiæ - implementations of the userdao interface
 *
 */
public class UserData implements UserDao {

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List<User> listOfUsers = new ArrayList<>();
		String sqlGetAll = "SELECT * FROM user";

		try (Connection conn = MyConnection.connectToDb();
				PreparedStatement stmnt = conn.prepareStatement(sqlGetAll);
				ResultSet rs = stmnt.executeQuery()) {
			while (rs.next()) {
				User user = new User();
				// numbers represent the columns in the table
				user.setFirstName(rs.getString(2));
				user.setLastName(rs.getString(3));
				user.setGender(rs.getString(4).charAt(0));
				user.setIdNumber(rs.getString(5));
				user.setAge(rs.getShort(6));
				user.setRoomNumber(rs.getInt(7));

				// check if the database date entry isn't null
				java.sql.Date dateDb1 = rs.getDate(8);
				if (dateDb1 != null && !dateDb1.equals(null)) {
					user.setCheckInDate(convertDateFormat(dateDb1));
				}
				user.setUsername(rs.getString(9));
				user.setUserPassword(rs.getString(10));
				String bool = rs.getString(11);
				if (bool == "f") {
					user.setActiveGuest(false);
				} else {
					user.setActiveGuest(true);
				}

				// check if the database date entry isn't null
				java.sql.Date dateDb2 = rs.getDate(12);
				if (dateDb2 != null && !dateDb2.equals(null)) {
					user.setCheckOutDate(convertDateFormat(dateDb2));
				}
				user.setRole(rs.getByte(13));
				listOfUsers.add(user);
			}
		} catch (SQLException | NullPointerException | ParseException e) {
			e.printStackTrace();
		}
		return listOfUsers;
	}

	/**
	 * Method that parses the year-month-day format into day/month/year
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	private static Date convertDateFormat(Date date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String[] split = date.toString().split("-");
		String fixedDate = split[2] + "/" + split[1] + "/" + split[0];
		return sdf.parse(fixedDate);

	}

	@Override
	public void addUserToDatabase(User u) {
		// TODO Auto-generated method stub
		String sqlAdd = "INSERT INTO user (first_name, last_name, gender, personal_id, age, room_number, check_in_date, username, password, active, role) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		try (Connection conn = MyConnection.connectToDb();
				PreparedStatement stmnt = conn.prepareStatement(sqlAdd)) {
			stmnt.setString(1, u.getFirstName());
			stmnt.setString(2, u.getLastName());
			stmnt.setString(3, String.valueOf(u.getGender()));
			stmnt.setString(4, u.getIdNumber());
			stmnt.setInt(5, u.getAge());
			stmnt.setInt(6, u.getRoomNumber());
			stmnt.setDate(7, (java.sql.Date) u.getCheckInDate());
			stmnt.setString(8, u.getUsername());
			stmnt.setString(9, u.getUserPassword());
			if (u.isActiveGuest()) {
				stmnt.setString(10, "t");
			} else {
				stmnt.setString(10, "f");
			}
			stmnt.setInt(11, u.getRole());
			stmnt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		String sqlUpdate = "UPDATE user SET first_name=?, last_name=?, gender=?, age=?, room_number=?, username=?, password=?, active=?, role=?";
		try (Connection conn = MyConnection.connectToDb();
				PreparedStatement stmnt = conn.prepareStatement(sqlUpdate)) {
			stmnt.setString(1, u.getFirstName());
			stmnt.setString(2, u.getLastName());
			stmnt.setString(3, String.valueOf(u.getGender()));
			stmnt.setInt(4, u.getAge());
			stmnt.setInt(5, u.getRoomNumber());
			stmnt.setString(6, u.getUsername());
			stmnt.setString(7, u.getUserPassword());
			if (u.isActiveGuest()) {
				stmnt.setString(8, "t");
			} else {
				stmnt.setString(8, "f");
			}
			stmnt.setInt(9, u.getRole());
			stmnt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void removeUser(String username) {
		// TODO Auto-generated method stub
		String sqlDelete ="DELETE FROM user WHERE username=?";
		try (Connection conn = MyConnection.connectToDb(); PreparedStatement stmnt = conn.prepareStatement(sqlDelete)){
			stmnt.setString(1, username);
			stmnt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
