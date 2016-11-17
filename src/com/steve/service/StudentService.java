package com.steve.service;

import java.util.List;

import com.steve.entity.StudentEntity;
/**
 * Service Interface
 * ���ݷ����ӿ�
 * @author Ou Shaobin
 * @since 2016.09.24 14.53
 */
public interface StudentService {
	/**
	 * ���ѧ���б�
	 * @param addList ѧ��ʵ����б�
	 */
	public void addStudentList(List<StudentEntity> addList);
	
	/**
	 * ��������ѧ���ļ�¼
	 * @param student
	 */
	public void createStudent(StudentEntity student);
	
	/**
	 * ɾ������ѧ���ļ�¼
	 * @param studentNumber
	 */
	public void deleteStudent(String studentNumber);

	/**
	 * ��ȡĳ��ѧ���ļ�¼ [����ѧ��]
	 * @param student
	 * @return 
	 */
	public StudentEntity readStudent(String studentNumber);
	
	/**
	 * ����ĳ��ѧ��������
	 * @param student
	 */
	public void updateStudent(StudentEntity student);
	
	/**
	 * ��ѯ�������ݱ������еļ�¼
	 */
	public List<StudentEntity> queryAll();
}
