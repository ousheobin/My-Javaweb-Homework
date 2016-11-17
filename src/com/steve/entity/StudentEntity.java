package com.steve.entity;

/**
 * StudentEntity ѧ������ʵ��
 * 
 * @author Ou Shaobin
 * @since 2016.09.24 15.15
 */
public class StudentEntity {

	private String studentNumber; // ѧ�ţ�������
	private String studentName; // ����
	private String gender; // �Ա�
	private String major;// רҵ
	private String grade;// �꼶
	private String className;// �༶
	private String avatar; // ͷ��

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentNumber=" + studentNumber
				+ ", studentName=" + studentName + ", gender=" + gender
				+ ", major=" + major + ", grade=" + grade + ", className="
				+ className + ", avatar=" + avatar + "]";
	}

}
