package a03_Date;

import java.util.Date;

class Person {
	private Date birthday;

	public void setBirthday(Date birthday) {
		this.birthday = new Date(birthday.getTime());
	}

	public Date getBirthday() {
		return new Date(birthday.getTime());
	}
}